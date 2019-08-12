package demo1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class new2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\LKB-L-039\\Desktop\\Chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/");
	}
}