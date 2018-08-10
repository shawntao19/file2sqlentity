/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package real.xml.transform.dto;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 * 1.3.5 人脸参数添加 GET POST
 *
 * @author happy
 */
public class SetFaceParamCfg {

    private String version;
    private String xmlns;
    private String cardNo;
    private String cardReaderNo;
    private String facePicUrl;
    private String faceID;
    private String faceDataType;

    @XmlAttribute(name = "version")
    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @XmlAttribute(name = "xmlns")
    public String getXmlns() {
        return this.xmlns;
    }

    public void setXmlns(String xmlns) {
        this.xmlns = xmlns;
    }

    @XmlElement(name = "cardNo")
    public String getCardNo() {
        return this.cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    @XmlElement(name = "cardReaderNo")
    public String getCardReaderNo() {
        return this.cardReaderNo;
    }

    public void setCardReaderNo(String cardReaderNo) {
        this.cardReaderNo = cardReaderNo;
    }

    @XmlElement(name = "facePicUrl")
    public String getFacePicUrl() {
        return this.facePicUrl;
    }

    public void setFacePicUrl(String facePicUrl) {
        this.facePicUrl = facePicUrl;
    }

    @XmlElement(name = "faceID")
    public String getFaceID() {
        return this.faceID;
    }

    public void setFaceID(String faceID) {
        this.faceID = faceID;
    }

    @XmlElement(name = "faceDataType")
    public String getFaceDataType() {
        return this.faceDataType;
    }

    public void setFaceDataType(String faceDataType) {
        this.faceDataType = faceDataType;
    }
}
