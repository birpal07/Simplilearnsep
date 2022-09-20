package mypackage2;

import java.util.Scanner;

public class AreaOfTraingle {
	static double AOC(double p,double a)
	{
	   //System.out.println("Area of Traingle is");
	   
	   return ((p*a)/2);
	}
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in); 
				System.out.println("Enter the lenth");
			     double p = sc.nextDouble();
				//Scanner sc1 = new Scanner(System.in); 
					System.out.println(System.in);
					double a = sc.nextDouble();
					double Area = AOC(p,a);
					 System.out.println(Area);
		}


 }


