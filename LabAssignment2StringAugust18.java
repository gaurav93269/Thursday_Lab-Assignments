/*Q-3, 
1)Write the to reverse each word of the string.
2)Write the program to accept the string from user and check it is 
    palindrome or not without using function of string bulder and string buffer
*/
import java.util.Scanner;
public class LabAssignment3StringAugust18
{
      public static void main(String[] args) 
        {
            // TODO Auto-generated method stub
	reverse();
	palindrome();
        }
	public static void reverse()
	{
		String s="GAURAV";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("Reverse of String is :"+rev);
		
	}
	public static void palindrome()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a string  to check palindrome or  not ");
		String str=sc.next();
		
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev))
		{
			System.out.println("it is palindrome ");
		}
		else
		System.out.println("it is not palindrome ");
	}
}

