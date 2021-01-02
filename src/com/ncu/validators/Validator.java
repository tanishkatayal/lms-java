package com.ncu.validators;
import com.ncu.exceptions.*;
import java.util.*;
import java.io.*;
public class Validator
{
   public boolean add(String name,String branch,String publication)//function called from main
	{    
		boolean p=true;
		System.out.println("book name is : "+" "
			+name+ "branch is : "+" "+ branch+"publication is : "+" "+publication);
		Properties prop=new Properties(); //creating object of propert file
		FileInputStream input=null; //to read information from property file
      try //to keep a code that may throw exception
      {   
      	    input=new FileInputStream("C:\\Users\\sunil\\Desktop\\unguided\\configs\\constants\\exception.properties");//passing the file path
      	    prop.load(input); //reads data from the property file
            Length(name);  //functions
            Branch(branch);  //functions
      }
      catch(LengthException e) //handles exception
      {
      	String s=prop.getProperty("lengthmesagge");
      	System.out.println(s);
      	 // this will print the string which u have passed in the constructor or object of ur exception
          System.out.println(e.getMessage());
  
      	p=false;
      
      }
      catch(BranchException e)
      {
      	String s=prop.getProperty("branchmessage");
      	p=false;
      	System.out.println(s);
      	e.printStackTrace();  // It is a method of Java's throwable class which prints the throwable along with other details like the line number and class name where the exception occurred. 
      }
	
	catch(Exception e)  //handles exception
	{
	e.printStackTrace();
	}
	return p;
   }
	private void Length(String name) throws LengthException
	{
		if(name.length()>20)
		{
			throw new LengthException("the book name is more than 20 characters");
		}
	}
	private void Branch(String branch) throws BranchException
	{  

		if(!"cse".equals(branch)&&!"mech".equals(branch)&&!"civil".equals(branch))
		{
			throw new BranchException("the entered branch is not correct");
		}
		
	}
	
}
