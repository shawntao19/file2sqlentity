/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readline.info;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/**
 *
 * @author happy
 */
public class UtilFile2Sql {

    static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     * 输入字段列表，产生entity
     *
     * @param <T> entity类
     * @param t
     * @param nameList 名字list
     * @param dataList 数据list
     * @return
     * @throws IllegalArgumentException
     * @throws IllegalAccessException
     * @throws NoSuchFieldException
     */
    public static <T> T getFieldNew(T t, List<String> nameList, List<String> dataList) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InstantiationException {
        //获得类
        Class clazzSuper = t.getClass();
        T tsub=(T) clazzSuper.newInstance();
        Class clazz = tsub.getClass();
        // 获取实体类的所有属性信息，返回Field数组
        Field[] fields = clazz.getDeclaredFields();
        Field declaredField = null;
        for (int i = 0; i < nameList.size(); i++) {
//            String methodName = "set" + doFirstUpper(nameList.get(i));
            String methodName = nameList.get(i);
            declaredField = clazz.getDeclaredField(methodName);
            if (declaredField != null) {
                declaredField.setAccessible(true);
                String dataString = dataList.get(i);
//                System.out.println(declaredField.getType().getName());
                if (declaredField.getType() == String.class) {
//                    System.out.println("String:" + dataString + ",name:" + declaredField.getName());
                    declaredField.set(t, dataString);
                } else if (declaredField.getType() == Date.class) {
                    try {
                        //                    System.out.println("Date");
                        declaredField.set(t, sdf.parse(dataString));
                    } catch (ParseException ex) {
                        Logger.getLogger(UtilFile2Sql.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else if (declaredField.getType() == Double.class) {
//                    System.out.println("Double");
                    declaredField.set(t, Double.valueOf(dataString));
                } else if (declaredField.getType() == Integer.class) {
//                    System.out.println("Integer");
                    declaredField.set(t, Integer.valueOf(dataString));
                } else if (declaredField.getType() == Long.class) {
//                    System.out.println("Long");
                    declaredField.set(t, Long.valueOf(dataString));
                }
            }
        }

        return t;
    }

    /**
     * 首字母转大写
     *
     * @param str
     * @return
     */
    public static String doFirstUpper(String str) {

        if (str != null && str != "") {
            str = str.substring(0, 1).toUpperCase() + str.substring(1);
        }
        return str;
    }

}
