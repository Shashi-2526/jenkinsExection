package jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TryToTest {
	@Test
	public void test() {
		WebDriver driver=new ChromeDriver();
		Reporter.log("window launch successfully",true);
	}

}
