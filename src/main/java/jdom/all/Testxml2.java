/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdom.all;

import java.io.File;
import java.io.FileWriter;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.Namespace;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;
import util.UtilFunction;

/**
 *
 * @author happy
 */
public class Testxml2 {

    public static void Create() {
        Student sd1 = new Student(1, "Jack", 14);
        Student sd2 = new Student(2, "Mike", 15);
        Student sd3 = new Student(3, "Paul", 15);

        // new a xml file
        Document docJdom = new Document();

        //Namespace(not must, it's optional, to indicate elements with same name
        Namespace np1 = Namespace.getNamespace("www.google.com");
        Namespace np2 = Namespace.getNamespace("www.firefox.com");

        // new a new root node
        Element eRoot = new Element("StudentRecords");
        docJdom.addContent(eRoot);

        //add sd1 node
        Element nodeSd1 = new Element("Student", np1);
        nodeSd1.setNamespace(np1);
        //id
        Element nodeId1 = new Element("id");
        nodeId1.addContent("" + sd1.getId());
        //name
        Element nodeName1 = new Element("name");
        nodeName1.addContent("" + sd1.getName());
        //age
        Element nodeAge1 = new Element("age");
        nodeAge1.addContent("" + sd1.getAge());

        nodeSd1.addContent(nodeId1);
        nodeSd1.addContent(nodeName1);
        nodeSd1.addContent(nodeAge1);
        eRoot.addContent(nodeSd1);

        //add sd2 node
        Element nodeSd2 = new Element("Student", np1);
        nodeSd2.setNamespace(np1);
        //id
        Element nodeId2 = new Element("id");
        nodeId2.addContent("" + sd2.getId());
        //name
        Element nodeName2 = new Element("name");
        nodeName2.addContent("" + sd2.getName());
        //age
        Element nodeAge2 = new Element("age");
        nodeAge2.addContent("" + sd2.getAge());

        nodeSd2.addContent(nodeId2);
        nodeSd2.addContent(nodeName2);
        nodeSd2.addContent(nodeAge2);
        eRoot.addContent(nodeSd2);

        //add sd3 node
        Element nodeSd3 = new Element("Student", np2);
        nodeSd3.setNamespace(np2);
        //id
        Element nodeId3 = new Element("id");
        nodeId3.addContent("" + sd3.getId());
        //name
        Element nodeName3 = new Element("name");
        nodeName3.addContent("" + sd3.getName());
        //age
        Element nodeAge3 = new Element("age");
        nodeAge3.addContent("" + sd3.getAge());

        nodeSd3.addContent(nodeId3);
        nodeSd3.addContent(nodeName3);
        nodeSd3.addContent(nodeAge3);
        eRoot.addContent(nodeSd3);

        OutputXML(docJdom, UtilFunction.path + "\\all\\02.xml");
        System.out.println("Done!");
    }

    private static void OutputXML(Document dXml, String sFilenm) {
        XMLOutputter xot = new XMLOutputter();
        xot.setFormat(Format.getPrettyFormat());
        try {
            FileWriter fwXML = new FileWriter(sFilenm);
            xot.output(dXml, fwXML);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
//        Create();
        Student sd1 = new Student(1, "Jack", 14);
        Student sd2 = new Student(2, "Mike", 15);
        Student sd3 = new Student(3, "Paul", 15);

        // new a xml file
        Document docJdom = new Document();

        //Namespace(not must, it's optional, to indicate elements with same name
        Namespace np1 = Namespace.getNamespace("ggl", "www.google.com");
        Namespace np2 = Namespace.getNamespace("fox", "www.firefox.com");

        // new a new root node
        Element eRoot = new Element("StudentRecords");
        docJdom.addContent(eRoot);

        eRoot.addContent(sd1.buildElement(np1));
        eRoot.addContent(sd2.buildElement(np1));
        eRoot.addContent(sd3.buildElement(np2));

        String pathoutHead = System.getProperty("user.dir") + File.separator;
        System.out.println("jdom.all.Testxml2.main():" + pathoutHead);
        String pathout = pathoutHead + "src\\main\\java\\jdom\\all\\06.xml";
        System.out.println("jdom.all.Testxml2.main():" + pathout);
        XMLExport.OutputXML(docJdom, pathout);

    }
}
