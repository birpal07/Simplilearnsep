package mypackage2;

public class smNO {
                        
	int SmallestNo(int a,int b, int c)
	{
		if((a<b)&&(a<c))
		{
		  //System.out.println("The Smallest no is " +a);
		  return a;
		}
		else if((b<a)&&(b<c))
		{
			//System.out.println("The Smallest no is " );
			return b ;
		}
		else
			//System.out.println("The Smallest no is ");
		    return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		smNO s = new smNO();
		System.out.println("the smallest no is "+s.SmallestNo(20, 40,60));

	}

}
