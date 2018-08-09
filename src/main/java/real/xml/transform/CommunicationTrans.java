/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package real.xml.transform;

import java.util.List;
import real.xml.transform.dto.FDLibBaseCfg;
import real.xml.transform.dto.SendFormat;

/**
 *
 * @author happy
 */
public interface CommunicationTrans {

    public <T> List<T> getLibsResp(String inputXml);

//    public SendFormat creatLibs();

    public SendFormat getLibsSend();

    public SendFormat deleteLibsResp(String FDID);

//    public <T> SendFormat changeLibs(T t);

}
