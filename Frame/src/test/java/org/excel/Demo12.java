package org.excel;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class Demo12 {

	public static void main(String[] args) throws IOException {
		Demo12 demo = new Demo12();
		demo.booking();
		}

	public void booking() throws IOException {
		BaseClass baseclass = new BaseClass();
		baseclass.getDriver();
		baseclass.enterURL("https://adactinhotel.com/");
		baseclass.maximizewindow();
		
		WebElement txtusername = baseclass.findLocatorById("username");	
		String string = baseclass.readValueFromExcel("Maha", 1, 0);
		baseclass.elementSenkeys(txtusername, string);
	
	}
	
	
		
	
	
}
