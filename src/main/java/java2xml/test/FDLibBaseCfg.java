/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2xml.test;

import javax.xml.bind.annotation.XmlElement;

public class FDLibBaseCfg {

    private String id;
    private String FDID;
    private String name;
    private String faceLibType;

    public FDLibBaseCfg(String id, String FDID, String name, String faceLibType) {
        this.id = id;
        this.FDID = FDID;
        this.name = name;
        this.faceLibType = faceLibType;
    }

    @XmlElement(name = "id")
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @XmlElement(name = "FDID")
    public String getFDID() {
        return this.FDID;
    }

    public void setFDID(String FDID) {
        this.FDID = FDID;
    }

    @XmlElement(name = "name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name = "faceLibType")
    public String getFaceLibType() {
        return this.faceLibType;
    }

    public void setFaceLibType(String faceLibType) {
        this.faceLibType = faceLibType;
    }
}
