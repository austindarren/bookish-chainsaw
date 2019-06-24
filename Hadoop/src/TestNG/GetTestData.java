package TestNG;

import org.testng.annotations.Test;

public class GetTestData {

	@Test
	public void data(String userid, String pass) {
		
		System.out.println("userid: "+userid + "& pass: "+pass);
	}
}
