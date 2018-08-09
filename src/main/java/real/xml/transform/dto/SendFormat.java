/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package real.xml.transform.dto;

import lombok.Data;

/**
 *
 * @author happy
 */
@Data
public class SendFormat {

    private String url;
    private String func;//get
    private String sendXml;
    private String respXml;

}
