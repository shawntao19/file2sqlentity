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
public class MakeLibsXml {

    public String creatLibsXml(FDLibBaseCfg flbc) {
        Element root = new Element("CreateFDLibList");
        //根节点添加到文档中；      
        Document Doc = new Document(root);
        //   此处 for 循环可替换成 遍历 数据库表的结果集操作;      
        // 创建子节点 company;  
        Element elements = new Element("CreateFDLib");

// new Element("company_name")中的 "company_name"   
//替换成表中相应字段，setText("name")中 "name 替换成表中记录值;   
        elements.addContent(new Element("id").setText(flbc.getId()));
        elements.addContent(new Element("name").setText(flbc.getName()));
        elements.addContent(new Element("thresholdValue").setText(flbc.getThresholdValue()));

        // 给父节点list添加company子节点;     
        root.addContent(elements);
        XMLOutputter XMLOut = new XMLOutputter();
        // 输出company_list.xml文件；     
        return XMLOut.outputString(Doc);
    }

    public String changeLibsXml(FDLibBaseCfg flbc) {
        Element root = new Element("FDLibBaseCfg");
        //根节点添加到文档中；      
        Document Doc = new Document(root);
        //   此处 for 循环可替换成 遍历 数据库表的结果集操作;      
        // 创建子节点 company;  

// new Element("company_name")中的 "company_name"   
//替换成表中相应字段，setText("name")中 "name 替换成表中记录值;   
        root.addContent(new Element("id").setText(flbc.getId()));
        root.addContent(new Element("name").setText(flbc.getName()));
        root.addContent(new Element("FDID").setText(flbc.getFDID()));
        root.addContent(new Element("thresholdValue").setText(flbc.getThresholdValue()));

        // 给父节点list添加company子节点;     
        XMLOutputter XMLOut = new XMLOutputter();
        // 输出company_list.xml文件；     
        return XMLOut.outputString(Doc);
    }

}
