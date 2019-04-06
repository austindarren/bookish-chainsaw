interface shape1 {
	
	void rotate ();
	
	 void area();
	
}

class rectangle1 implements shape1{

	public void rotate (){
		
		System.out.println("rotate rectangle");
	}
	
public void area (){
		
		System.out.println("area rectangle");
	}
	
	
}




public class InterPoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//shape s1 = new circle();
		//s1.rotate();
		
		
		shapebehav(new rectangle1());
		
	}
	
	static void shapebehav(shape1 s1) {
		
		s1.area();
		s1.rotate();
	}

}


