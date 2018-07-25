/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package html.jsop;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 *
 * @author happy
 */
public class TestJsop {

    public static void main(String[] args) {
        String html = "<html><head><title>First parse</title></head>"
                + "<body><p>Parsed HTML into a doc.</p></body></html>";
        Document doc = Jsoup.parse(html);
//        doc.get
    }

}
