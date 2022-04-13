package com.webdriver;

/* Part 2 I have used .xlsx file to prepare the script
 * 3- Prepare a script file using Selenium that will read the given excel data file and  
 * fill up the data entry screen in the below URL : https://customer.i-on.in:9443/signUp
Note: Please do not submit, just enter one by one row .*/

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFCell;

public class Excl1 {
	public static void main(String[] args) throws Exception{
		FileInputStream file1= new FileInputStream("F:\\Excelfile1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file1);
		XSSFSheet sheet= wb.getSheet("sheet1");
		
		for(int i=1;i<=5;i++)
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Assign Project\\Driver\\chromedriver.ex");
		WebDriver driver= new ChromeDriver();
	driver.get("https://customer.i-on.in:9443/signUp");
	driver.manage().window().maximize();
	
	XSSFCell a=sheet.getRow(i).getCell(0);
	driver.findElement(By.name("name")).sendKeys(a.getStringCellValue());
	Select st1= new Select(driver.findElement(By.id("SelectSegment")));
	
	XSSFCell ss=sheet.getRow(i).getCell(1);
	st1.selectByValue(ss.getStringCellValue());
	
	Select st2= new Select(driver.findElement(By.id("serviceTypeId")));
	/*XSSFCell sd=sheet.getRow(i).getCell(2);
	st1.selectByValue(sd.getStringCellValue());*/
	
	st2.selectByValue("High Speed Broadband"); //As the page is accepting only high speed broadband
	XSSFCell b=sheet.getRow(i).getCell(15);
	driver.findElement(By.name("mobile")).sendKeys(b.getStringCellValue());
	XSSFCell c=sheet.getRow(i).getCell(14);
	driver.findElement(By.name("primaryemail")).sendKeys(c.getStringCellValue());
	XSSFCell d=sheet.getRow(i).getCell(3);
	driver.findElement(By.name("Communicationpincode")).sendKeys(d.getRawValue());
	XSSFCell e=sheet.getRow(i).getCell(4);
	driver.findElement(By.name("Communicationarea")).sendKeys(e.getStringCellValue());
	XSSFCell f=sheet.getRow(i).getCell(5);
	driver.findElement(By.name("Communicationbuilding")).sendKeys(f.getStringCellValue());
	XSSFCell g=sheet.getRow(i).getCell(6);
	driver.findElement(By.name("Communicationcity")).clear();
	driver.findElement(By.name("Communicationcity")).sendKeys(g.getStringCellValue());
	XSSFCell h=sheet.getRow(i).getCell(7);
	driver.findElement(By.name("Communicationstate")).clear();
	driver.findElement(By.name("Communicationstate")).sendKeys(h.getStringCellValue());
	XSSFCell j=sheet.getRow(i).getCell(8);
	driver.findElement(By.name("Installationpin")).sendKeys(j.getRawValue());
	XSSFCell k=sheet.getRow(i).getCell(9);
	driver.findElement(By.name("Installationarea")).sendKeys(k.getStringCellValue());
	XSSFCell l=sheet.getRow(i).getCell(10);
	driver.findElement(By.name("Installationbuilding")).sendKeys(l.getStringCellValue());
	XSSFCell m=sheet.getRow(i).getCell(11);
	driver.findElement(By.name("Installationcity")).clear();
	driver.findElement(By.name("Installationcity")).sendKeys(m.getStringCellValue());
	XSSFCell n=sheet.getRow(i).getCell(12);
	driver.findElement(By.name("Installationstate")).clear();
	driver.findElement(By.name("Installationstate")).sendKeys(n.getStringCellValue());
	XSSFCell o=sheet.getRow(i).getCell(16);
	driver.findElement(By.name("Orgnaization")).sendKeys(o.getStringCellValue());	
	XSSFCell p=sheet.getRow(i).getCell(17);
	driver.findElement(By.name("alternatemobile")).sendKeys(p.getRawValue());	
	XSSFCell q=sheet.getRow(i).getCell(18);
	driver.findElement(By.name("LandLine")).sendKeys(q.getStringCellValue());
	XSSFCell r=sheet.getRow(i).getCell(19);
	driver.findElement(By.name("AssociationName")).sendKeys(r.getStringCellValue());
	XSSFCell s=sheet.getRow(i).getCell(20);
	driver.findElement(By.name("AssociationContact")).sendKeys(s.getStringCellValue());
	XSSFCell t=sheet.getRow(i).getCell(21);
	driver.findElement(By.name("AssociationEmail")).sendKeys(t.getStringCellValue());
	Thread.sleep(3000);
	file1.close();
	driver.quit();
		}
}
}
