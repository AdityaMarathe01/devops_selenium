package example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\6th Sem\\devOPS\\chromedriver-win64\\chromedriver.exe");
//		create object of web driver
		
		//LOAD SUCCESSFUL 
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:5500/index.html");
		
		//CLICK ON SIGNUP PAGE
		WebElement next = driver.findElement(By.id("register"));
		next.click();
		
		
		
//		//ENTER VALID DETAILS
		WebElement userName= driver.findElement(By.id("username"));	
		userName.sendKeys("AdminUTI");
	
		WebElement mail= driver.findElement(By.id("email"));
		mail.sendKeys("ADITYAMARATHE613@gmail.com");
		
		WebElement password= driver.findElement(By.id("password"));
		password.sendKeys("admin123");
		
		//ENTER INVALID DETAILS
//		WebElement userName= driver.findElement(By.id("username"));
//		userName.sendKeys("-=");
//		
//		WebElement mail= driver.findElement(By.id("email"));
//		mail.sendKeys("ADITYAMARATHE613@gmail.com");
//		
//		WebElement password= driver.findElement(By.id("password"));
//		password.sendKeys("admin123");
		
		//NUMBER OF LINKS ON PAGE
		WebElement next_register = driver.findElement(By.id("registerBtn"));
		next_register.click();
		List<WebElement> allLinks = driver.findElements(By.xpath("//a")); 
		int count = allLinks.size(); 
		System.out.println("Total Number of links: \n"+count); 
		WebElement link = allLinks.get(0); 
		String text = link.getText(); 
		System.out.println(text);
		
		//print welcome after successful login
		WebElement msgWelcome= driver.findElement(By.id("welcome"));
		if(msgWelcome.isDisplayed())
		{
			//if(msgWelcome.getText()=="welcome Admin")
			if(msgWelcome.getText().contentEquals("welcome"))
				System.out.println("test passed\n");
			else
				System.out.println("test fail	\n"+msgWelcome.getText());
				
		}
		


}
}





















