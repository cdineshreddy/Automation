package NewPrograms;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

//Need external Jars to execute this program
//ashot 1.5.3, Gson 2.8.5 , Hamcreast-all 1.3
public class ImageComparison {
	
	public void captureImage() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement logo = driver.findElement(By.xpath("//div[@id='divLogo']/img"));
		Screenshot takeScreenshot = new AShot().takeScreenshot(driver, logo);
		ImageIO.write(takeScreenshot.getImage(), "png",
				new File("./TestData/OrangeHRMLogo.png"));

		File f = new File("./TestData/OrangeHRMLogo.png");
		if (f.exists()) {
			System.out.println("Image file captured");
		} else {
			System.out.println("Image file not exist");
		}
		driver.close();
	}
	
	public void compareImage() throws Exception{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		BufferedImage expectedImage = ImageIO.read(new File("./TestData/OrangeHRMLogo.png"));
		WebElement logo = driver.findElement(By.xpath("//div[@id='divLogo']/img"));
		Screenshot takeScreenshot=new AShot().takeScreenshot(driver, logo);
		BufferedImage actualImage = takeScreenshot.getImage();
		ImageDiffer imgDiff=new ImageDiffer();
		ImageDiff diff = imgDiff.makeDiff(expectedImage, actualImage);
		if(diff.hasDiff()==true) {
			System.out.println("Images are not same");
		}else {
			System.out.println("Images are same");
		}
		driver.close();
	}
	
	public static void main(String[] args)throws Exception {
		
		ImageComparison comp=new ImageComparison();
		comp.compareImage();
	}

}
