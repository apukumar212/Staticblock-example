package com.pack1;

public class Staticblock 
{
static int x=Staticblock.meth1();
static int meth1()
{
	System.out.println("static meth1() called");
	return 100;
}
static
{
	System.out.println("static block called");
}
public static void main(String[] args) 
{
System.out.println("main() called");
}
}
//static variables and static blocks will be having equal priorities
//They will be executed before main() in the order of their writting
//static method will be executed only if we are calling