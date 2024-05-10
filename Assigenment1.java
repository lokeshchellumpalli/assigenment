package TestNG;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class Assigenment1 {


	@Test
	public void test() throws InterruptedException, AWTException, IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.get(" https://demo.dealsdray.com");
		WebElement Username=driver.findElement(By.xpath("//*[@id='mui-1']"));
		//Thread.sleep(3000);
		Username.sendKeys("prexo.mis@dealsdray.com");
		WebElement Password=driver.findElement(By.xpath("//*[@id='mui-2']"));
		Password.sendKeys("prexo.mis@dealsdray.com");
		WebElement LoginButton=driver.findElement(By.xpath("//*[@id='root']/div/div/div/div[2]/div/form/div[3]/div/button"));
		LoginButton.click();
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='root']/div/div[1]/div/div[2]/div[1]/div[2]/button/div[1]/span[1]")));
		WebElement OrderValue1=driver.findElement(By.xpath("//*[@id='root']/div/div[1]/div/div[2]/div[1]/div[2]/button/div[1]/span[1]"));
		OrderValue1.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='root']/div/div[1]/div/div[2]/div[1]/div[2]/button/div[1]/span[1]")));
		WebElement OrderValue2=driver.findElement(By.xpath("//*[@id='root']/div/div[1]/div/div[2]/div[1]/div[2]/div/div[1]/a/button"));
		OrderValue2.click();
		driver.manage().window().maximize();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='root']/div/div/div[2]/div/div/div[2]/div[2]/button")));
		WebElement AddBulkOrders=driver.findElement(By.xpath("//*[@id='root']/div/div/div[2]/div/div/div[2]/div[2]/button"));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		AddBulkOrders.click();
		Actions act =new Actions(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='mui-7']")));
		act.click(driver.findElement(By.xpath("//*[@id='mui-7']"))).build().perform();
		Robot robo= new Robot();
		Thread.sleep(3000);
		StringSelection select= new StringSelection("C:\\Users\\lokes\\Downloads\\demo-data.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		robo.keyPress(KeyEvent.VK_ENTER);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='root']/div/div/div[2]/div/div/div[2]/div[3]/button")));
		WebElement importfile=driver.findElement(By.xpath("//*[@id='root']/div/div/div[2]/div/div/div[2]/div[3]/button"));
		importfile.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='root']/div/div/div[2]/div/div/div[2]/div[3]/button")));
		WebElement validate=driver.findElement(By.xpath("//*[@id='root']/div/div/div[2]/div/div/div[2]/div[3]/button"));
		validate.click();
		Thread.sleep(3000);
		Alert alert= driver.switchTo().alert();
		alert.accept();
		Thread.sleep(3000); 
		File fil=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(fil,new File("C:\\Users\\lokes\\OneDrive\\Desktop\\poi\\sc1.jpg"));
	}
}


