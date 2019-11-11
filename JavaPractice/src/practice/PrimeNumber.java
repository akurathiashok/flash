/**
 * 
 */
package practice;

/**
 * @author aakurathi
 *
 */
public class PrimeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int num=3;
		boolean isPrime=true;
		for (int i=2;i<num;i++)
		{
			if(num%2==0)
			{
				isPrime=false;
				break;
			}
		}
		if(isPrime)
		{
			System.out.println(num+" is a Prime Number");
		}
		else
		{
			System.out.println(num+ "is not a Prime Number");
		}

	}

}
