/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package real.xml.transform;

import java.util.List;
import real.xml.transform.dto.JdomTransUtil;
import real.xml.transform.dto.SendFormat;

/**
 * 处理 告警 上传模块
 * @author happy
 */
public class IsapiFDAlarmResult implements CommunicationTrans {

    public void getCapabilitiesResp(String inputXml) {
    }

    /**
     * 输入的为json
     * @param <T>
     * @param inputXml
     * @return 
     */
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
