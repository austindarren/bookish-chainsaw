
class Run{
	
	private int a = 10;
	
	public int get() {
		
		return a;
	}
	public void set(int a) {
		this.a= a;
		
	}
}

public class GetSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Run r1 = new Run();
		System.out.println(r1.get());
		r1.set(20);
		System.out.print(r1.get());
	}

}
