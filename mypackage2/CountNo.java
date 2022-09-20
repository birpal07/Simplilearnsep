package mypackage2;

import java.util.Scanner;

public class CountNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String");
		String s = sc.nextLine();
		int count = countNumberOfwords(s);
		System.out.println("the number of words count is "+count);
	}

	private static int countNumberOfwords(String s) {
		// TODO Auto-generated method stub
		int count=0;
		if(s.charAt(0)!=' ')
		{
			count++;
		}
	 for(int i=0;i<s.length();i++)
	 {
		 if(s.charAt(i)==' '&&s.charAt(i+1)!=' ')
		 {
			 count++;
		 }
	 }
	 return count;
	}

}
