class A1 {
	void m1() {
		
		System.out.println("a of m1");
	}
	
}

class B1 extends A1 {
	
	void m2() {
		System.out.println("b of m2");	
		
	}
	
}

class C1 extends B1 {
	
	void m3() {
		System.out.println("c of m3");	
		
	}
	
}


public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A1 rv1 = new B1();
		rv1.m1();
		
		B1 rv2 = new C1();
		rv2.m1();
		rv2.m2();
		
		
	}

}
