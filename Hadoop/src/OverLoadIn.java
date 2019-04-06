 class A {
 void move() {
	 System.out.print("move south");
 }
 }
 class B extends  A{
	 void move() {
		 System.out.println("move north");
		 
	 }
	 
 }
 
 class C extends  A{
	 	 
 }




public class OverLoadIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b1 = new B();
		b1.move();
		C c1= new C();
		c1.move();
		
		
	}

}
