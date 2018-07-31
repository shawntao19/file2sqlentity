/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package html.jsop;

/**
 *
 * @author happy
 */
import com.alibaba.fastjson.JSON;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Example program to list links from a URL.
 */
public class ListLinks {

    public static void main(String[] args) throws IOException {
//        String url = "http://data.stats.gov.cn/easyquery.htm?cn=B01";
        String url = "http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/2015/index.html";
//        String url = "http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/2015/11.html";
        print("Fetching %s...", url);
        ListLinks ll = new ListLinks();

        Map map1 = ll.urlGet(url);
        System.out.println("main():"+JSON.toJSONString(map1));

    }

    private List<String> subGet(String url) {
        print("subGet Fetching :%s...", url);

        List<String> map = new ArrayList<>();
        Document doc = getHtmlTextByUrl(url);
        Elements links = doc.select("a[href]");
        Elements media = doc.select("[src]");
        Elements imports = doc.select("link[href]");

        print("\nsubGet Links: (%d)", links.size());
        for (Element link : links) {
//            print(" * a: <%s>  (%s)", link.attr("abs:href"), trim(link.text(), 35));
            String subUrl = link.attr("abs:href");
//            System.out.println("*subGet Links text*:" + link.text() + "***href:" + subUrl);
            map.add(link.text());
        }
        System.out.println("subGet() list:"+JSON.toJSONString(map));
        return map;
    }

    private Map urlGet(String url) throws IOException {
        print("urlGet Fetching :%s...", url);

        Map map = new HashMap();
        Document doc = getHtmlTextByUrl(url);
        Elements links = doc.select("a[href]");
        Elements media = doc.select("[src]");
        Elements imports = doc.select("link[href]");

        print("\nMedia: (%d)", media.size());

//        for (Element src : media) {
//            if (src.tagName().equals("img")) {
//                print(" * %s: <%s> %sx%s (%s)",
//                        src.tagName(), src.attr("abs:src"), src.attr("width"), src.attr("height"),
//                        trim(src.attr("alt"), 20));
//            } else {
//                print(" * %s: <%s>", src.tagName(), src.attr("abs:src"));
//            }
//            System.out.println("*text*:" + src.text());
//        }
//
        print("\nImports: (%d)", imports.size());
//        for (Element link : imports) {
////            print(" * %s <%s> (%s)", link.tagName(), link.attr("abs:href"), link.attr("rel"));
//            System.out.println("*Imports text*:" + link.text());
//        }

        print("\nLinks: (%d)", links.size());
        for (Element link : links) {
//            print(" * a: <%s>  (%s)", link.attr("abs:href"), trim(link.text(), 35));
            String subUrl = link.attr("abs:href");
            System.out.println("*Links text*:" + link.text() + "***href:" + subUrl);
            List<String> strList = new ArrayList<>();
            if (null != subUrl && !"".equals(subUrl)) {
                System.out.println("************************:");
                ListLinks llsub = new ListLinks();

                strList = llsub.subGet(subUrl);
            }
            map.put(link.text(), strList);
        }
        return map;
    }

    private static void print(String msg, Object... args) {
        System.out.println(String.format(msg, args));
    }

    private static String trim(String s, int width) {
        if (s.length() > width) {
            return s.substring(0, width - 1) + ".";
        } else {
            return s;
        }
    }

    public Document getHtmlTextByUrl(String url) {
        Document doc = null;
        try {
            //doc = Jsoup.connect(url).timeout(5000000).get();
            int i = (int) (Math.random() * 100); //做一个随机延时，防止网站屏蔽
            while (i != 0) {
                i--;
            }
            doc = Jsoup.connect(url).data("query", "Java")
                    .userAgent("Mozilla").cookie("auth", "token")
                    .timeout(300000).post();
        } catch (IOException e) {
            e.printStackTrace();
            try {
                doc = Jsoup.connect(url).timeout(50000).get();
            } catch (IOException e1) { // TODO Auto-generated catch block  e1.printStackTrace(); } } 

                return doc;
            }
        }
        return doc;
    }
}
