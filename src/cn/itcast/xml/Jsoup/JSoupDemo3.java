package cn.itcast.xml.Jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class JSoupDemo3 {
    //获取xml标签内容
    //获取文档对象
    public static void main(String[] args) throws IOException {
        //获取Document对象
        String path = JSoupDemo3.class.getClassLoader().getResource("student.xml").getPath();
        Document document= Jsoup.parse(new File(path), "utf-8"); //
     //获取element/elements对象
        Elements elementsByAttributeValue = document.getElementsByAttributeValue("number", "heima_0001");
        Elements number = document.getElementsByAttribute("number");
        Element elementById = document.getElementById("1");
        Elements students = document.getElementsByTag("student");
        System.out.println(elementsByAttributeValue+"\n"+"\n"+number+"\n"+"\n"+elementById+"\n"+"\n"+students+"\n");
    }

}
