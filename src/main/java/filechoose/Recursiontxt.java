/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filechoose;

import java.io.File;
import java.util.Calendar;

public class Recursiontxt {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //遍历C:\Program Files下及其子文件夹下所有.txt文件
        File srcfile = new File("D:\\happyDocuments\\Tencent Files\\172911061\\FileRecv");
        //调用递归函数
        listFile(srcfile);
    }

    public static void listFile(File f) {
        //获取文件夹下的所有文件(正确理解Java的文件:文件和文件夹)
        File[] files = f.listFiles();
        String s;
        for (File file : files) {
            //如果是目录则返回遍历函数
            if (file.exists() && file.isDirectory()) {
                listFile(file);
                //是文件,并且后缀.txt
            } else if ((s = file.getName()).endsWith(".txt")) {
                Calendar cal = Calendar.getInstance();
                long time = file.lastModified();
                cal.setTimeInMillis(time);
                System.out.println("文件名字:" + s + ",修改时间： " + cal.getTime().toLocaleString());
            }
        }
    }
}
