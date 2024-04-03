package Practice;

public class IllegalStateException {

	public static void main(String[] args) {
	
		// If We will set "Webdriver" instead of "webdriver" - It will throw IllegalStateException
		System.setProperty("webdriver.chrome.driver", "D:\\path\\chromedriver.exe");
 
		//WebDriver dd = new ChromeDriver();
		
		System.out.println("chrome browser");

	}

}
