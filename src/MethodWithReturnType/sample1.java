package MethodWithReturnType;

public class sample1 
{	
	//Example of method with return with
	//return type --> void, int , String
	
	public static void main(String[] args)
	{		
		int num1 = add(10, 20);
		System.out.println(num1);
		
		System.out.println("---");
		
		System.out.println(add(5, 6));
				
		System.out.println("-------------------------------");
		
		sample1 s1=new sample1();
		int num2 = s1.mul(9, 7);
		System.out.println(num2);
		
		System.out.println("-------");
		
		System.out.println(s1.mul(4, 3));	
		
		System.out.println("------------------------------");
		
		String s5 = sample2.convertNameToUpperCase("vishal");
		System.out.println(s5);
		
		System.out.println("----");
		
		System.out.println(sample2.convertNameToUpperCase("sourabh"));		
	}
	
	//method with int return type
	public static int add(int a, int b) 
	{
		int c=a+b;     //5+6
		return c;
	}
	
	
	//method with int return type
	public int mul(int c, int d)
	{
		int multValue=c*d;
		return multValue;
	}
}
