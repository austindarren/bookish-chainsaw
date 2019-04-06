
public class Dog {
	int a1;
	String c1;
	String b1;
	public Dog(int size, String color, String breed) {
		
		 a1= size;
		 c1 = color;
		 b1 = breed;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d1 = new Dog(5,"Black","Mastiff");
	

		System.out.println("size="+d1.a1);
	}

}
