package com.webdriver;

/* Part 2 I have used .xls file to prepare the script
 * 3- Prepare a script file using Selenium that will read the given excel data file and  
 * fill up the data entry screen in the below URL : https://customer.i-on.in:9443/signUp
Note: Please do not submit, just enter one by one row .*/


import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import jxl.Sheet;
import jxl.Workbook;

public class Excl {
	public static void main(String[] args) throws Exception {
	FileInputStream file= new FileInputStream("F:\\Excelfile.xls");
	Workbook wb= Workbook.getWorkbook(file);
	Sheet st= wb.getSheet(0);

	for(int i=1;i<=5;i++)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Assign Project\\Driver\\chromedriver.ex");
		WebDriver driver= new ChromeDriver();
	driver.get("https://customer.i-on.in:9443/signUp");
	driver.manage().window().maximize();
	driver.findElement(By.name("name")).sendKeys(st.getCell(0,i).getContents());
	Select st1= new Select(driver.findElement(By.id("SelectSegment")));
	st1.selectByValue(st.getCell(1,i).getContents());
	
	Select st2= new Select(driver.findElement(By.id("serviceTypeId")));
	//st2.selectByValue(st.getCell(2,i).getContents()); 
	st2.selectByValue("High Speed Broadband");// As the page is accepting only high speed broadband
	
	driver.findElement(By.name("mobile")).sendKeys(st.getCell(15,i).getContents());
	driver.findElement(By.name("primaryemail")).sendKeys(st.getCell(14,i).getContents());
	driver.findElement(By.name("Communicationpincode")).sendKeys(st.getCell(3,i).getContents());
	driver.findElement(By.name("Communicationarea")).sendKeys(st.getCell(4,i).getContents());
	driver.findElement(By.name("Communicationbuilding")).sendKeys(st.getCell(5,i).getContents());
	driver.findElement(By.name("Communicationcity")).clear();
	driver.findElement(By.name("Communicationcity")).sendKeys(st.getCell(6,i).getContents());
	driver.findElement(By.name("Communicationstate")).clear();
	driver.findElement(By.name("Communicationstate")).sendKeys(st.getCell(7,i).getContents());
	driver.findElement(By.name("Installationpin")).sendKeys(st.getCell(8,i).getContents());
	driver.findElement(By.name("Installationarea")).sendKeys(st.getCell(9,i).getContents());
	driver.findElement(By.name("Installationbuilding")).sendKeys(st.getCell(10,i).getContents());
	driver.findElement(By.name("Installationcity")).clear();
	driver.findElement(By.name("Installationcity")).sendKeys(st.getCell(11,i).getContents());
	driver.findElement(By.name("Installationstate")).clear();
	driver.findElement(By.name("Installationstate")).sendKeys(st.getCell(12,i).getContents());
	driver.findElement(By.name("Orgnaization")).sendKeys(st.getCell(16,i).getContents());
	driver.findElement(By.name("alternatemobile")).sendKeys(st.getCell(17,i).getContents());
	driver.findElement(By.name("LandLine")).sendKeys(st.getCell(18,i).getContents());
	driver.findElement(By.name("AssociationName")).sendKeys(st.getCell(19,i).getContents());
	driver.findElement(By.name("AssociationContact")).sendKeys(st.getCell(20,i).getContents());
	driver.findElement(By.name("AssociationEmail")).sendKeys(st.getCell(21,i).getContents());
	Thread.sleep(5000);
	driver.close();
	}
	}
}
