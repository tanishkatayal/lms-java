package com.ncu.authentication;
import java.util.*;
import java.io.*;
public class Auth 
{
	public boolean chkpass(String user,String pass)
	{   
		Properties p=new Properties();
		try
		{
		FileInputStream input=null;
		input=new FileInputStream("C:\\Users\\sunil\\Desktop\\unguided\\configs\\constants\\exception.properties");
		p.load(input);
		String s=p.getProperty("user");
		if(s.equals(user)&&s.equals(pass))
		{
			return true;
		}
		
	  }
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	return false;
}
}
/*class Testauth
{
	public static void main(String args[]) throws Exception
	{    
        System.out.println("welcome to login page");
		System.out.println("(3 attempts allowed)");
	String user;
	String pass;
	int i=3;
	while(i>0)
	{ System.out.println("enter user name and password");
	Scanner sc=new Scanner(System.in);
	user=sc.nextLine();
	pass=sc.nextLine();
	System.out.println("user name"+" "+user+"password is"+" "+pass);
	boolean m;
	Auth ob=new Auth();
	m=ob.chkpass(user,pass);
	if(m==true)
	{
	System.out.println("* valid user id and password * ");
	break;
	}
	else
	System.out.println("...invalid... ");
    i--;
    }
   }
}*/
