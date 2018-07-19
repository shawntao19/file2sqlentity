/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readline.bingo;

import readline.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeConfig;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadFileLine2Sql {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        // TODO Auto-generated method stub
        String path = "D:\\happyDocuments\\Tencent Files\\172911061\\FileRecv\\cheshi.txt";
        Lev1AllRealTime lart = new Lev1AllRealTime();
//        List<Lev1AllRealTime> tlist = new ArrayList<>();
        List<Lev1AllRealTime> tlist = getFileAndSave(path, lart);
        System.out.println("***size:" + tlist.size() + ",tlist:" + JSON.toJSONString(tlist));
    }

    //line2 分析专用
    public static SubClass findSpiltLine2(String inputString) {
        List<String> nameList = new ArrayList<String>();
        String[] aa = inputString.split("\\|");
        SubClass sc = new SubClass();
        for (int i = 0; i < aa.length; i++) {
            if (aa[i].length() > 5) {
                String[] bb = aa[i].split("\\.");
                sc.setSqlName(bb[0]);
                String outString = findSpiltDot(bb[1]);
                nameList.add(outString);
            }
        }
        sc.setStringList(nameList);
        return sc;
    }

    //大余4行的处理
    public static List<String> findSpiltUpThan4(String inputString) {
        List<String> dataList = new ArrayList<String>();
        String[] aa = inputString.split("\\|");
        for (int i = 0; i < aa.length; i++) {
            if (aa[i].length() > 5) {
                dataList.add(aa[i].trim());
            }
        }
        return dataList;
    }

    // .分隔字段
    public static String findSpiltDot(String inputString) {
//        System.out.println("findSpiltDot***inputString:" + inputString);
        String[] cc = inputString.split("_");
        for (int i = 0; i < cc.length; i++) {
            if (i > 0) {
                cc[i] = UtilFile2Sql.doFirstUpper(cc[i]);
//                System.out.println("findSpilt--" + cc[i]);
            }
        }
        StringBuffer s = new StringBuffer();
        for (String s1 : cc) {
            s.append(s1);
        }
//        System.out.println("***///***:" + s.toString());
        return s.toString().trim();
    }

    public static <T> List<T> getFileAndSave(String filePath, T t) throws FileNotFoundException, UnsupportedEncodingException {
        File file = new File(filePath);
        FileInputStream fis = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fis, "UTF-8"); //指定以UTF-8编码读入
        BufferedReader reader = new BufferedReader(isr);
        String tempString = null;
        int line = 1;
        SubClass scOut = null;
        List<T> tList = new ArrayList<T>();

        try {
//            System.out.println("以行为单位读取文件内容，一次读一整行：");
            while ((tempString = reader.readLine()) != null) {
//                System.out.println("Line" + line + ":" + tempString);
                if (line == 2) {
                    scOut = findSpiltLine2(tempString);
//                    System.out.println("***:" + JSON.toJSONString(scOut));
                } else if (tempString.startsWith("+--")) {

                } else {
                    List<String> dataList = findSpiltUpThan4(tempString);
//                    System.out.println("***:" + JSON.toJSONString(dataList));
                    Class clazzSuper = t.getClass();
                    T tsub = (T) clazzSuper.newInstance();
                    t = UtilFile2Sql.getFieldNew(tsub, scOut.getStringList(), dataList);
//                    System.out.println("***lart:" + JSON.toJSONString(t));
                    tList.add(t);
                }
                line++;
            }
            reader.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(ReadFileLine2Sql.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ReadFileLine2Sql.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchFieldException ex) {
            Logger.getLogger(ReadFileLine2Sql.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(ReadFileLine2Sql.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReadFileLine2Sql.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
//            System.out.println("********tList" + JSON.toJSONString(tList));
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
        return tList;
    }
}
