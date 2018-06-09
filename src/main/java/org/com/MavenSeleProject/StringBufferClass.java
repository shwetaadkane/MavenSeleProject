package org.com.MavenSeleProject;

public class StringBufferClass {

	public static void main(String[] args) {
		StringBuffer name2=new StringBuffer("Shweta");
		StringBuffer name3=new StringBuffer("Shweta");
		
		System.out.println(name2==name3);
		System.out.println(name2.equals(name3));
	}

}
