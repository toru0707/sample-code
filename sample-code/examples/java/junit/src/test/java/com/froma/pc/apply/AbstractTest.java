package com.froma.pc.apply;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AbstractTest {

	protected String baseUrl;
    protected WebDriver driver;
	
	protected JobDetailPage getJobDetailPageByRqmtId(String rqmtId){
		driver.navigate().to(baseUrl + rqmtId);
		return PageFactory.initElements(driver, JobDetailPage.class);
	}
}
