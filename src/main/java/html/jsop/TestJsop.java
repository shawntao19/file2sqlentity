/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package html.jsop;

import java.io.IOException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author happy
 */
public class TestJsop {

    static String url = "https://www.baidu.com";

    public static void main(String[] args) {
        test3();
//        doc.get
    }

    public static void test1() {
        try {
            Document doc = Jsoup.connect(url).get();
//            Element parentElement = doc.getElementById("u");
            Elements titleElements = doc.getElementsByTag("title");
            Element titleElement = titleElements.get(0);
            System.out.println("html.jsop.TestJsop.test1():" + titleElement.html());
        } catch (IOException ex) {
            Logger.getLogger(TestJsop.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void test2() {
        String html = "<html><head><title>First parse</title></head>"
                + "<body><p>Parsed HTML into a doc.</p></body></html>";
        Document doc = Jsoup.parse(html);
        Elements links = doc.select("p");
//         Elements links = doc.select("p[body]");
        for (Element link : links) {
            String linkclass = link.className();
            String linkText = link.text();
            System.out.println(linkText);
            System.out.println(linkclass);
        }
    }

    public static void test3() {
        HashMap hm = new HashMap();
        String href = null;
        try {
            Document doc = Jsoup.connect(url).get();
            String title = doc.title();
            Elements links = doc.select("a[href]");

            for (Element link : links) {

                String linkHref = link.attr("abs:href");
                String linkText = link.text();
                //System.out.println(linkText+":"+linkHref);
                hm.put(linkText, linkHref);
                href = linkText;
                System.out.println("html.jsop.TestJsop.test3():"+href+"***linkHref:"+linkHref);
            }
        } catch (IOException ex) {
            Logger.getLogger(TestJsop.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
