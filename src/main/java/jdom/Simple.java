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
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;

public class Simple {

    public static void JDomParse() throws FileNotFoundException, JDOMException, IOException {
        SAXBuilder sb = new SAXBuilder();//建立构造器  
        String path = "D:\\happyDocuments\\NetBeansProjects\\examTestProject\\src\\main\\java\\jdom\\Simple.xml";
        Document doc = sb.build(new FileInputStream(path));//读入指定文件  
        Element books = doc.getRootElement();
        List booklist = books.getChildren("book");
        for (Iterator iter = booklist.iterator(); iter.hasNext();) {
            Element book = (Element) iter.next();
            String email = book.getAttributeValue("email");
            System.out.println(email);
            String name = book.getChildTextTrim("name");
            System.out.println(name);
            String FDID = book.getChildTextTrim("FDID");
            System.out.println(FDID);
            String faceLibType = book.getChildTextTrim("faceLibType");
            System.out.println(faceLibType);
            book.getChild("name").setText("alterrjzjh");
        }
//            XMLOutputter outputter = new XMLOutputter();
//            outputter.output(doc, new FileOutputStream(xmlpath));
    }

    public static void JDomParse2FL() throws FileNotFoundException, JDOMException, IOException {
        SAXBuilder sb = new SAXBuilder();//建立构造器  
        String path = "D:\\happyDocuments\\NetBeansProjects\\examTestProject\\src\\main\\java\\jdom\\FaceList.xml";
        Document doc = sb.build(new FileInputStream(path));//读入指定文件  
        Element books = doc.getRootElement();
        List booklist = books.getChildren("FDLibBaseCfg");
        for (Iterator iter = booklist.iterator(); iter.hasNext();) {
            Element book = (Element) iter.next();
//            String email = book.getAttributeValue("email");
//            System.out.println(email);
            String name = book.getChildTextTrim("id");
            System.out.println(name);
            String FDID = book.getChildTextTrim("FDID");
            System.out.println(FDID);
//            book.getChild("name").setText("alterrjzjh");
        }
//            XMLOutputter outputter = new XMLOutputter();
//            outputter.output(doc, new FileOutputStream(xmlpath));
    }

    public static void JDomParse2FL3L() throws FileNotFoundException, JDOMException, IOException {
        SAXBuilder sb = new SAXBuilder();//建立构造器  
        String path = "D:\\happyDocuments\\NetBeansProjects\\examTestProject\\src\\main\\java\\jdom\\FaceList.xml";
        Document doc = sb.build(new FileInputStream(path));//读入指定文件  
        System.out.println("***" + doc.toString());
        Element books = doc.getRootElement();
        System.out.println("***" + doc.getContent());
        System.out.println(books.getNamespace());
        System.out.println(books.getNamespaceURI());
        System.out.println(books.getNamespacePrefix());

        List booklist = books.getChildren();
        for (Iterator iter = booklist.iterator(); iter.hasNext();) {
            Element book = (Element) iter.next();
//            String email = book.getAttributeValue("email");
//            System.out.println(email);
//            String name = book.getContent();
//            System.out.println(name);
            String FDID = book.getChildTextTrim("FDID");
            System.out.println(FDID);
//            book.getChild("name").setText("alterrjzjh");
        }
//            XMLOutputter outputter = new XMLOutputter();
//            outputter.output(doc, new FileOutputStream(xmlpath));
    }

    public static void main(String[] args) {
        try {
            JDomParse2FL3L();
        } catch (JDOMException ex) {
            Logger.getLogger(Simple.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Simple.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
