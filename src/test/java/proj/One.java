package proj;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
public class One {
	

		public static void main(String[] args) 
		{
			
			String path ="C:\\Users\\admin\\eclipse-workspace_javaprog\\projectNEW\\browser\\chromedriver.exe";
	       System.setProperty("webdriver.chrome.driver", path);
	       WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://mvnrepository.com");
	       String Title=driver.getTitle();
	       System.out.println("title");
	       driver.close();
	      		}
}

