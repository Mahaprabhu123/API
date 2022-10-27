package com.base;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 * @author Admin
 *@Description maintains all reusable methods
 *@Date 16-10-22
 *
 */

public class BaseClass {
	
	
	public static WebDriver driver;
	

/**
 * @Description method for screenshot
 * @return screenshotAs
 * @Date 16-10-22
 */

public byte[] screenshot() {
	TakesScreenshot screenshot = (TakesScreenshot)driver;
    byte[] screenshotAs = screenshot.getScreenshotAs(OutputType.BYTES);
    return screenshotAs;
}
/**
 * @Description methods for browser launching
 * @Date 16-10-22 
 */
public static void getDriver(String browserType) {
	
	switch(browserType){
	case "chrome":
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		break;
	case "firefox":
		WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();
		break;
	case "ie":
		WebDriverManager.iedriver().setup();
		driver= new InternetExplorerDriver();
		break;
	case "edge":
		WebDriverManager.edgedriver().setup();
		driver= new EdgeDriver();
		break;
		
	}
}
	
	/**
	 * @Description method to get property file value
	 * @param key
	 * @return value
	 * @throws FileNotFoundException
	 * @throws IOException
	 * Date 16-10-22
	 */
	//getproperty file value

	public static String getPropertyFileValue(String key) throws FileNotFoundException, IOException {
		
FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\OmrBranchAdactinAutomation\\config\\config.properties");
		
		//2.create object for properties
		Properties properties= new Properties();
		//3. pass the property file location to fetch
		properties.load(fileInputStream);
		Object object = properties.get("username");
		Object object2 = properties.get("password");
		//String value =(String)object;
		//System.out.println(value);

	properties.load(new FileInputStream(getProjectPath()+"\\config\\config.properties"));
	String value=(String)properties.get(key);
	return value;
}
	/**
	 * @Description method to get project path
	 * @return path
	 * Date 16-10-22
	 */
	public static String getProjectPath() {
		
		String path = System.getProperty("user.dir");
		return path;
	}
	private String url;
	/**
	 *@Description Get Driver
	 *@Date 16-10-22
	 *  
	 */
	
	public static void getDriver() {//1
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
	/**
	 * @Description enter url
	 * @param url
	 * @Date 16-10-22
	 */
	public  static void enterURL(String url) {//2
     driver.get(url);
	}
	/**
	 * Description maximize window
	 * @Date 16-10-22
	 */
	public static void maximizewindow() {//3
		driver.manage().window().maximize();
	}
	/**
	 * @Description element sendkeys
	 * @param element
	 * @param data
	 * @Date 16-10-22
	 */
	public void elementSendkeys(WebElement element, String data) {//4
		element.sendKeys(data);
	}
	/**
	 * @Description element sendkeys Js
	 * @param element
	 * @param data
	 * @Date 16-10-22
	 */
	public void elementSendkeysJS(WebElement element,String data) {//5
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].setAttribute('value',"+ data+")",element);
	}
	/**
	 * @Description element click
	 * @param element
	 * @Date 16-10-22
	 */
	public void elementClick(WebElement element) {//6
		element.click();
	}
	/**
	 * @Description get Text
	 * @param element
	 * @return text
	 * Date 16-10-22
	 */
	public String getText(WebElement element) {//7
		String text = element.getText();
		return text;
	}
	/**
	 * @Description find locator by id
	 * @param attributevalue
	 * @return element
	 * @Date 16-10-22
	 */
	public WebElement findLocatorById(String attributevalue) {//8
		WebElement element = driver.findElement(By.id(attributevalue));
		return element;
	}
	/**
	 * @Description find locator by name
	 * @param attributevalue
	 * @return element
	 * @Date 16-10-22
	 */
	public WebElement findLocatorByName(String attributevalue) {//9
		WebElement element = driver.findElement(By.name(attributevalue));
		return element;
		
	}
	/**
	 * @Description find locator by class name 
	 * @param attributevalue
	 * @return element
	 *@Date 16-10-22
	 */
	public WebElement findLocatorByclassName(String attributevalue) {//10
		WebElement element = driver.findElement(By.className(attributevalue));
		return element;
	}
	/**
	 * @Description find locator by xpath 
	 * @param xpath
	 * @return element
	 * @Date 16-10-22
	 */
	
	public WebElement findLocatorByXpath(String xpath) {//10
		WebElement element = driver.findElement(By.xpath(xpath));
		return element;
	}
	/**
	 * @Description window close
	 * @Date 16-10-22
	 */
	public void windowclosed() {//11
		driver.close();
	}
	/**
	 * @Description quit window
	 * @Date 16-10-22
	 */
	
	public static void quit() {//12
		driver.quit();
	}
	/**
	 * @Description get title
	 * @return title
	 * @Date 16-10-22
	 */
	public String getTitle() {//13
		String title = driver.getTitle();
		return title;
	}
	/**
	 * @Description
	 * @return url
	 * @Date 16-10-22
	 */
	public String getCurrentUrl() {//14
		String url = driver.getCurrentUrl();
		return url;
	}
	/**
	 * @Description 
	 * @param element
	 * @return attribute
	 * @Date 16-10-22
	 */
		public String elementGetAttributeValue(WebElement element) {//15
			//WebElement element = driver.findElement(By.id(id));
			String attribute = element.getAttribute("value");
			return attribute;
		}
		/**
		 * @Description
		 * @param element
		 * @param attributeName
		 * @return attribute
		 * @Date 16-10-22
		 */
	public String elementGetAttributeValue(WebElement element,String attributeName) {//16
		String attribute = element.getAttribute(attributeName);
		return attribute;
		}
	/**
	 * @Description select by text
	 * @param element
	 * @param text
	 * @Date 16-10-22
	 */
	public void selectByText(WebElement element,String text) {//17
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}
	/**
	 * @Description select by value
	 * @param element
	 * @param value
	 * @Date 16-10-22
	 */
	public void selectByvalue(WebElement element,String value) {//18
		Select s = new Select(element);
		s.selectByValue(value);
	}
	/**
	 * @Description select by index
	 * @param element
	 * @param index
	 * @Date 16-10-22
	 */
	public void selectByIndex(WebElement element,int index) {//19
		Select s = new Select(element);
		s.selectByIndex(index);
	}
	/**
	 * @Description get options by element
	 * @param element
	 * @return options
	 * @Date 16-10-22
	 */
	
	public List<WebElement> getOptions(WebElement element) {//20
		Select s = new Select(element);
List<WebElement> options = s.getOptions();
return options;
	}
	/**
	 * @Description get all selected options
	 * @param element
	 * @return options
	 * @Date 16-10-22
	 */
	public List<WebElement> getAllSelectedOptions(WebElement element) {//21
		Select s = new Select(element);
List<WebElement> options = s.getAllSelectedOptions();
return options;
	}
	/**
	 * @Description get first selected option
	 * @param element
	 * @return firstSelectedOption 
	 */
	public WebElement getFirstSelectedOption(WebElement element) {//22
		Select s = new Select(element);
  WebElement firstSelectedOption = s.getFirstSelectedOption();
return firstSelectedOption;
	}
	/**
	 * @Description method for deselect all
	 * @Date 16-10-22
	 */
	public void deSelectAll(WebElement element) {//23
		Select s = new Select(element);
		s.deselectAll();
	}
	/**
	 * @Description method for deselectbyindex
	 * @param element
	 * @param index
	 * @Date 16-10-22
	 */
	public void deSelectByIndex(WebElement element,int index) {//24
		Select s = new Select(element);
		s.deselectByIndex(index);
	}
	/**
	 * @Description method for deselect by visibletext
	 * @param element
	 * @param text
	 * @Date 16-10-22
	 */
	public void deSelectByVisibleText(WebElement element,String text) {//25
		Select s = new Select(element);
		s.deselectByVisibleText(text);
	}
	/**
	 * @Description method for deselect by value
	 * @param element
	 * @param value
	 * @Date 16-10-22
	 */
	public void deSelectByValue(WebElement element,String value ) {//26
		Select s = new Select(element);
		s.deselectByValue(value);
	}
	/**
	 * @Description method for ismultiple
	 * @param element
	 * @return multiple
	 * @Date 16-10-22
	 */
	
	public boolean ismultiple(WebElement element) {//27
		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		return multiple;
	}
	/**
	 * @Description method for switch Window by id
	 * @param id
	 * @Date 16-10-22
	 */
	public void switchWindowByid(String id){//28
		driver.switchTo().window(id);
	}
	/**
	 * @Description method for switch window by title
	 * @param tittle
	 * @Date 16-10-22
	 */
	public void switchWindowByTittle(String tittle){//29
		driver.switchTo().window(tittle);
	}
	/**
	 * @Description method for switch window by url
	 * @param url
	 * @Date 16-10-22
	 */
	public void switchWindowByUrl(String url){//30
		driver.switchTo().window(url);
	}
	public String getwindowHandle(){//31
		String windowHandle = driver.getWindowHandle();
		return windowHandle;
	}
	/**
	 * @Description method to get window handles
	 * @return windowHandles
	 * Date 16-10-22
	 */
	public Set<String> getwindowHandles(){//32
		Set<String> windowHandles = driver.getWindowHandles();
		return windowHandles;
	}
	public int getSize(WebElement element) {//33
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		int size = options.size();
		return size;
	}
	public void accept() {//34
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	public void dismiss() {//35
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}
	public void sendKeysToInsertValue(String data) {//36
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(data);
	}
	public void switchFrameById(String id) {//37
		driver.switchTo().frame(id);
	}
	public void switchFrameByName(String name) {//38
		driver.switchTo().frame(name);
	}
	public void switchFrameByIndex(int index) {//39
		driver.switchTo().frame(index);
	}
	public void switchFrameByelement(String id) {//40
		WebElement element = driver.findElement(By.id(id));
		driver.switchTo().frame(element);
	}
	public int frameCount(String tagName) {//41
		List<WebElement> elements = driver.findElements(By.tagName("tagName"));
		int size = elements.size();
		return size;
	}
public void	getAttributeUsingJs(String attributename,WebElement element){//42
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("return arguments[0].getAttreibute(attributename)",element);
}
	public void scrollUp(WebElement element) {//43
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)",element);
	}
	public void scrollDown(WebElement element) {//44
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",element);
	}
	public void clickUsingJs(WebElement element) {//45
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",element);	
		}
	public void moveToElement(WebElement element) {//46
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}
	public void dragAndDrop(WebElement source,WebElement dest) {//47
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source,dest).perform();
	}
	public void rightClick(WebElement element) {//48
		Actions actions = new Actions(driver);
		actions.contextClick(element).perform();
	}
	public void DoubleClick(WebElement element) {//49
		Actions actions = new Actions(driver);
		actions.doubleClick(element).perform();
	}
	//Get or Read value from excel
	public String readValueFromExcel(String sheetName,int rownum,int cellnum) throws IOException {
		String res="";
		File file = new File ("C:\\Users\\Admin\\eclipse-workspace\\Frame\\ExcelSheet\\adact.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("Maha");
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		CellType cellType = cell.getCellType();
		switch (cellType ) {
		case STRING:
			res = cell.getStringCellValue();
			
			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat dateformat = new SimpleDateFormat("dd/MMM/yy");
				res = dateformat.format(dateCellValue);
				}else {
			
		double numericcellvalue = cell.getNumericCellValue();
		long check = Math.round(numericcellvalue);
		if (check==numericcellvalue) {
			res=String.valueOf(check);
			
			
		} else {
			res=String.valueOf(numericcellvalue);

		}
			}

		default:
			break;
	}
	return res;	
}
	//Write/insert value in the cell
public String writeDataIncell(String sheetname,int rownum,int cellnum,String data) throws IOException {
	File file = new File("C:\\Users\\Admin\\eclipse-workspace\\Frame\\ExcelSheet\\adact.xlsx");
	FileInputStream stream = new FileInputStream(file);
	Workbook workbook = new XSSFWorkbook(stream);
	Sheet sheet = workbook.getSheet("Maha");
	Row row = sheet.getRow(rownum);
	Cell cell = row.createCell(cellnum);
	cell.setCellValue(data);
	FileOutputStream out = new FileOutputStream(file);
	workbook.write(out);
	return data;
}
//update new Value in existing cell
public void updateDataIncell(String sheetname,int rownum,int cellnum,String oldData,String newData) throws IOException {
	File file = new File("C:\\Users\\Admin\\eclipse-workspace\\Frame\\ExcelSheet\\adact.xlsx");
	FileInputStream stream = new FileInputStream(file);
	Workbook workbook = new XSSFWorkbook(stream);
	Sheet sheet = workbook.getSheet("Maha");
	Row row = sheet.getRow(rownum);
	Cell cell = row.createCell(cellnum);
	String value = cell.getStringCellValue();
	if(value.equals(oldData)) {
		cell.setCellValue(newData);
	}
	FileOutputStream out = new FileOutputStream(file);
	workbook.write(out);
	
	
	
}	
		
	

	


}


