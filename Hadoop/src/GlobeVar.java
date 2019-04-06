
public class GlobeVar {

	static int j=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start main");
		System.out.println(j);
		second();
	}
	
	public static void second() {
		System.out.println("start sub");
		System.out.println(j);
		System.out.println("end sub");
	}

}
