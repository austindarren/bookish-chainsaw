package Amazon;

public class DemoAmazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AmazonBrowser  amBrowse = new AmazonBrowser();
		
		amBrowse.invokeBrowser();
		
		amBrowse.searchDropDown("apple watch", "Electronics");
		
		System.out.println(amBrowse.getProductName(5)); 
		
		amBrowse.getAllProducts();
	}

}
