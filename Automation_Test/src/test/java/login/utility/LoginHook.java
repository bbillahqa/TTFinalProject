package login.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class LoginHook {
		private static WebDriver chromeDriver;
		private static WebDriver fireDriver;

		@Before("@chrome")
		public void setUpChrome() {
			System.setProperty("webdriver.chrome.driver", "/Users/luxicate/Downloads/chromedriver");
			chromeDriver = new ChromeDriver();

		}

		@Before("@firefox")
		public void setUpFirefox() {
			System.setProperty("webdriver.firefox.driver", "/Users/luxicate/Downloads/geckodriver");
			fireDriver = new FirefoxDriver();

		}

		@After("@chrome")
		public void tearDownChrome() {
			chromeDriver.quit();
		}

		@After("@firefox")
		public void tearDownFirefox() {
			fireDriver.quit();
		}

		public static WebDriver getChromeDriver() {
			return chromeDriver;
		}

		public static WebDriver getFireDriver() {
			return fireDriver;
		}
	}


