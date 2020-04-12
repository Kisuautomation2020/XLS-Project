import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Read_XML_FileTest {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		
		//https://www.mkyong.com/java/how-to-read-xml-file-in-java-dom-parser/   ----> use this website for this file
	
		// Declare File path
		File xmlFile=new File("C:\\testing\\DemoFile.xml");
		
		//create instance for document builder factory
		DocumentBuilderFactory dbFactory= DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder=dbFactory.newDocumentBuilder();
		Document doc=dBuilder.parse(xmlFile); // when you read xml file or jason file it's called parsing or parse.
		
		
		//Get node lists for xml
		NodeList nList=doc.getChildNodes();
		 
		//Get xml first node
		Node n=nList.item(0);
		
		//Assign node element
		Element element=(Element)n;
		
		//print application url by tag name
		System.out.println("URL: "+element.getElementsByTagName("APP_URL").item(0).getTextContent());
		
		
	}

}
