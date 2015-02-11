package com.froma.pc.apply;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplyInputPage {
	private WebDriver driver;

	@FindBy(id = "")
	@CacheLookup
	private WebElement txtfFurigana;

	@FindBy(id = "")
	@CacheLookup
	private WebElement txtfKanjiSimei;

	@FindBy(id = "")
	@CacheLookup
	private WebElement txtfPhone;

	@FindBy(id = "")
	@CacheLookup
	private WebElement selBrthYear;

	@FindBy(id = "")
	@CacheLookup
	private WebElement selBrthMnth;

	@FindBy(id = "")
	@CacheLookup
	private WebElement selBrthDay;

	@FindBy(id = "")
	@CacheLookup
	private WebElement selJob;

	public ApplyInputPage typeFurigana(String furigana) {
		txtfFurigana.sendKeys(furigana);
		return this;
	}

	public ApplyInputPage typeKanjiSimei(String kanjiSimei) {
		txtfKanjiSimei.sendKeys(kanjiSimei);
		return this;
	}

	public ApplyInputPage typePhone(String phone) {
		txtfPhone.sendKeys(phone);
		return this;
	}

	public ApplyInputPage selectBrthYear(String brthYear) {
		selBrthYear.sendKeys(brthYear);
		return this;
	}

	public ApplyInputPage selectBrthMnth(String brthManth) {
		selBrthMnth.sendKeys(brthManth);
		return this;
	}

	public ApplyInputPage selectBrthDay(String brthDay) {
		selBrthDay.sendKeys(brthDay);
		return this;
	}

	public ApplyInputPage selectJob(String job) {
		selJob.sendKeys(job);
		return this;
	}
	
	public ApplyConfirmPage submitApply(){
		return PageFactory.initElements(driver, ApplyConfirmPage.class);
	}

}
