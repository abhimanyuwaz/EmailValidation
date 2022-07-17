package validation;

import java.util.Scanner;

public class EmailValidation 
{

	static String email;
	
	public static void main(String args[])
	{
		System.out.println("Enter the email :");
		Scanner sc = new Scanner(System.in);
		email  =  sc.nextLine();
		emailvalidattion(email);
		
	}
	
	public static void emailvalidattion(String email)
	{
	
		String stringarr[] = new String[5];
		
		stringarr[0]="abhimanyu@gmail.com";
		stringarr[1]="test@viavi.com";
		stringarr[2]="test@gamil.com";
		stringarr[3]="abhi@gmail.com";
		stringarr[4]="testing@gmail.com";

		boolean flag=false;
		
		for(int i=0;i<stringarr.length;i++)
		{
	
			
			if ( email.equals(stringarr[i] ))
			{
			
	            System.out.println( "EMAIL FOUND :");
				flag=true;
			
			}
			
			
		}
		
		if(!flag)
		{
			
			System.out.println(" ::  Not Found ::  ");	
			
		}
	
	
	
	
	}
	
	
}
