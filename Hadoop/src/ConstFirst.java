

public class ConstFirst {

	
	String fname;
	public ConstFirst(String name) {
		System.out.println("inside");
		fname = name;
		
				
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstFirst f= new ConstFirst("lilly");
		
		
		System.out.println(f.fname);
	}

}
