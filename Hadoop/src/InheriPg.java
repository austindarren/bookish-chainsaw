
  class InheriPg1 {

	static int i=60;
	int j =70;
	
}

 class InheriPg2 extends InheriPg1 {
	
	static int k=70;
	
}
 
 public class InheriPg{
 
 public static void main (String[] args) {
	 
	 InheriPg2 pg1= new InheriPg2();
	 
	 System.out.println(pg1.j);
	 
 }
}