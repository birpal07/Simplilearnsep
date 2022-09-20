package mypackage2;
import java.util.Scanner;

public class middlechar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner in = new Scanner(System.in);
		System.out.println("Input a string ");
		String str = in.nextLine();
		System.out.println("The middle char of String is "+middlechar1(str)+"\n");
		
      
	}
	public static String middlechar1(String str)
	{
		int position;
		int length;
		if((str.length())%2==0)
		{
			position=(str.length())/2-1;
			length=2;
		}
		else {
			position=(str.length())/2;
			length=1;
		}
		return str.substring(position,position+length);
		//return str.substring(position, position + length);	
	}

}
