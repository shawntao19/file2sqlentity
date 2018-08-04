/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdom.test;

/**
 *
 * @author happy
 */
import jdom.*;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import org.jdom.Attribute;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.Namespace;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;
//import org.jdom2.output.Format;

public class MyJdomGoodDetail {

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
        final Namespace ns = Namespace.getNamespace("http://www.hikvision.com/ver20/XMLSchema");
        SAXBuilder sb = new SAXBuilder();//建立构造器  
        String path = "D:\\happyDocuments\\NetBeansProjects\\examTestProject\\src\\main\\java\\jdom\\test\\Detail.xml";
        String path2 = "D:\\happyDocuments\\NetBeansProjects\\examTestProject\\src\\main\\java\\jdom\\test\\Detail222.xml";
        Document doc = sb.build(new FileInputStream(path));//读入指定文件  
        Element root = doc.getRootElement();//获得根节点  
//        root.setNamespace(ns);
//        System.out.println("root***\n" + element2String(root));
        //所有节点
        List CreateFDLibList = root.getChildren("CreateFDLibList", ns);//将根节点下的所有子节点放入List中  
        Element CreateFDLibSingle = (Element) CreateFDLibList.get(0);
        System.out.println("CreateFDLibSingle***\n" + element2String(CreateFDLibSingle));
        Element CreateFDLibSub = CreateFDLibSingle.getChild("CreateFDLib", ns);
        System.out.println("CreateFDLibSub***\n" + element2String(CreateFDLibSub));
        System.out.println("size:" + CreateFDLibList.size());

        Element nameE = CreateFDLibSub.getChild("name", ns);
//         Element nameE = CreateFDLibSub.getChild("name");
        System.out.println("nameE\n" + element2String(nameE));
        String minValue = nameE.getAttributeValue("min", ns);
//        String minValue = nameE.getAttributeValue("min");
        System.out.println("minValue:" + minValue);
        System.out.println("---------------------------");
        XMLOutputter XMLOut = new XMLOutputter();
        XMLOut.output(doc, new FileOutputStream(path2));
        XMLOut.setFormat(Format.getPrettyFormat().setEncoding("UTF-8"));
        ByteArrayOutputStream bo = new ByteArrayOutputStream();

        XMLOut.output(doc, bo);

        String xmlStr = bo.toString("UTF-8");
    }

    public static String element2String(Element e) throws IOException {
        XMLOutputter XMLOut = new XMLOutputter();
        XMLOut.setFormat(Format.getPrettyFormat().setEncoding("UTF-8"));
        ByteArrayOutputStream bo = new ByteArrayOutputStream();

        XMLOut.output(e, bo);

        String xmlStr = bo.toString("UTF-8");
        return xmlStr;
    }

}
