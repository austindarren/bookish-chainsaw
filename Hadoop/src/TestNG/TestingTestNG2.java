package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestingTestNG2 {
  @Test(priority=550)
  public void tc100() {
	  System.out.println("tc100");
  }
  @Test(priority=100, enabled=false)
  public void tc1200() {
	  System.out.println("tc2100");
  }
  @Test(priority=-1000)
  public void tc300() {
	  System.out.println("00");
  }
  @BeforeMethod
  public void tc6() {
		System.out.println("beforemethod");
  }
  @AfterMethod
  public void tc5() {
		System.out.println("aftermethod");
  }
}
