import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxlaunch {

	public static void main(String[] args) throws Exception {
		WebDriver driver= new FirefoxDriver();
		System.out.println("browser launched");
		Thread.sleep(3000);
		driver.get("https://www.greatandhra.com");
		System.out.println("website opened");
		driver.close();
		System.out.println("browser closed");
		

	}

}
