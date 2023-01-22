package javaprograms;

public class thisusingmethod {
	
	public void method1()
	{
	System.out.println("one parameterized method")	;
	
	}
	public void method2()
	{
		this.method4();
		this.default1();
		this.method1();
		this.method3();
		
		
	System.out.println("two parameterized method");	
	}
	public void method3()
	{
		System.out.println("three parameterized method");
	}
	public void  method4()
	{
		System.out.println("four parameterized method");
	}
	public void default1()
	{
		System.out.println("default parameterized method");
	}

	
	public static void main(String[] args) {
		thisusingmethod th=new thisusingmethod();
		th.method2();
		
	}
}
