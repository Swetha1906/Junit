package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\workspace\\Debugging\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com");
		String text = driver.findElement(By.xpath("(//div[@class='box'])[2]")).getText();
		System.out.println(text);
		
	}


}
