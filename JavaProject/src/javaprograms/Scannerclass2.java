package javaprograms;

import java.util.Scanner;

public class Scannerclass2 {
	public int sum(int a, int b)
	{
	
	return a+b;
	}
	public int sub(int a, int b)
	{
		return a-b;
	}
	public int mul(int a , int b)
	{
	return a*b;
			
    }
	public int div(int a, int b)
	{
	return a/b;
	}
	
	public static void main(String[] args) 
	{
		Scannerclass2 sc=new Scannerclass2();
		Scanner s=new Scanner(System.in);
		System.out.println("enter x1 value");
		int x1=s.nextInt();
		System.out.println("enter x2 value");
		int x2=s.nextInt();
		System.out.println("enter x3 value");
		int x3=s.nextInt();
		System.out.println("enter x4 value");
		int x4=s.nextInt();
		System.out.println("enter x5 value");
		int x5=s.nextInt();
		System.out.println("enter x6 value");
		int x6=s.nextInt();
		int mulres=sc.mul(x1,x2);
		int subres=sc.sub(mulres,x3);
		int addres=sc.sum(subres,x4);
		int subres1=sc.sub(addres, x5);
		int divres=sc.div(subres1, x6);
		System.out.println("the final answer is "+ divres);
		
	}
}
