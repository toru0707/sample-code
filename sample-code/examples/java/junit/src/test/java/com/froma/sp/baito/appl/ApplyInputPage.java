package com.froma.sp.baito.appl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplyInputPage {
	private WebDriver driver;

	@FindBy(name = "kanji_smi")
	@CacheLookup
	private WebElement txtfFurigana;

	@FindBy(name = "hrgn_smi")
	@CacheLookup
	private WebElement txtfKanjiSimei;

	@FindBy(name = "tel_no")
	@CacheLookup
	private WebElement txtfPhone;

	@FindBy(name = "brth_year")
	@CacheLookup
	private WebElement selBrthYear;

	@FindBy(name = "brth_mnth")
	@CacheLookup
	private WebElement selBrthMnth;

	@FindBy(name = "brth_dy")
	@CacheLookup
	private WebElement selBrthDay;

	@FindBy(name = "cur_jb_cd")
	@CacheLookup
	private WebElement selJob;

	@FindBy(className = "jsc-link-form-submit")
	@CacheLookup
	private WebElement btnApplyUpper;
	
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
		btnApplyUpper.click();
		return PageFactory.initElements(driver, ApplyConfirmPage.class);
	}

}
