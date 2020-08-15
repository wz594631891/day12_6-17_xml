package cn.itcast.xml.Jsoup;

/**
 * @Auther: 叶志豪
 * @Date: 2020/8/14 23:05
 * @Description:
 */

import java.awt.*;
import java.awt.datatransfer.*;
import java.awt.event.KeyEvent;
public class autoSender {
    public static void main(String[] args) throws AWTException {
        Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable tText = null;
        Toolkit tolkit = Toolkit.getDefaultToolkit();
        String[] lists = {"test","test2","test3","test4","test5"};
        Robot robot = new Robot();
        robot.delay(10000);//延迟十秒，主要是为了预留出打开窗口的时间，括号内的单位为毫秒
        for (int i = 0; i < 5; i++) {//循环五次，当然，如果爱得深，你死循环也没问题设置为100
            tText = new StringSelection(lists[i]); //自己定义就需要把这行注释，下行取消注释
//            tText = new StringSelection("爱你每test
// 一天");//如果爱得深，把这行取消注释，把内容更换掉你自己想说的
            clip.setContents(tText, null);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            //robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.delay(3000);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.delay(10000);
        }
    }
}