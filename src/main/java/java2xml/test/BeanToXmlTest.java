/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2xml.test;

import com.sun.xml.internal.bind.marshaller.CharacterEscapeHandler;
import java2xml.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class BeanToXmlTest {

    /**
     * java对象转换为xml文件
     *
     * @param xmlPath xml文件路径
     * @param load java对象.Class
     * @return xml文件的String
     * @throws JAXBException
     */
    public static String beanToXml(Object obj, Class<?> load) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(load);
        Marshaller marshaller = context.createMarshaller();
//        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//        marshaller.setProperty(Marshaller.JAXB_ENCODING, "utf-8");
        // xml格式
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        // 去掉生成xml的默认报文头
        marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
        // 不进行转义字符的处理
//        marshaller.setProperty(CharacterEscapeHandler.class.getName(), new CharacterEscapeHandler() {
//            public void escape(char[] ch, int start, int length, boolean isAttVal, Writer writer) throws IOException {
//                writer.write(ch, start, length);
//            }
//        });
//        marshaller.setListener(new MarshallerListener());  //默认会将bean中属性为null的属性过滤掉, 这一条不过滤
        StringWriter writer = new StringWriter();
        marshaller.marshal(obj, writer);
        return writer.toString();
    }

    public static void main(String[] args) throws JAXBException, IOException {
//        List<String> hobby = new ArrayList<>();
//        hobby.add("篮球");
//        hobby.add("音乐");
//        hobby.add("乒乓球");

        List<FDLibBaseCfg> studentList = new ArrayList<>();

        FDLibBaseCfg st = new FDLibBaseCfg("张三", "男", "尖子班", "尖子班2");
        studentList.add(st);
        FDLibBaseCfg st1 = new FDLibBaseCfg("李四", "男", "10002", "普通班");
        studentList.add(st1);
        FDLibBaseCfg st2 = new FDLibBaseCfg("莉莉", "女", "10003", "普通班");
        studentList.add(st2);

        FDLibBaseCfgList students = new FDLibBaseCfgList();
        students.setFDLibBaseCfg(studentList);
        String str = BeanToXmlTest.beanToXml(students, FDLibBaseCfgList.class);

        //写入到xml文件中
        String xmlPath = "D:/testConfig.xml";
        BufferedWriter bfw = new BufferedWriter(new FileWriter(new File(xmlPath)));
        bfw.write(str);
        bfw.close();
    }
}
