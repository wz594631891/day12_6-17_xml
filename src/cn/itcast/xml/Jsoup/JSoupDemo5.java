package cn.itcast.xml.Jsoup;

import cn.wanghaomiao.xpath.exception.XpathSyntaxErrorException;
import cn.wanghaomiao.xpath.model.JXDocument;
import cn.wanghaomiao.xpath.model.JXNode;
import com.sun.org.apache.xpath.internal.res.XPATHErrorResources;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JSoupDemo5 {
    //获取xml标签内容
    //获取文档对象
    public static void main(String[] args) throws IOException, XpathSyntaxErrorException {
        //获取Document对象
        String path = JSoupDemo5.class.getClassLoader().getResource("student.xml").getPath();
        Document document= Jsoup.parse(new File(path), "utf-8"); //
    //XPath
      JXDocument jXdocument=new JXDocument(document);
        List<JXNode> jxNodes = jXdocument.selN("//student");
        List<JXNode> jxNodes1 = jXdocument.selN("//student/name");
        List<JXNode> jxNodes3 = jXdocument.selN("//student/name[@id]");
        List<JXNode> jxNodes2 = jXdocument.selN("//student/name[@id='itcast']");//"父标签/子标签[@属性=['值']"
     /*   for (JXNode jxNode : jxNodes) {
            Element element = jxNode.getElement();
            System.out.println(element);
        }*/
        for (JXNode jxNode : jxNodes2) {
            System.out.println(jxNode);
        }


    }

}
