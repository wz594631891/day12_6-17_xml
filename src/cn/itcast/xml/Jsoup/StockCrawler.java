package cn.itcast.xml.Jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URL;



public class StockCrawler {
    public static void main(String[] args) throws IOException {
        //写个爬虫抓取adobe股票，当卖出时用qq或微信提醒
//        File input = new File("/tmp/input.html");
        URL url1=new URL("https://cn.investing.com/equities/adobe-sys-inc-consensus-estimates");
        Document doc = Jsoup.parse(url1, 30000);

        Elements links = doc.select(".summaryTableLine > span");
        Element element = links.get(1);
        String s = element.html();
        if(s.contains("卖出")){


            }
        System.out.println(s); //卖出
//        //带有href属性的a元素
//        Elements pngs = doc.select("img[src$=.png]");
//        //扩展名为.png的图片
//
//        Element masthead = doc.select("div.masthead").first();
//        //class等于masthead的div标签
//
//        Elements resultLinks = doc.select("h3.r > a"); //在h3元素之后的a元素
   /*     URL url1=new URL("https://cn.investing.com/equities/adobe-sys-inc-technical");
        Document document1 = Jsoup.parse(url1, 30000);
        Elements elements1 = document1.getElementsByAttributeValue("class", "summaryTableLinet").

        Element element1 = elements1.get(0);

        System.out.println("adbe");
        System.out.println(element1.text()); //9,980.35 text()获取内容*/
       /* System.out.println("上证综指:");
        URL url2=new URL("http://quote.eastmoney.com/zs000001.html?from=BaiduAladdin");
        Document document = Jsoup.parse(url2, 10000);
        Element price9 = document.getElementById("price9");
        Element km2 = document.getElementById("km2");
        System.out.println(price9  +"\n"+km2 ); 无法获取 */


    }
}
