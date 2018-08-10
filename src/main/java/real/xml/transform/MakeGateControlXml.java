/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package real.xml.transform;

import java.util.ArrayList;
import java.util.List;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.XMLOutputter;
import real.xml.transform.dto.FDLibBaseCfg;

/**
 *
 * @author happy
 */
public class MakeGateControlXml {

    /**
     * 1.4.13卡参数
     *
     * @param flbc
     * @return
     */
    public String setGateCardXml(FDLibBaseCfg flbc) {
        // 输出company_list.xml文件；     
        Element root = new Element("CardCfg");
        //根节点添加到文档中；      
        Document Doc = new Document(root);
        //   此处 for 循环可替换成 遍历 数据库表的结果集操作;      
        // 创建子节点 company;  

// new Element("company_name")中的 "company_name"   
//替换成表中相应字段，setText("name")中 "name 替换成表中记录值;   
        root.addContent(new Element("valid").setText("1"));
        root.addContent(new Element("cardType").setText("1"));
//        root.addContent(new Element("leaderCardEnabled").setText(flbc.getFDID()));
        root.addContent(new Element("validTimeEnabled").setText("false"));
        root.addContent(new Element("password").setText("MTIzNDU2"));//123456
        root.addContent(new Element("maxSwipeTime").setText("0"));
//        root.addContent(new Element("swipeTime").setText(flbc.getFDID()));
        root.addContent(new Element("groupNo").setText(flbc.getThresholdValue()));
        root.addContent(new Element("employeeNo").setText(flbc.getFDID()));
        root.addContent(new Element("name").setText(flbc.getThresholdValue()));
        root.addContent(new Element("departmentNo").setText(flbc.getFDID()));
        root.addContent(new Element("schedulePlanNo").setText(flbc.getThresholdValue()));
        root.addContent(new Element("schedulePlanType").setText(flbc.getFDID()));

        // 给父节点list添加company子节点;     
        XMLOutputter XMLOut = new XMLOutputter();
        // 输出company_list.xml文件；     
        return XMLOut.outputString(Doc);
    }

    /**
     * 1,open 2,close 3,ALWAYSOPEN 4,ALWAYSCLOSE
     *
     * @param flag
     * @return
     */
    public String changeGateStateXml(int flag) {
        String urlHead = "<?xml version=\"1.0\" encoding=\"GB2312\"?>\n"
                + "<PPVSPMessage>\n"
                + "<Version>2.5</Version>\n"
                + "<Sequence>1</Sequence>\n"
                + "<Method>CONTROL</Method>\n"
                + "<CommandType>REQUEST</CommandType>\n"
                + "<Command>GATECONTROL</Command>\n"
                + "<Params>\n"
                + "<DoorNo>1</DoorNo>\n"
                + "<Cmd>";
        String urlTail = "</Cmd>\n"
                + "</Params>\n"
                + "</PPVSPMessage>";

        String urlCenter = "OPEN";
        if (flag == 1) {

        } else if (flag == 2) {
            urlCenter = "CLOSE";
        } else if (flag == 3) {
            urlCenter = "ALWAYSOPEN";
        } else if (flag == 4) {
            urlCenter = "ALWAYSCLOSE";
        }
        // 输出company_list.xml文件；     
        return urlHead + urlCenter + urlTail;
    }

}
