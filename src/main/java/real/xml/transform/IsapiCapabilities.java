/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package real.xml.transform;

import java.util.List;
import real.xml.transform.dto.FDLibBaseCfg;
import real.xml.transform.dto.JdomTransUtil;
import real.xml.transform.dto.SendFormat;

/**
 *
 * @author happy
 */
public class IsapiCapabilities implements CommunicationTrans {

    public void getCapabilitiesResp(String inputXml) {
    }

    @Override
    public <T> List<T> getLibsResp(String inputXml) {
        return null;
    }

    @Override
    public SendFormat getLibsSend() {
        SendFormat sf = new SendFormat();
        sf.setFunc(JdomTransUtil.functionGet);
        sf.setUrl(JdomTransUtil.functionGet + JdomTransUtil.urlCapabilities);
        return sf;
    }

    @Override
    public SendFormat deleteLibsResp(String FDID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
