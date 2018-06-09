package org.com.MavenSeleProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class AutomateSite {
  WebDriver driver;
  
  @BeforeTest
  public void beforeTest() {
	System.setProperty("webdriver.chrome.driver","Resource/chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
  }
  
  @Test
  public void f() throws InterruptedException {
	  
	  WebElement women= driver.findElement(By.xpath("//*[@title='Women']"));
	  women.click();
	  
	  WebElement item= driver.findElement(By.cssSelector("img[title='Faded Short Sleeve T-shirts']"));
	  item.click();
	  
	  WebElement fram=driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
	  driver.switchTo().frame(fram);
	  
	  Thread.sleep(5000);
	  WebElement submit=driver.findElement(By.name("Submit"));
	  submit.click();
	  
	  driver.switchTo().defaultContent();
	  
	  Thread.sleep(5000);
	  WebElement checkout= driver.findElement(By.cssSelector("a[rel='nofollow'][title='Proceed to checkout']"));
	  checkout.click();
	  
	  WebElement chkout=driver.findElement(By.xpath("//a[@title='Proceed to checkout'][@class='button btn btn-default standard-checkout button-medium']"));
	  chkout.click();
	  
	  WebElement email= driver.findElement(By.id("email"));
	  email.sendKeys("shweta.2610@rediffmail.com");
	  
	  WebElement pass= driver.findElement(By.id("passwd"));
	  pass.sendKeys("shweta123");
	  
	  WebElement submit1= driver.findElement(By.id("SubmitLogin"));
	  submit1.click();
	  
	  WebElement ckot=driver.findElement(By.name("processAddress"));
	  ckot.click();
	  
	  WebElement checkbx=driver.findElement(By.id("cgv"));
	  checkbx.click();
	  
	  WebElement ckot1=driver.findElement(By.name("processCarrier"));
	  ckot1.click();
	  
	  WebElement pay=driver.findElement(By.xpath("//a[@title='Pay by check.']"));
	  pay.click();
	  
	  WebElement confirm=driver.findElement(By.xpath("//button[@type='submit'][@class='button btn btn-default button-medium']"));
	  confirm.click();
	  
	
  }
  
  
  @AfterTest
  public void afterTest() {
  //driver.quit();
  }

}
