/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package real.xml.transform;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import lombok.extern.java.Log;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.Namespace;
import org.jdom.input.SAXBuilder;
import real.xml.transform.dto.FDLibBaseCfg;
import real.xml.transform.dto.JdomTransUtil;
import real.xml.transform.dto.SendFormat;

/**
 *
 * @author happy
 */
@Log
public class IsapiFDLib implements CommunicationTrans {

    public SendFormat creatLibs(FDLibBaseCfg tlbc) {
        SendFormat sf = new SendFormat();
        sf.setFunc(JdomTransUtil.functionPost);
        sf.setUrl(JdomTransUtil.functionPost + JdomTransUtil.urlFDLibs);
        MakeLibsXml mlx = new MakeLibsXml();
        sf.setSendXml(mlx.creatLibsXml(tlbc));
        return sf;
    }

    @Override
    public SendFormat getLibsSend() {
        SendFormat sf = new SendFormat();
        sf.setFunc(JdomTransUtil.functionGet);
        sf.setUrl(JdomTransUtil.functionGet + JdomTransUtil.urlFDLibs);
        return sf;
    }

    @Override
    public List<FDLibBaseCfg> getLibsResp(String inputXml) {
        final Namespace ns = Namespace.getNamespace("http://www.hikvision.com/ver20/XMLSchema");
        List<FDLibBaseCfg> flbcList = new ArrayList<>();
        try {
            String str = inputXml;
            Document document = str2XML(str);
            Element root = document.getRootElement();

            List FDLibBaseCfgListElement = root.getChildren("FDLibBaseCfg", ns);//将根节点下的所有子节点放入List中  
            System.out.println(FDLibBaseCfgListElement.size());
            for (int i = 0; i < FDLibBaseCfgListElement.size(); i++) {
                System.out.println("---------------------------");
                FDLibBaseCfg flbc = new FDLibBaseCfg();
                Element FDLibBaseCfgElement = (Element) FDLibBaseCfgListElement.get(i);//取得节点实例 
                flbc.setId(FDLibBaseCfgElement.getChildText("id", ns));
                flbc.setName(FDLibBaseCfgElement.getChildText("name", ns));
                flbc.setFDID(FDLibBaseCfgElement.getChildText("FDID", ns));
                flbc.setFaceLibType(FDLibBaseCfgElement.getChildText("faceLibType", ns));
                flbcList.add(flbc);
            }

        } catch (Exception ex) {
            Logger.getLogger(IsapiFDLib.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flbcList;
    }

    @Override
    public SendFormat deleteLibsResp(String FDID) {
        SendFormat sf = new SendFormat();
        sf.setFunc(JdomTransUtil.functionDelete);
        sf.setUrl(JdomTransUtil.functionDelete + JdomTransUtil.urlFDLibs + "/" + FDID);
        return sf;
    }

    public static Document str2XML(String string) throws Exception {

        SAXBuilder buider = new SAXBuilder();

        Document document = buider.build(new StringReader(string));

        return document;

    }

    public SendFormat changeLibs(FDLibBaseCfg tlbc) {
        SendFormat sf = new SendFormat();
        sf.setFunc(JdomTransUtil.functionPut);
        sf.setUrl(JdomTransUtil.functionPut + JdomTransUtil.urlFDLibs + "/" + tlbc.getFDID());
        MakeLibsXml mlx = new MakeLibsXml();
        sf.setSendXml(mlx.changeLibsXml(tlbc));
        return sf;

    }

}
