import java.util.Arrays;

public class NumbersPrint {
	public static int[] a=new int[20];
	/**public String toString()
	{
		return String.format("%s", a);
	}**/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=0;
		while(i<=9)
		{
			a[i]=i;
			a[19-i]=i;
						
			//System.out.println(a);
			i++;
		}
		System.out.println(Arrays.toString(a));
	/**for(int j=0;j<=19;j++)
	{
		System.out.println(a[j]);
	}**/
		
	}
		
}
