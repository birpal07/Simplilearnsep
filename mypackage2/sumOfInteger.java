package mypackage2;

import java.util.Scanner;

public class sumOfInteger {
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the no");
         int num= sc.nextInt();
         System.out.println("The sum of integer of no = "+SUM(num));
	}

	private static int SUM(int num) {
		// TODO Auto-generated method stub
	int sum;
		for(sum=0;num>0;sum= sum + num%10,num=num/10);
	
		return sum;
	}

}
