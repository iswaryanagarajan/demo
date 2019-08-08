package demo1;

public class new2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver","C:\\Users\\LKB-L-039\\Downloads\\IEDriverServer_Win32_3.14.0.zip\\IEDriverserver.exe");
		WebDriver driver= new InternetExplorerDriver();
		driver.get("http://demo.automationtesting.in/");
	}
}