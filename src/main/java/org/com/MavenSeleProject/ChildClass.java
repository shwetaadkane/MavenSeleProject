package org.com.MavenSeleProject;

public class ChildClass extends ParentClass
{
	
	public ChildClass()
	{	
		this(100);
		System.out.println(super.name);
		System.out.println("Child constructor");
	}

	public ChildClass(int a)
	{
		System.out.println(a);
	}
	
	public void childmethod(String name)
	{
		this.name=name;
		super.parentmethod();
		
		System.out.println("child method " +name);
	}
}
