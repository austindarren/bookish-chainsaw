class Drink{
	int k =5;
	void drinkit() {
		System.out.print(k);
	}
	
}

class Tea extends Drink{
	
	String t1="green tea";
	void SpillIt() {
		System.out.print(t1);
	}
	
}

class Beer extends Drink{
	
	String n = "fosters";
	void EnjoyIt() {
		System.out.print(n);
	}
}

public class DrinkTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tea t2= new Tea();
		System.out.println(t2.k);
		
		Beer b1= new Beer();
		System.out.print(b1.k);
	}

}
