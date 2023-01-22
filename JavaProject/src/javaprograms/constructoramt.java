package javaprograms;

public class constructoramt {
	
	
	public constructoramt()
	{
		this(80,90,100);
		System.out.println("default constructor");
	}
	public constructoramt(int a, int b, int c)
	{
		System.out.println("three parameterized constructor");
	}
	public constructoramt(int a)
	{
		this();
		System.out.println("one parametrized constructor");
	}
	public constructoramt(int a, int b,int c, int d)
	{
		this(70);
		System.out.println("four parameterized constructor");
	}
	public constructoramt(int a, int b)
	{
		this(30,40,50,60);
		System.out.println("two parameterized constructor");
	}
	public static void main(String[] args) {
		
		constructoramt ca=new constructoramt(10,20);
	
		
	}
	

}
