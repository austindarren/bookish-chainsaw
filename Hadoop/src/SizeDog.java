class Size{
	
	private int s;
	
	public int get1() {
		
		return s;
	}
	
	public void set1(int s) {
			if (s>5) {

			this.s=s;
		}
			else
			{
				
				System.out.println("error");
			}
		
	}
}



public class SizeDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Size sq  = new Size();
		sq.set1(6);
		System.out.println(sq.get1());
		

	}

}
