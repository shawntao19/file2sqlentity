/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdom.all;

import java.io.FileWriter;
import org.jdom.Document;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

/**
 *
 * @author happy
 */
public class XMLExport {

    public static void OutputXML(Document dXml, String sFilenm) {
        XMLOutputter xot = new XMLOutputter();
        xot.setFormat(Format.getPrettyFormat());
        try {
            FileWriter fwXML = new FileWriter(sFilenm);
            xot.output(dXml, fwXML);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
