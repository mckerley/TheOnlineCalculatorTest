package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

import org.junit.*;

public class ArithmaticTest {
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
	public void additionTest() {
		calc.add(1, 1);
		assertEquals(calc.output(), "2");
	}
	
	@Test
	public void subtractionTest() {
		calc.sub(1,1);
		assertEquals(calc.output(), "0");
	}
	
	@Test
	public void multiplicationTest() {
		calc.mult(5, 1);
		assertEquals(calc.output(),"5");
	}
	
	@Test
	public void divisionTest(){
		calc.div(1, 1);
		assertEquals(calc.output(),"1");
	}
	
	@After
	public void tearDown(){
		driver.quit();
	}

}
