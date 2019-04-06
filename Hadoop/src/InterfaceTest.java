interface sampleb {
		
	void wish();
}

interface samplec extends sampleb{
	void move();
	
}

class demo  implements samplec{
 public void wish() {
	 
	 System.out.println("wishing");
 }
 
 public void move() {
	 
	 System.out.println("moving wish");

 }
	
	
}

public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo d = new demo();
		d.move();
		d.wish();
	}

}
