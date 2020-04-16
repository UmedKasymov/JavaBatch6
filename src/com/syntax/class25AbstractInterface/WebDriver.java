package com.syntax.class25AbstractInterface;

interface TakesScreenshots{
	
	String fileExtension=".png";
	
	void takePicture();
	static void takeSelfie() {//no one can override it. This method will not impact your 
		                      //child classes.
		System.out.println("I can take selfies");
	}
	
	default void takePanoramivPic() {
		System.out.println("I can take panoramic pictures");
	}
}

public interface WebDriver {

	/*Create a WebDriver Interface that will have the following
	 * unimplemented behavior: openBrowser(), finElement().
	 * 
	 * Create 2  classes that implements WebDriver inteface:
	 *ChromeDriver and FirefoxDriver
	 * 
	 */
	void openBrowser();
	void closeBrowser();
	void maximizeWindow();
	void findElement();
	} class ChromeDriver implements WebDriver{
	@Override
	public void openBrowser() {
	System.out.println("We can open Chrome");
	}
	@Override
	public void closeBrowser() {
	System.out.println("we can close Chrome");
	}
	@Override
	public void maximizeWindow() {
	System.out.println("We can maximize Chrome window");
	}
	@Override
	public void findElement() {
	System.out.println("We can find element in Chrome");
	}
	}class FireFoxDriver implements WebDriver{
	@Override
	public void openBrowser() {
	System.out.println("We can open FireFox");
	}
	@Override
	public void closeBrowser() {
	System.out.println("We can close FireFox");
	}
	@Override
	public void maximizeWindow() {
	System.out.println("We can maximize FireFox window");
	}
	@Override
	public void findElement() {
	System.out.println("We can find elements in FireFox");
	}
}
