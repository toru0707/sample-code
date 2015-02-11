package com.froma.pc.apply;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobDetailPage {
	private WebDriver driver;

	@FindBy(id = "")
	@CacheLookup
	private WebElement btnApplyUpper;
	
	public ApplyInputPage clickApplyUpper(){
		btnApplyUpper.click();
		return PageFactory.initElements(driver,ApplyInputPage.class);
	}
}
