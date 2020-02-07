package MercuryTours.MercuryTours;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class CommonUtils extends BaseClass{
	
	public static String getTestDataValue(String parentNode, String nodeName) throws Exception{
	
		File fxmlFile=new File(".//TestData.xml");
		DocumentBuilderFactory dbFactory= DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder=dbFactory.newDocumentBuilder();
		Document doc=dBuilder.parse(fxmlFile);
		doc.getDocumentElement().normalize();
		NodeList nList=doc.getElementsByTagName(parentNode);	
		Node nNode=nList.item(0);
		Element element=(Element)nNode;		
		return element.getElementsByTagName(nodeName).item(0).getTextContent();
		
	}
	
	public static void captureScreenShot(WebDriver driver) throws IOException{
		
		TakesScreenshot shot=(TakesScreenshot)driver;
		File source=shot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./Screenshots/Screenshot.png"));
	}
	
	public static String readProperty(String key) throws Exception{
		
		FileReader reader=new FileReader("./Resource/Config.properties");
		Properties p=new Properties();
		p.load(reader);
		return p.getProperty(key);
		
	}
	
	
}
