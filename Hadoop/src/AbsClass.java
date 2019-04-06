abstract class Run1{
	
	abstract void test1(); 
	
}

class Run2 extends Run1 {
	
	void test1() {
		
		System.out.println("override without fear");
	}
}

public class AbsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Run2 w = new Run2();
		
		w.test1();
		
	}

}
