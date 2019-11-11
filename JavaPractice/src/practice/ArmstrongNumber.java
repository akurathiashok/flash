/**
 * 
 */
package practice;

/**
 * @author aakurathi
 *
 */
public class ArmstrongNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int n=153;
		int temp=n;
		int rem, sum=0;
		while(n>0)
		{
			rem=n%10;
			n=n/10;
			sum=sum+rem*rem*rem;
		}
		if (temp == sum)
		{
			System.out.println(n+ "It is a Armstrong Number");
		}
		else
		{
			System.out.println(n+ "It is not an Armstrong Number");
		}

	}

}
