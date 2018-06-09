package org.com.MavenSeleProject;

public class ArrayClass {

	public static void main(String[] args){
		
		method1();

	}
	
	public static void method1() 
	{
		int cash=300000;
		int withdraw=15000;
		if(withdraw>10000)
		{
			throw new BankException("You cannnot withdrawal more than 10000.");
		}
		else if(withdraw>cash)
		{
			System.out.println("Insifficient bal");
		}
		else
		{
			System.out.println("Thanks..");
		}
	}

}
