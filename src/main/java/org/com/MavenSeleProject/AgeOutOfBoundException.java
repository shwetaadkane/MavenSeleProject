package org.com.MavenSeleProject;

public class AgeOutOfBoundException extends RuntimeException
{

	public AgeOutOfBoundException(String s)
	{
		System.out.println(s);
	}
}
