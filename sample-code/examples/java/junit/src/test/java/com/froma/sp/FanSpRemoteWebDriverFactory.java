package com.froma.sp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FanSpRemoteWebDriverFactory {

	public static RemoteWebDriver create() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "iPhone 6");
		capabilities.setCapability("platformName", "iOS");
		capabilities.setCapability("platformVersion", "7.1");
		capabilities.setCapability("browserName", "safari");
		return new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),
				capabilities);
	}
}
