package cn.itcast.xml.Jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class JSoupDemo1 {
    //获取xml标签内容
    //获取文档对象
    public static void main(String[] args) throws IOException {
        //获取Document对象
        String path = JSoupDemo1.class.getClassLoader().getResource("student.xml").getPath();
        Document parse = Jsoup.parse(new File(path), "utf-8"); //
        //获取Element对象
        Elements elements= parse.getElementsByTag("name");
        System.out.println(elements.size());
        Element element = elements.get(0);
        String s = element.text();//转换为(文本)字符串
        System.out.println(s);
    }

}
