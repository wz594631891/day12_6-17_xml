package cn.itcast.xml.Jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class JSoupDemo2 {
    //获取xml标签内容
    //获取文档对象
    public static void main(String[] args) throws IOException {
        //获取Document对象
        String path = JSoupDemo2.class.getClassLoader().getResource("student.xml").getPath();
        Document parse = Jsoup.parse(new File(path), "utf-8"); //
        //获取Element对象
        Elements elements= parse.getElementsByTag("name");
        System.out.println(elements.size());
        Element element = elements.get(0);
        String s = element.text();//转换为(文本)字符串
        System.out.println(s);
        //三方法
        //Document Jsoup.parse(String html)
        String s1="<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
                " <students xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n" +
                "\n" +
                "xsi:schemaLocation=\"\n" +
                "\n" +
                "\t\t\t\thttp://www.itcast.cn/xml student.xsd\n" +
                " \t\t\t\t\thttp://www.itcast.cn/xml2 student2.xsd\"\n" +
                "\t\t   xmlns=\"http://www.itcast.cn/xml\"\n" +
                "\t\t   xmlns:b=\"http://www.itcast.cn/xml2\"\n" +
                "\n" +
                "\n" +
                ">\n" +
                "\t<student number=\"heima_0001\">\n" +
                "\t\t<name>zhangsan</name>\n" +
                "\t\t<age>18</age>\n" +
                "\t\t<sex>male</sex>\n" +
                "\t</student>\n" +
                "\t<student number=\"heima_0002\">\n" +
                "\t\t<name>lisi</name>\n" +
                "\t\t<age>18</age>\n" +
                "\t\t<sex>female</sex>\n" +
                "\t</student>\n" +
                "\t<!--<b:标签> 区分不同文件同名元素 命名空间 xx:a xx:b a:xx b:xx-->\n" +
                "</students>";
        Document doc= Jsoup.parse(s1);
        System.out.println(doc);
        //Jsoup.parse(File in,charset) 略
        //Jsoup.parse(URL url,int timeoutMillis)
        URL url=new URL("https://baike.baidu.com/item/jsoup/9012509?fr=aladdin");
        Document document = Jsoup.parse(url, 10000);
        System.out.println(document);

    }

}
