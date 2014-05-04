package com.wang.study.xml;

import java.io.File;
import java.util.Iterator;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class MonotorConfParse {
    public static void main(String[] args) {  
        
        try {  
            File file = new File("C:\\Users\\wisgood\\workspace\\study\\src\\main\\conf\\monitor-conf.xml");
            
            SAXReader reader = new SAXReader();  
            Document doc = reader.read(file);  
  
            parseDOM4J(doc);// 解析XML文档  
  
  
        } catch (Exception e) {  
            System.out.println("Can't read the file"); 
            e.printStackTrace();
        }  
    } 

    // 解析XML文档  
    private static void parseDOM4J(Document doc) {  
        Element root = doc.getRootElement();  
        Element logInfos = root.element("log-infos");
        for (Iterator iter = logInfos.elementIterator("log"); iter.hasNext();) {
            Element element = (Element) iter.next();  

            String logId = element.elementText("logId");
            String logDelay = element.elementText("logDelay");
            System.out.println(logId+"\t"+logDelay);
        }
        
        logInfos = root.element("contact");
        for (Iterator iter = logInfos.elementIterator("user"); iter.hasNext();) {
            Element element = (Element) iter.next();  

            String logId = element.elementText("email");
            String logDelay = element.elementText("telphone");
            System.out.println(logId+"\t"+logDelay);
        }
        System.out.println( root.elementText("wait-min"));
        
      
    }  
  
    // 将XML文档转换为String  
    private static String getStringFromXML(Document doc) {  
        return doc.asXML();  
    }  
      
    // 将String转换为XML文档  
    private static Document getXMLDocFromString(String str) {  
        try {  
            return DocumentHelper.parseText(str);  
        } catch (DocumentException e) {  
            e.printStackTrace();  
            return null;  
        }  
  
}  

}
