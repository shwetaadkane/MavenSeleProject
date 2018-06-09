package org.com.MavenSeleProject;

public class MainClass 
{

	public static void main(String[] args)
	{
		
		try
		{
			try
				{
					System.out.println("Hello");
					System.out.println(10/0);
				}
			catch(Exception e)
				{
					System.out.println("I am in selenium");
					System.out.println(10/0);
				}
		}
		
		catch (Exception e) 
		{
			try
				{
					System.out.println("My name is Shweta");
					System.out.println(10/0);
				}
			catch(Exception e1)
				{
					System.out.println("My surname is Adkane");
				}
		finally
		{ 
			try
				{
					System.out.println("I am a working women");
				}
			finally
				{
					System.out.println("I worked in IT");
				}
			System.out.println("in finally");
		}
		}
	}

}
