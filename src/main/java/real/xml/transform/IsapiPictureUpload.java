/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package real.xml.transform;

import java.util.List;
import real.xml.transform.dto.SendFormat;

/**
 *
 * @author happy
 */
public class IsapiPictureUpload implements CommunicationTrans {

    @Override
    public <T> List<T> getLibsResp(String inputXml) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SendFormat getLibsSend() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SendFormat deleteLibsResp(String FDID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
