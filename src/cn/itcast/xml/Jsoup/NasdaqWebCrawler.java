//package cn.itcast.xml.Jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URL;

public class NasdaqWebCrawler {
    public static void main(String[] args) throws IOException {
        //写个爬虫抓取纳斯达克指数
        URL url1=new URL("https://www.laohu8.com/stock/.IXIC?f=baidu&utm_source=baidu&utm_medium=aladingpc");
        Document document1 = Jsoup.parse(url1, 10000);
        Elements elements1 = document1.getElementsByAttributeValue("class", "latest");
        Elements elements2 = document1.getElementsByAttributeValue("class", "change");
        Element element1 = elements1.get(0);
        Element element2 = elements2.get(1);
        System.out.println("纳斯达克指数:");
        System.out.println(element1.text()+"\n"+element2.text() ); //9,980.35 text()获取内容
       /* System.out.println("上证综指:");
        URL url2=new URL("http://quote.eastmoney.com/zs000001.html?from=BaiduAladdin");
        Document document = Jsoup.parse(url2, 10000);
        Element price9 = document.getElementById("price9");
        Element km2 = document.getElementById("km2");
        System.out.println(price9  +"\n"+km2 ); 无法获取 */

        URL url2=new URL("https://www.laohu8.com/stock/000001.SH");
        Document Sdocument1 = Jsoup.parse(url2, 10000);
        Elements Selements1 = Sdocument1.getElementsByAttributeValue("class", "latest");
        Elements Selements2 = Sdocument1.getElementsByAttributeValue("class", "change");
        Element Selement1 = Selements1.get(0);
        Element Selement2 = Selements2.get(1);
        System.out.println("上证指数:");
        System.out.println(Selement1.text()+"\n"+Selement2.text() );
    }
}
