package base;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Util {
	public WebDriver driver;
	
	public Util(WebDriver driver){
		this.driver=driver;
	}
	
	public ArrayList getActualValue(List<WebElement> elements){
		SoftAssert ar=new SoftAssert();
		ArrayList array=new ArrayList();
				for(WebElement element:elements){
					array.add(element.getText());
				}
				System.out.println(array);
				String [] expectedValue={"main menu","Christmas","gift ideas","clothing"};
				for(int i=0;i<=array.size();i++){
					ar.assertEquals(array.get(i), expectedValue[i]);
					ar.assertAll();
					//Assert.assertEquals(array.get(i), expectedValue[i]);
					System.out.println(array.get(i) + "   match  " + expectedValue[i]);
				}
				return array;
		
	}
	
	public void clickonElement(){
		driver.findElement(By.xpath("//a[@id='js-toggleLeftNavLg']")).click();
	}

}
