/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package real.xml.transform;

import com.alibaba.fastjson.JSON;
import real.xml.transform.dto.FDLibBaseCfg;

/**
 *
 * @author happy
 */
public class TestMain {

    public static void getLibsResp() {
        IsapiFDLib is = new IsapiFDLib();
        String inputString = "<FDLibBaseCfgList version=\"1.0\" xmlns=\"http://www.hikvision.com/ver20/XMLSchema\">\n"
                + "    <FDLibBaseCfg version=\"1.0\" xmlns=\"http://www.hikvision.com/ver20/XMLSchema\">\n"
                + "        <id>1</id>\n"
                + "        <FDID>48B29D9DC7C54BEE984E606B9B3EB390</FDID>\n"
                + "        <name>11</name>\n"
                + "        <faceLibType>ordinary</faceLibType>\n"
                + "    </FDLibBaseCfg>\n"
                + "    <FDLibBaseCfg version=\"1.0\" xmlns=\"http://www.hikvision.com/ver20/XMLSchema\">\n"
                + "        <id>2</id>\n"
                + "        <FDID>1FF2E140D94447A8BE196A756E3A5C58</FDID>\n"
                + "        <name>no101x</name>\n"
                + "        <faceLibType>ordinary</faceLibType>\n"
                + "    </FDLibBaseCfg>\n"
                + "</FDLibBaseCfgList>";

        System.out.println("main():" + JSON.toJSONString(is.getLibsResp(inputString)));
    }

    /**
     * 创建 lib 库的xml
     *
     * @param args
     */
    public static void creatLibs() {
        MakeLibsXml mx = new MakeLibsXml();
        FDLibBaseCfg fc = new FDLibBaseCfg();
        fc.setId("1");
        fc.setName("zhangxiaomao1");
        fc.setThresholdValue("80");
        System.out.println("main():" + mx.creatLibsXml(fc));
    }

    /**
     * 修改 lib 库的xml
     *
     * @param args
     */
    public static void changeLibs() {
        MakeLibsXml mx = new MakeLibsXml();
        FDLibBaseCfg fc = new FDLibBaseCfg();
        fc.setId("1");
        fc.setName("zhangxiaomao1");
        fc.setThresholdValue("80");
        fc.setFDID("1FF2E140D94447A8BE196A756E3A5C58");
        System.out.println("main():" + mx.changeLibsXml(fc));
    }

    public static void main(String[] args) {
        changeLibs();
    }

}
