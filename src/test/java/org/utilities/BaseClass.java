package org.utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	
	//1.Launch Chrome
	public static void launchChrome() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();

	}
	
	public static void launchFirefox() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();

	}
	public static void launchEdge() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();

	}
	//2.Load URL
	public static void loadUrl(String url)
	{
		driver.get(url);
	}
	//3.maximize window
	public static void winMax() {
		driver.manage().window().maximize();

	}
	
	//4.Sendkeys
	public static void fill(WebElement ele, String value) {
		ele.sendKeys(value);

	}
	
	//5.Button Click
	public static void btnClick(WebElement ele) {
		ele.click();

	}
	
	//6.Get the title
	public static String pageTitle() {
		String title = driver.getTitle();
		//System.out.println(title);
		return title;

	}
	
	//7.To get title
	public static String pageUrl() {
		String url = driver.getCurrentUrl();
		return url;
		
	}
	
	//8.To close all the tabs
	public static void toQuit() {
		driver.quit();

	}
	
	//9.To get the text from webelement
	public static String printText(WebElement ele) {
		String text = ele.getText();
		//System.out.println(text);
		return text;

	}
	
	//10.To get the Attribute from the value of a web element
	public static String printAttribute(WebElement ele) {
		String attr = ele.getAttribute("value");
		//System.out.println(attr);
		return attr;
	}
	
	//11. To make the program to wait to load the webpage fully
	public static void impwait() {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	//12.MoveToElement
	public static void performMoveToElement(WebElement ele) {
		 a = new Actions(driver);
		 a.moveToElement(ele).perform();
	}
	
	//13.To drag and drop
	public static void performDragandDrop(WebElement src,WebElement des) {
		a.dragAndDrop(src, des).perform();
	}
	
	//14.Double click
	public static void performDoubleClick(WebElement ele) {
		a.doubleClick(ele).perform();
	}
	
	//15.Right Click
	public static void performContextClick(WebElement ele) {
		a.contextClick(ele).perform();

	}
	
	//16.SendCaps using action
	public static void sendCaps(WebElement ele,String value)
	{
		a.keyDown(Keys.SHIFT).sendKeys(ele,value).keyUp(Keys.SHIFT).build().perform();
	
	}
	
	
	
	//17.select using actions class
	public static void actionSelect(){
		a.keyDown(Keys.CONTROL).keyDown("A").keyUp(Keys.CONTROL).keyUp("A").build().perform();
	}
	
	
	//18.copy using actions class
	public static void actionCopy() {
		a.keyDown(Keys.CONTROL).keyDown("C").keyUp(Keys.CONTROL).keyUp("C").build().perform();
	}
	
	//19.Paste using actions class
	public static void actionPaste() {
		a.keyDown(Keys.CONTROL).keyDown("V").keyUp(Keys.CONTROL).keyUp("V").build().perform();
	}
	
	//20.Down and click using action class
	public static void actionDownandClick(int count){
		for(int i=0;i<count;i++) {
			a.keyDown(Keys.ARROW_DOWN);
		}
		a.keyUp(Keys.ARROW_DOWN);
		a.keyDown(Keys.ENTER);
	}
	
	//21.Enter using robot
	public static void performEnter() throws AWTException {
		r= new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
		
	//22.Tab
	public static void performTab() throws AWTException {
		r= new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	}
	
	//23.select the text using robot class
	public static void robotSelect(){
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
		
	}
	
	
	//24.Copy the text using robot class
	public static void robotCopy() {
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);

	}
	
	//25.Paste the text using robot class
	public static void robotPaste() {
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

	}
	
	
	//26.Robot class to press downarrow
	public static void robotDownandClick(int count){
		
		for (int i=0;i<count;i++)
		{
			r.keyPress(KeyEvent.VK_DOWN);
			
		}
		r.keyRelease(KeyEvent.VK_DOWN);
	}
	
	
	public static void screenshot(String name) throws IOException
	{
		TakesScreenshot t = (TakesScreenshot)driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File des = new File("E:\\testing_programs\\CucumberProject\\target\\screenshots"+name+".png");
		FileUtils.copyFile(src, des);
		
	}
	
	//27.To read all data from a from excel using sheetnumber
	public static void readExcel(String path,int sheetnumber) throws IOException {
		
		File f = new File(path);
		FileInputStream fin = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fin);
		Sheet sheet = w.getSheetAt(sheetnumber);
		System.out.println("The sheet name is : "+sheet.getSheetName());
		int rowcount = sheet.getPhysicalNumberOfRows();
		System.out.println("Total number of rows: "+rowcount);
		Row row = sheet.getRow(0);		
		System.out.println("Total number of cells : "+row.getPhysicalNumberOfCells());
	    for(int i=0;i<rowcount;i++) {
	    	row = sheet.getRow(i);
	    	for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
	    		System.out.print(row.getCell(j)+"\t");
				
			}
	    	System.out.println("\n");
	    	
	    }
		
	}
	
	
	//28.To read all data from a from excel using sheetname
	public static void readExcel(String path,String sheetname) throws IOException {
		
		File f = new File(path);
		FileInputStream fin = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fin);
		Sheet sheet = w.getSheet(sheetname);
		//System.out.println("The sheet name is : "+sheet.getSheetName());
		int rowcount = sheet.getPhysicalNumberOfRows();
		System.out.println("Total number of rows: "+rowcount);
	    for(int i=0;i<rowcount;i++) {
	    	Row row = sheet.getRow(i);
	    	for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
	    		System.out.print(row.getCell(j)+"\t");
				
			}
	    	System.out.println("\n");
	    	
	    }
	}
	
	//To read the excel in array
	public static String[][] readExcelinArray(String path,int sheetnumber) throws IOException {
		
		File f = new File(path);
		FileInputStream fin = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fin);
		Sheet sheet = w.getSheetAt(sheetnumber);
		System.out.println("The sheet name is : "+sheet.getSheetName());
		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("Total number of rows: "+rowCount);
		Row row = sheet.getRow(0);		
		int cellCount =row.getPhysicalNumberOfCells();
		int cellType;
		Cell cell;
		String value="";
		String a[][]= new String[rowCount][cellCount];
	    for(int i=0;i<rowCount;i++) {
	    	row = sheet.getRow(i);
	    	for (int j = 0; j < cellCount; j++) {
	    		//System.out.print(row.getCell(j)+"\t")
	    		cell=row.getCell(j);
	    		cellType=cell.getCellType();
	    		if(cellType==1) {
	    			value=cell.getStringCellValue();
	    		}
	    		else if(cellType==0)
	    		{
	    			if(DateUtil.isCellDateFormatted(cell)) {
	    				Date d = cell.getDateCellValue();
	    				SimpleDateFormat sim = new SimpleDateFormat("dd-MMM-yyyy");
	    				value=sim.format(d);
	    			}
	    			else
	    			{
	    				double d = cell.getNumericCellValue();
	    				long l =(long)d;
	    				value=String.valueOf(l);
	    				
	    			}
	    		}
	    		a[i][j]=value;
	    		
				
	    	}
	    	
	    }
	    return a;
		
	}
	
	//29. To read a cell value using row number and cell number
	public static  String readCell(String path,int rowNumber,int cellNumber) throws IOException {
		File f = new File(path);
		FileInputStream fin = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fin);
		Sheet s = w.getSheetAt(0);
		//System.out.println(s.getSheetName());
		Row row = s.getRow(rowNumber);
		Cell cell = row.getCell(cellNumber);
		//System.out.println(cell);
		int cellType =cell.getCellType();
		System.out.println("celltype: "+cellType );
		String value="";
		if(cellType==1) {
			value=cell.getStringCellValue();
		}
		else if(cellType==0)
		{
			if(DateUtil.isCellDateFormatted(cell)) {
				Date d = cell.getDateCellValue();
				SimpleDateFormat sim = new SimpleDateFormat("dd-MMM-yyyy");
				value=sim.format(d);
			}
			else
			{
				double d = cell.getNumericCellValue();
				long l =(long)d;
				value=String.valueOf(l);
				
			}
		}
		return value;
		

	}
	
	
	public static void insertRow(String path,int sheetnumber) throws IOException {
		
		File f = new File(path);
		Workbook w = new XSSFWorkbook();
		Sheet sheet = w.getSheetAt(sheetnumber);
		int rowCount = sheet.getPhysicalNumberOfRows();
		Row row = sheet.getRow(rowCount);
		int cellCount = row.getPhysicalNumberOfCells();
		//row.getCell(cellCount)
		
		Cell cell = row.createCell(rowCount);
	
		cell.setCellValue("Chithra");
		cell.setCellValue("BSC");
			
		
		FileOutputStream fout = new FileOutputStream(f);
		w.write(fout);
		

	}
	

	
	
	
	
	

}
