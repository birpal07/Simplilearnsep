package mypackage2;

public class avgTNO {
            
	int avg(int a,int b,int c )
	{
		int av = (a+b+c)/2;
				return av;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       avgTNO s = new avgTNO();
       System.out.println("The avg of 3 no is "+s.avg(45, 20, 88));
	}

}
