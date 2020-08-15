package cn.itcast.xml.Jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class JSoupDemo4 {
    //获取xml标签内容
    //获取文档对象
    public static void main(String[] args) throws IOException {
        //获取Document对象
        String path = JSoupDemo4.class.getClassLoader().getResource("student.xml").getPath();
        Document document= Jsoup.parse(new File(path), "utf-8"); //
    //选择器获取Element对象
        Elements names = document.select("name");//标签
        Elements itcast = document.select("#itcast");//id值获取
        Elements heima0001 = document.select("student[number=\"heima_0001\"]");//标签属性值获取
        Elements age = document.select("student[number='heima_0001'] > age");//获取一级子标签name
        System.out.println(names +"\n"+"\n"+ itcast +"\n"+"\n"+ heima0001 +"\n"+"\n"+age);
    }

}
