package Selenium;

public class DemoGuru99Chrome {

	public static void main(String[] args) {

		
		Guru99Chrome gc = new Guru99Chrome();
		
		gc.invokeBrowser();
		
		gc.login("mngr188002", "hehYryr");
		
		gc.printTitleOfThePage();
		
		gc.newCustomer();
		
		String customerId = gc.getCustomerId();
		
		System.out.println(customerId);
		
		//gc.addNewAccount(customerId);
		
		
	}

}
