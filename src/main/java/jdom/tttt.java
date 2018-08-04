/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdom;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.Namespace;
import org.jdom2.input.SAXBuilder;

/**
 *
 * @author happy
 */
public class tttt {

    public static void main(String[] args) throws JDOMException, IOException {
        final Namespace ns = Namespace.getNamespace("http://www.hikvision.com/ver20/XMLSchema");
        String path = "D:\\happyDocuments\\NetBeansProjects\\examTestProject\\src\\main\\java\\jdom\\";

        //Get the JDOM document
        org.jdom2.Document doc = useSAXParser(path + "FaceList.xml");

        //Get list of Employee element
        Element rootElement = doc.getRootElement();
        List<Element> listEmpElement = rootElement.getChildren("FDLibBaseCfg", ns);
        System.out.println("jdom.tttt.main():" + listEmpElement.size());
        for (Element empElement : listEmpElement) {

            //change the name to BLOCK letters
            String name = empElement.getChildText("name",ns);
            System.out.println("jdom.tttt.main():"+name);
        }
    }
    //Get JDOM document from SAX Parser

    private static org.jdom2.Document useSAXParser(String fileName) throws JDOMException,
            IOException {
        SAXBuilder saxBuilder = new SAXBuilder();
        return saxBuilder.build(new File(fileName));
    }
}
