/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdom.all;

import org.jdom.Element;
import org.jdom.Namespace;

public interface XMLable {

    public Element buildElement(Namespace np);
}
