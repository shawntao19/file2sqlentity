/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author happy
 */
public class UtilFunction {

    public static String path = "D:\\happyDocuments\\NetBeansProjects\\examTestProject\\src\\main\\java\\jdom\\";

    public static String getPath90(Class clazz) {
        String path = System.getProperty("user.dir") + "/" + (clazz.getPackage().getName()).replaceAll("//.", "/") + "/";
        return path;
    }

}
