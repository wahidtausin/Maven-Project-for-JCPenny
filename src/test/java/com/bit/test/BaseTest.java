package com.bit.test;

import java.io.IOException;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.utility.ReadPropFile;

public class BaseTest {
	WebDriver  dr;
	Properties proop;
	@Before
	public void openBrowser() throws IOException {
		proop= ReadPropFile.readFile("C:\\Users\\wahid\\eclipse-workspace\\BTC19.0421MMavenProjectJCPenny\\config.properties");
		String browser = proop.getProperty("browser");
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wahid\\Downloads\\chromedriver.exe");
//		dr = new ChromeDriver();
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\wahid\\Downloads\\chromedriver.exe");
			dr = new ChromeDriver();
			dr.manage().window().maximize();
		}else if(browser.equals("firefox")) {
			System.setProperty("webdriver.geko.driver", "");
			dr.manage().window().maximize();
			dr = new FirefoxDriver();
			dr.manage().window().maximize();
		}else if(browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "");
			dr = new EdgeDriver();
			dr.manage().window().maximize();
		}else if(browser.equals("ie")) {
			System.setProperty("webdriver.internetexplorer.driver", "");
			dr = new InternetExplorerDriver();
			dr.manage().window().maximize();
		}
		dr.get(proop.getProperty("url"));
	}
	
	
	@After
	public void closerBrowser() throws InterruptedException {
		Thread.sleep(4000);
		dr.quit();
	}

}
