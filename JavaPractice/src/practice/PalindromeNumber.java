/**
 * 
 */
package practice;

/**
 * @author aakurathi
 *
 */
public class PalindromeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int n=121;
		int temp=n;
		int rem, sum=0;
		while(n>0)
		{
			rem=n%10;
			n=n/10;
			sum=sum*10+rem;
		}
		if(temp==sum)
		{
			System.out.println(sum+ " Is a Palindrome");
		}
		else
		{
			System.out.println(sum+ " Is not a Palindrome");
		}
	}

}
