package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Calculator {
	private WebElement calc;
	
	public Calculator(WebDriver driver){
		this.calc = driver.findElement(By.id("calculator"));
	}
	private String intToStr(int a){
		switch (a){
			case 0: return "zero";
			case 1: return "one";
			case 2: return "two";
			case 3: return "three";
			case 4: return "four";
			case 5: return "five";
			case 6: return "six";
			case 7: return "seven";
			case 8: return "eight";
			case 9: return "nine";
			default: return "invalidnumber";
		}
	}
	public Calculator add(int a, int b){
		calc.findElement(By.name(intToStr(a))).click();
		calc.findElement(By.name("add")).click();
		calc.findElement(By.name(intToStr(b))).click();
		calc.findElement(By.name("calculate")).click();
		return this;
	}
	
	public Calculator sub(int a, int b){
		calc.findElement(By.name(intToStr(a))).click();
		calc.findElement(By.name("subtract")).click();
		calc.findElement(By.name(intToStr(b))).click();
		calc.findElement(By.name("calculate")).click();
		return this;
	}
	
	public Calculator mult(int a, int b){
		calc.findElement(By.name(intToStr(a))).click();
		calc.findElement(By.name("multiply")).click();
		calc.findElement(By.name(intToStr(b))).click();
		calc.findElement(By.name("calculate")).click();
		return this;
		
	}
	
	public Calculator div(int a, int b){
		calc.findElement(By.name(intToStr(a))).click();
		calc.findElement(By.name("divide")).click();
		calc.findElement(By.name(intToStr(b))).click();
		calc.findElement(By.name("calculate")).click();
		return this;
	}
	
	public Calculator sqRoot(){
		calc.findElement(By.name("root2")).click();
		return this;
	}
	
	public Calculator addButton(){
		calc.findElement(By.name("add")).click();
		return this;
	}
	
	public Calculator subButton(){
		calc.findElement(By.name("subtract")).click();
		return this;
	}
	
	public Calculator multButton(){
		calc.findElement(By.name("multiply")).click();
		return this;
	}
	
	public Calculator divButton(){
		calc.findElement(By.name("divide")).click();
		return this;
	}
	
	public Calculator decimal(){
		calc.findElement(By.name("decimal")).click();
		return this;
	}
	
	public Calculator number(int a){
		return this;
	}
	
	public Calculator percent(){
		calc.findElement(By.name("percentButton")).click();
		return this;
	}
	public String output(){
		return calc.findElement(By.name("display")).getAttribute("value");
	}
	
	

}