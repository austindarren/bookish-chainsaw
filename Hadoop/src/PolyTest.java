abstract class shape {
	
	void rotate (){
		
		System.out.println("rotate shape");
	}
	
	abstract void area();
	
}

class rectangle extends shape{

	void rotate (){
		
		System.out.println("rotate rectangle");
	}
	
void area (){
		
		System.out.println("area rectangle");
	}
	
	
}

class circle extends shape{


void area (){
		
		System.out.println("area circle");
	}
	
	
}



public class PolyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//circle c1= new circle();
		//c1.rotate();

		//shape s1 = new circle();
		//s1.rotate();
		
		shapebehav(new circle());
		shapebehav(new rectangle());
		//shapebehav(c1);
		
	}
	
	static void shapebehav(shape s1) {
		
		s1.area();
		s1.rotate();
	}

}
