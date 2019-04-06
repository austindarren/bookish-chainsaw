
public class DivisibleBy5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean d = divide(51);
		System.out.println(d);
	}
   static boolean divide(int a) {
	   if (a%5==0) {
		   return true;
	   }
	   else return false;
   }
}
