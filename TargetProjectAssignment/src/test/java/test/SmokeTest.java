package test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;
import base.Util;

public class SmokeTest extends BaseTest {
  
	Util util;
	@Test
  public void test() {
		util=new Util(driver);
		//driver.findElement(By.xpath("//a[@id='js-toggleLeftNavLg']")).click();
		util.clickonElement();
		util.getActualValue(driver.findElements(By.xpath("//nav[@id='leftNavigation']/ul[2]/li")));
  }
}
