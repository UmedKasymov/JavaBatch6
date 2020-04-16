package com.syntax.groupHW;

public interface RemoteWebDriver extends WebDriver,TakesScreenshot{
	void navigate();
}
interface WebDriver {
	void open();
	void close();
	String getTitle();
}
interface TakesScreenshot {
	void getScreenshot();
}