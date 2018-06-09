package org.com.MavenSeleProject;

public class BankException extends RuntimeException

{
	
	BankException(String s)
	{
		System.out.println(s);
	}

}
