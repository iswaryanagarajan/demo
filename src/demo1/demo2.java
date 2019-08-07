package demo1;

public class demo2 {

	public static void main(String[] args) {
		int x=3; 
		if(x % 2 == 1) 
		{
		System.out.println("Number is odd");
		}
		else
	{
		System.out.println("Number is even");
		}
		int [] a={10,2,3,4,5,8,9,25};
		for(int i=0;i<a.length;i++)
		{
		if(a[i] % 2 ==0)
		{
		System.out.println("The number is even");
		}
		else 
		{
		System.out.println("The number is odd");
		}
		System.out.println(a[i]);	
		}
	}
}
