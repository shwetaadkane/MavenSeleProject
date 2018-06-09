package org.com.MavenSeleProject;

import java.io.FileNotFoundException;

public class ExampleException {

	public static void main(String[] args) throws FileNotFoundException {
		
		form();

	}
	
	public static void form() throws FileNotFoundException
	{
		int childage=7;
		int seniorage=50;
		
		if(childage<5 && seniorage>60)
		{
			//throw new AgeOutOfBoundException("Age Less than 5 & more than 60 not allowed");
			throw new FileNotFoundException();
	
		}
		else 
		{
			System.out.println("Welcome");
		}
		
	
	}

}
