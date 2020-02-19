package come.selenium.one;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

	public static void main(String[] args) {
		
		WebDriver driver ;
		System.setProperty("webdriver.chrome.driver", "C:\\Brwser_Drivers\\chromedriver.exe");		
		driver= new ChromeDriver();
		driver.get("https://stackoverflow.com/questions/16689426/how-to-set-google-chrome-in-webdriver");

	}

}
