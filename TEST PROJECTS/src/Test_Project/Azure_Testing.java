package Test_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Azure_Testing {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions e=new ChromeOptions();
		e.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","C:\\chrome driver\\chromedriver.exe");	  
		WebDriver d= new ChromeDriver(e);
		String url=("https://itera-qa.azurewebsites.net/home/automation");
		d.get(url);
		  d.manage().window().maximize();
		  d.findElement(By.id("name")).sendKeys("Nivedan S S");
		  Thread.sleep(3000);
		  d.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("8508383812");
		  Thread.sleep(3000);
		  d.findElement(By.id("email")).sendKeys("nivedansundaram@outlook.com");
		  Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Nivedan2020");
		 Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("4/63a,vinayakr kovil street,perur,coimbatore.");
	   WebElement f= d.findElement(By.xpath("/html/body/div/div[2]/div[2]/button"));
	   f.click();
	   Thread.sleep(3000);
	   WebElement a=d.findElement(By.id("male"));
	   a.click();
	   WebElement b=d.findElement(By.id("monday"));
	   b.click();
	   WebElement c=d.findElement(By.id("wednesday"));
	   c.click();
	   WebElement e1=d.findElement(By.id("thursday"));
	   e1.click();
	   WebElement w=d.findElement(By.id("friday"));
	   w.click();
	   d.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/select")).click();
	   d.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/select/option[4]")).click();
	   d.findElement(By.xpath("/html/body/div/div[5]/div[2]/div[1]/div[2]/label")).click();
	   d.findElement(By.xpath("/html/body/div/div[5]/div[2]/div[2]/div[1]/label")).click();
	   d.findElement(By.id("inputGroupFile02")).sendKeys("D:\\autmation testing\\Ace Money 4.33 + Key\\Ace Money 4.33 + Key\\PPT");
	   Thread.sleep(5000);
	   
	   d.close();
	   System.out.println("successfull");
		
		
	}

}
