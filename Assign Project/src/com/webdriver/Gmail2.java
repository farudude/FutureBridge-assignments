package com.webdriver;

/*  Part 2 
 1. Write a selenium script using dynamic xpath and the scenario is 
		1.Login to Gmail Account 
		2.Attach a file from desktop
		3.send an email.*/

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;

	public class Gmail2{
		static String url 		= "https://mail.google.com";
		static String un		= "farhaantest101@gmail.com";
		static String pw		= "Hello@123";
		static String to_mail	= "cooldudefro@gmail.com";
		static String sub		= "Test mail";
		
		static By txt_email		= 	By.xpath( "//input[@id='identifierId']");
		static By btn_next		=	By.id("identifierNext");
		static By txt_pwd		= 	By.xpath( "//input[@name='password']");
		static By btn_login		= 	By.id("passwordNext");
		static By btn_compose	=	By.xpath("//*[@id=':3w\']");
		static By txt_to		=	By.name("to");
		static By txt_sub		=	By.name("subjectbox");
		static By btn_attach	= 	By.xpath("//*[@id=':al']");
		static By btn_send		= 	By.id(":8y");
		
		
	public static void main(String[] args) throws Exception {
		
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Assign Project\\Driver\\chromedriver.ex");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get(url);
	        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
	        driver.findElement(txt_email).sendKeys(un);
	        driver.findElement(btn_next).click();
	        WebElement password = driver.findElement(txt_pwd);
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	        wait.until(ExpectedConditions.elementToBeClickable(password));
	        password.sendKeys(pw);
	        driver.findElement(btn_login).click();
	        driver.findElement(btn_compose).click();
	        driver.findElement(txt_to).sendKeys(to_mail);
	        driver.findElement(txt_sub).sendKeys(sub);
	        //driver.findElement(btn_attach).click();
	        Thread.sleep(3000);
	        
	        // Method 1 Using Robot Class
	        Robot rb =new Robot();
	     	      
	        rb.keyPress(KeyEvent.VK_D);
		     rb.keyRelease(KeyEvent.VK_D);
		     rb.keyPress(KeyEvent.VK_E);
		     rb.keyRelease(KeyEvent.VK_E);
		     rb.keyPress(KeyEvent.VK_S);
		     rb.keyRelease(KeyEvent.VK_S);
		     rb.keyPress(KeyEvent.VK_K);
		     rb.keyRelease(KeyEvent.VK_K);
		     rb.keyPress(KeyEvent.VK_T);
		     rb.keyRelease(KeyEvent.VK_T);
		     rb.keyPress(KeyEvent.VK_O);
		     rb.keyRelease(KeyEvent.VK_O);
		     rb.keyPress(KeyEvent.VK_P);
		     rb.keyRelease(KeyEvent.VK_P);
		     Thread.sleep(2000);
		     
		     rb.keyPress(KeyEvent.VK_BACK_SLASH);
		     rb.keyRelease(KeyEvent.VK_BACK_SLASH);
		     Thread.sleep(2000);
	        
	     rb.keyPress(KeyEvent.VK_P);
	     rb.keyRelease(KeyEvent.VK_P);
	     rb.keyPress(KeyEvent.VK_I);
	     rb.keyRelease(KeyEvent.VK_I);
	     rb.keyPress(KeyEvent.VK_C);
	     rb.keyRelease(KeyEvent.VK_C);
	     rb.keyPress(KeyEvent.VK_1);
	     rb.keyRelease(KeyEvent.VK_1);
	     
	     rb.keyPress(KeyEvent.VK_DECIMAL);
	     rb.keyRelease(KeyEvent.VK_DECIMAL);
	     
	     rb.keyPress(KeyEvent.VK_J);
	     rb.keyRelease(KeyEvent.VK_J);
	     rb.keyPress(KeyEvent.VK_P);
	     rb.keyRelease(KeyEvent.VK_P);
	     rb.keyPress(KeyEvent.VK_G);
	     rb.keyRelease(KeyEvent.VK_G);
	     Thread.sleep(2000);
	     
	     rb.keyPress(KeyEvent.VK_ENTER);
	     rb.keyRelease(KeyEvent.VK_ENTER);
	     Thread.sleep(2000);
	        
	     //Method 2 Using element directly 
	        WebElement fileInput=driver.findElement(btn_attach);
			fileInput.sendKeys("C:\\Users\\HP\\OneDrive\\Desktop\\pic1.jpg");
	     Thread.sleep(2000);
	     
	     driver.findElement(btn_send).click();
	     }
	    }
	

