package com.syntax.class23;

public class WebDriver {

	public void open() {
		System.out.println("Opening browser");
	}
}

class FirefoxDriver extends WebDriver{
	public void open() {
		System.out.println("Opening firefox browser");
	}
}
class InternetExplorerDriver extends WebDriver{
	public void open() {
		System.out.println(" ");
	}
}