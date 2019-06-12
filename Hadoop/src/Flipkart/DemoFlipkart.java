package Flipkart;

public class DemoFlipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlipkartLogin f = new FlipkartLogin();
		
		f.invokeBrowser();
		
		f.CloseModal();
		
		f.ClickCategory();
		
		f.enterSearchText("apple watches");
		
	}

}
