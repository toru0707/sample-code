package com.froma.sp.baito.appl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplyConfirmPage {

	private WebDriver driver;

	@FindBy(className = "jsc-link-double-submit")
	@CacheLookup
	private WebElement btnApplyConfirmUpper;

	public ApplyDonePage confirmApplyUpper() {
		btnApplyConfirmUpper.click();
		return PageFactory.initElements(driver, ApplyDonePage.class);
	}
}
