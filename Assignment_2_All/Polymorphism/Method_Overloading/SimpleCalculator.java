package Method_Overloading;

public class SimpleCalculator {
	
	public void calculate(int a,int b) 
	{
	System.out.println("addition of int		"+(a+b));		
	System.out.println("subtraction of int	"+(a-b));		
	System.out.println("multiplication of int "+(a*b));		
	System.out.println("division of int 	"+(a/b));		
	}
	
	public void calculate(double a,double b) 
		{
		System.out.println("addition of double 		"+(a+b));		
		System.out.println("subtraction of double	"+(a-b));		
		System.out.println("multiplication of double "+(a*b));		
		System.out.println("division of double 		"+(a/b));			
		}
	
	public void calculate(int a,int b,int c) 
		{
		System.out.println("addition of int 3 parameter "+(a+b+c));		
		System.out.println("subtraction of int 3 parameter "+((a-b)-c));		
		System.out.println("multiplication of int 3 parameter "+a*b*c);		
		System.out.println("division of int 3 parameter "+(a/b)/c);		
		}
	
	public static void main(String[] args) {
		SimpleCalculator sc=new SimpleCalculator();
		System.out.println("----------------------------");
		sc.calculate(90,30);
		System.out.println("----------------------------");
		sc.calculate(12.34,3.14);
		System.out.println("----------------------------");
		sc.calculate(1,2,3);
		
		
	}

}
