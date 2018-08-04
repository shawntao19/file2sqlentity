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
import java.io.FileOutputStream;
import java.util.List;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.Namespace;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;

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
        final Namespace ns = Namespace.getNamespace("http://www.hikvision.com/ver20/XMLSchema");
        SAXBuilder sb = new SAXBuilder();//建立构造器  
        String path = "D:\\happyDocuments\\NetBeansProjects\\examTestProject\\src\\main\\java\\jdom\\FaceList.xml";
        String path2 = "D:\\happyDocuments\\NetBeansProjects\\examTestProject\\src\\main\\java\\jdom\\FaceList2222.xml";
        Document doc = sb.build(new FileInputStream(path));//读入指定文件  
        Element root = doc.getRootElement();//获得根节点  
//        root
        List FDLibBaseCfgList = root.getChildren("FDLibBaseCfg", ns);//将根节点下的所有子节点放入List中  
        System.out.println(FDLibBaseCfgList.size());
        for (int i = 0; i < FDLibBaseCfgList.size(); i++) {
            System.out.println("---------------------------");
//             String name = FDLibBaseCfgList.get(i).getChildText("name",ns);
//            System.out.println("jdom.tttt.main():"+name);
            Element FDLibBaseCfg = (Element) FDLibBaseCfgList.get(i);//取得节点实例  
            String name = FDLibBaseCfg.getChildText("name", ns);
//            Element e1=new Element("name2");
            FDLibBaseCfg.setAttribute("name", "112332131");
            Element ne = FDLibBaseCfg.getChild("name", ns);
            ne.setName("name222").setText("123132");
////            String name = item.getValue();//取得属性值  
            name = FDLibBaseCfg.getChildText("name", ns);
            System.out.println("name-->" + name);

//            System.out.println(item.getAttributeValue("FDID"));
        }

//        System.out.println("**" + root.getValue());
//        System.out.println(root.getAttribute("xmlns").getValue());
//        System.out.println(root.getAttribute("id").getValue());
//        System.out.println(root.getChild("FDID"));
//        System.out.println(root.getChild("FDLibBaseCfg").getChildText("FDID"));
        System.out.println("---------------------------" + doc.toString());
        XMLOutputter XMLOut = new XMLOutputter();
        XMLOut.output(doc, new FileOutputStream(path2));
    }

}
