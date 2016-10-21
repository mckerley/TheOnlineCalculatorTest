package automation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FloatingPointTest {
	private Calculator calc;
	private WebDriver driver;
	
	@Before
	public void setUp(){
		String url = "http://www.theonlinecalculator.com/";
		
		System.setProperty("webdriver.chrome.driver", "/home/michael/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get(url);
		
		calc = new Calculator(driver);
	}
	
	@Test
	public void sqRootTest(){
		int counter = 0;
		calc.add(1, 1);
		while(!calc.output().equals("1")){
			counter++;
			calc.sqRoot();
			if(counter == 100){
				System.out.println(calc.output());
				break;
			}
		}
		System.out.println(counter);
	}
	
	@Test
	public void percentTest(){
		int counter = 0;
		calc.mult(1, 1);
		for(counter = 0; counter < 200; counter++){
			calc.percent();
			if(calc.output().equals("0")){
				System.out.println(counter);
				break;
			}
		}
	}
	
	@After
	public void tearDown(){
		driver.quit();
	}
}
