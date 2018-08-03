/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdom;

/**
 *
 * @author happy
 */
import java.io.FileInputStream;
import java.util.List;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.Namespace;
import org.jdom.input.SAXBuilder;

public class MyJdomFL {

//    public static void main(String[] args) throws Exception {
//        SAXBuilder sb = new SAXBuilder();//建立构造器  
//        String path = "D:\\happyDocuments\\NetBeansProjects\\examTestProject\\src\\main\\java\\jdom\\FaceList.xml";
//        Document doc = sb.build(new FileInputStream(path));//读入指定文件  
//        Element root = doc.getRootElement();//获得根节点  
//        List list = root.getChildren();//将根节点下的所有子节点放入List中  
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println("---------------------------");
//            Element item = (Element) list.get(i);//取得节点实例  
//            String id = item.getValue();//取得属性值  
//            System.out.println("id-->" + id);
//
//        }
//        System.out.println(root.getChild("FDID"));
////          System.out.println("---------------------------"+root.getChild("FDID").getValue());
//    }
    public static void main(String[] args) throws Exception {
        SAXBuilder sb = new SAXBuilder();//建立构造器  
        String path = "D:\\happyDocuments\\NetBeansProjects\\examTestProject\\src\\main\\java\\jdom\\FaceList.xml";
        Document doc = sb.build(new FileInputStream(path));//读入指定文件  
        Element root = doc.getRootElement();//获得根节点  
//        root
        List FDLibBaseCfgList = root.getChildren("FDLibBaseCfg");//将根节点下的所有子节点放入List中  
         System.out.println(FDLibBaseCfgList.size());
        for (int i = 0; i < FDLibBaseCfgList.size(); i++) {
            System.out.println("---------------------------");
            Element FDLibBaseCfg = (Element) FDLibBaseCfgList.get(i);//取得节点实例  
            String id=FDLibBaseCfg.getAttributeValue("id");
//            String id = item.getValue();//取得属性值  
            System.out.println("id-->" + id);

//            System.out.println(item.getAttributeValue("FDID"));

        }

//        System.out.println("**" + root.getValue());
//        System.out.println(root.getAttribute("xmlns").getValue());
//        System.out.println(root.getAttribute("id").getValue());
//        System.out.println(root.getChild("FDID"));
//        System.out.println(root.getChild("FDLibBaseCfg").getChildText("FDID"));
//          System.out.println("---------------------------"+root.getChild("FDID").getValue());
    }

}
