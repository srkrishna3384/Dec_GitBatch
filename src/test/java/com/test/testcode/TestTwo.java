package com.test.testcode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestTwo {

	@Test
 public void demo() {
	 System.out.println("demo method");
	// System.setProperty(key, value)
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.facebook.com");
 }
}
