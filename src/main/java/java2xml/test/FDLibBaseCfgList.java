/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2xml.test;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "FDLibBaseCfgList")
public class FDLibBaseCfgList {

    public List<FDLibBaseCfg> FDLibBaseCfgs;

    @XmlElement(name = "FDLibBaseCfg")
    public List<FDLibBaseCfg> getFDLibBaseCfg() {
        return this.FDLibBaseCfgs;
    }

    public void setFDLibBaseCfg(List<FDLibBaseCfg> FDLibBaseCfgs) {
        this.FDLibBaseCfgs = FDLibBaseCfgs;
    }
}
