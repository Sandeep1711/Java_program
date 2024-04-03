package Practice;

public class IllegalArgumentException {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\path\\chromedriver.exe");
		 
		//WebDriver driver = new ChromeDriver();
		
		// If we don't pass http or https protocol , we will get IllegalArgumentException
		// driver.get(www.google.com);   
	
	}

}
