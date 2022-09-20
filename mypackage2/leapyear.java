package mypackage2;

import java.util.Scanner;

public class leapyear {
	static boolean LeapY(int Year) {
		boolean a = (Year % 4) == 0;
        boolean b = (Year % 100) != 0;
        boolean c = ((Year % 100 == 0) && (Year % 400 == 0));

        return a && (b || c);
}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year ");
		int Year = sc.nextInt();
		System.out.println(LeapY(Year));
	}

}
