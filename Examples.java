
public class Examples {

	public static void main(String[] args) {
	
		WebDriver driver  = new FirefoxDriver();
				driver.navigate().to("http://google.com");
				String appTitle = driver.getTitle();
				System.out.println("Application title is :: "+appTitle);
				driver.quit();
			}

		}