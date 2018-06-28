package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import static debug.Debug.*;

public class Main {

	public static void main(String...strings ) {
		WebDriver webDriver = new SafariDriver();
		
		webDriver.get("https://www.google.com/");
		slp(5);
		WebElement search = webDriver.findElement(By.id("lst-ib"));
		search.sendKeys("Hello!");
		search.submit();
		slp(5);
		webDriver.quit();
	}

}
