package com.froma.sp.baito;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.froma.sp.baito.appl.ApplyInputPage;

public class JobDetailPage {
	private WebDriver driver;

	@FindBy(className = "jsc-apply-link")
	@CacheLookup
	private WebElement btnApplyUpper;
	
	public ApplyInputPage goToApplyPageWithApplyUpper(){
		btnApplyUpper.click();
		return PageFactory.initElements(driver,ApplyInputPage.class);
	}
}
