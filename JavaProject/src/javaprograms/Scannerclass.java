package javaprograms;

import java.util.Scanner;

public class Scannerclass {
	
	public int add(int x1,int x2)
	{
		int addresult=x1+x2;
		return addresult;
		
	}
	public int sub(int x1,int x2)
	{
		int subresult=x1-x2;
		return subresult;
	}
	public int multiply (int x1, int x2)
	{
		int multiresult=x1*x2;
		return multiresult;
	}
	public int divide(int x1, int x2)
	{
		int divresult=x1/x2;
		return divresult;
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter X1 value");
		int x1=sc.nextInt();
		System.out.println("Enter X2 value");
		int x2=sc.nextInt();
		System.out.println("Enter X3 value");
		int x3=sc.nextInt();
		System.out.println("Enter X4 value");
		int x4=sc.nextInt();
		System.out.println("Enter X5 value");
		int x5=sc.nextInt();
		System.out.println("Enter X6 value");
		int x6=sc.nextInt();
		Scannerclass sc1=new Scannerclass();
		int addresult=sc1.add(x1, x2);
		int addresult1=sc1.add(addresult,x3);
		int subresult=sc1.sub(addresult1, x4);
		int divresult=sc1.divide(subresult, x5);
		int multiresult=sc1.multiply(divresult,x6);
		System.out.println("the answer is "+multiresult);
		
	}

}
