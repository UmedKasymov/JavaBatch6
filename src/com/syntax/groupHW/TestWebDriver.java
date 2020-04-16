package com.syntax.groupHW;

public class TestWebDriver {

	public static void main(String[] args) {
		RemoteWebDriver chrome=new ChromeDriver();
		RemoteWebDriver firefox=new FirefoxDriver();
		RemoteWebDriver safari=new SafariDriver();
		RemoteWebDriver[] array={chrome,firefox,safari};
		for(int i=0;i<array.length;i++) {
			array[i].open();
			String str=array[i].getTitle();
			System.out.println(str);
			array[i].navigate();
			array[i].getScreenshot();
			array[i].close();
			System.out.println("==========================");
		}
	}
}
class ChromeDriver implements RemoteWebDriver{
	@Override
	public void open() {
		System.out.println("Chrome Broswer opens");
	}
	@Override
	public void close() {
		System.out.println("Chrome Broswer has closed");
	}
	@Override
	public String getTitle() {
		String title="www.syntaxtechs.com";
		return title;
	}
	@Override
	public void getScreenshot() {
		System.out.println("Screenshot has been taken");
	}
	@Override
	public void navigate() {
		System.out.println("Navigating web page");
	}
}
class FirefoxDriver implements RemoteWebDriver{
	@Override
	public void open() {
		System.out.println("Firefox Broswer opens");
	}
	@Override
	public void close() {
		System.out.println("Firefox Broswer has closed");
	}
	@Override
	public String getTitle() {
		String title="www.syntaxtechs.com";
		return title;
	}
	@Override
	public void getScreenshot() {
		System.out.println("Screenshot has been taken");
	}
	@Override
	public void navigate() {
		System.out.println("Navigating web page");
	}
}
class SafariDriver implements RemoteWebDriver{
	@Override
	public void open() {
		System.out.println("Safari Broswer opens");
	}
	@Override
	public void close() {
		System.out.println("Safari Broswer has closed");
	}
	@Override
	public String getTitle() {
		String title="www.syntaxtechs.com";
		return title;
	}
	@Override
	public void getScreenshot() {
		System.out.println("Screenshot has been taken");
	}
	@Override
	public void navigate() {
		System.out.println("Navigating web page");
	}

}
