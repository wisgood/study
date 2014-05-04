package com.wang.study.xml;

  
import java.io.File;  
import java.util.Iterator;  
  
import org.dom4j.Attribute;  
import org.dom4j.Document;  
import org.dom4j.DocumentException;  
import org.dom4j.DocumentHelper;  
import org.dom4j.Element;  
import org.dom4j.io.SAXReader;  
  
public class ReadXML {  
  
    public static void main(String[] args) {  
  
        try {  
            File file = new File("C:\\Users\\wisgood\\workspace\\study\\src\\main\\conf\\demo.xml");
            
            SAXReader reader = new SAXReader();  
            Document doc = reader.read(file);  
  
            parseDOM4J(doc);// 解析XML文档  
  
  
        } catch (Exception e) {  
            System.out.println("Can't read the file");  
        }  
    } 

	// 解析XML文档  
	private static void parseDOM4J(Document doc) {  
	    Element root = doc.getRootElement();  
	    for (Iterator iter = root.elementIterator("line"); iter.hasNext();) {
	        // 遍历line结点的所有子节点,也可以使用root.elementIterator()  
	        Element element = (Element) iter.next();  
	  
	        Attribute lidAttr = element.attribute("lid");// 获取<line>元素的属性  
	        String lid = lidAttr.getValue();// 获取<line>元素的属性值  
	        Attribute numAttr = element.attribute("num");// 获取<line>元素的属性  
	        String num = numAttr.getValue();// 获取<line>元素的属性值  
	  
	        String id = element.elementText("id");// 获取<line>元素下<id></id>的值  
	  
	        System.out.println("==lid:" + lid);  
	        System.out.println("==num:" + num);  
	        System.out.println("==路线id:" + id);  
	  
	        for (Iterator iterInner = element.elementIterator("station"); iterInner.hasNext();) { 
	            // 遍历station结点的所有子节点  
	            Element elementInner = (Element) iterInner.next();  
	  
	            String sid = elementInner.elementText("sid");// 获取<station>元素下<sid></sid>的值  
	            String sname = elementInner.elementText("sname");// 获取<station>元素下<sname></sname>的值  
	  
	            System.out.println("----站--sid:" + sid);  
	            System.out.println("----站--sname:" + sname);  
	        }  
	  
	    }  
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