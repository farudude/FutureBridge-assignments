package com.webdriver;

/* Part 2 
 * 2. Use IRCTC url https://www.irctc.co.in/nget/train-
    search
   1. Fill From - "C SHIVAJI MAH T - CSTM"
                To - "HOWRAH JN - HWH"
   2. Select "TATKAL"
   3. Select Date 1month from Today's Date
   4. Select "AC 3 Tier (3A)"
   5. Select "Train with Available Berth"
   6. Click on Search   */

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc {
	static String url= "https://www.irctc.co.in/nget/train-search";
	
	static By Alert_submit= By.xpath("//button[@type='submit']");
	static By close_disha= By.xpath("//*[@id=\"corover-askDisha\"]/img[2]");
	static By stn_frm= By.xpath("//*[@id=\"origin\"]/span/input");
	static By stn_to= By.xpath("//*[@id=\"destination\"]/span/input");
	static By drp_class= By.xpath("//*[@id=\"journeyClass\"]/div/div[3]");
	static By drp_3tier= By.xpath("//*[@id=\"journeyClass\"]/div/div[4]/div/ul/p-dropdownitem[7]/li");
	static By date = By.xpath("//*[@id=\"jDate\"]/span/input");
	static By nxt_mnth=By.xpath("//*[@id=\"jDate\"]/span/div/div/div[1]/a[2]");
	static By date1 = By.xpath("//*[@id=\"jDate\"]/span/div/div/div[2]/table/tbody/tr[2]/td[4]/a");
	static By drp_quota= By.xpath("//*[@id='journeyQuota']/div/div[2]/span");
	static By drp_quota_tatkal= By.xpath("//*[@id=\"journeyQuota\"]/div/div[4]/div/ul/p-dropdownitem[5]/li");
	static By btn_search = By.xpath("//*[@id=\"divMain\"]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[5]/div/button");
	
	
public static void main(String[] args) throws Exception{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Assign Project\\Driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
	driver.findElement(Alert_submit).click();
	driver.findElement(close_disha).click();
	driver.findElement(stn_frm).sendKeys("CSTM");
	driver.findElement(stn_frm).sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(stn_to).sendKeys("HWH");
	driver.findElement(stn_to).sendKeys(Keys.ENTER);
	driver.findElement(drp_class).click();
	driver.findElement(drp_3tier).click();
	driver.findElement(date).click();
	driver.findElement(nxt_mnth).click();
	driver.findElement(date1).click();
	
	// Code for tatkal booking, but tatkal wont be available for 1 month so code is written for general quota
	/*driver.findElement(drp_quota).click();
	driver.findElement(drp_quota_tatkal);*/
	
	driver.findElement(btn_search).click(); 
}
}
