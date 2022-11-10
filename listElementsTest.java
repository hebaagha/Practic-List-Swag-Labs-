import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class listElementsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		String user_name="standard_user";
		String passWord="secret_sauce";
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(user_name);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(passWord);
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		int numOfex=6;
		List <WebElement> listadd= driver.findElements(By.className("btn"));
		for (int i=0;i<listadd.size();i++)
		{
			listadd.get(i).click();
		}
		String numOfac=driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).getText();
		int realyNumber=Integer.parseInt(numOfac);
		Assert.assertEquals(realyNumber, numOfex);
		
		
	   
	    

	   

	}

}
