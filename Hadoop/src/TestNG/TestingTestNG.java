package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestingTestNG {
  @Test(priority=0)
  public void tc1() {
	  System.out.println("tc1");
  }
  @Test(priority=1, enabled=false)
  public void tc2() {
	  System.out.println("tc2");
  }
  @Test(priority=-1)
  public void tc3() {
	  System.out.println("tc3");
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
