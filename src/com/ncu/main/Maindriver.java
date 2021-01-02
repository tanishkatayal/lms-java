package com.ncu.main;   //declaring a package

import com.ncu.authentication.*; //importing authentiction class
import com.ncu.validators.*;  //importing validator class
import com.ncu.addbooks.*;   //importing add class
import com.ncu.viewbooks.*;  //importing read class
import com.ncu.issuebooks.*;  //importing issue class
import java.util.*;  //for taking input 
import java.lang.*;      //for exitting the java program

public class Maindriver
{
	public static void main(String args[]) throws Exception
	{
        System.out.println();
        System.out.println();
		System.out.println("***********************LIBRARY MANAGEMENT SYSTEM**************************");
		System.out.println();
	  System.out.println("welcome to login page");
		System.out.println("(3 attempts allowed)");
		Scanner sc=new Scanner(System.in);
	String user;
	String pass;
	int i=3;
	while(i>0)
	{ System.out.println("enter user name and password");
	user=sc.nextLine();
    pass = PasswordField.readPassword(); //for asterisks masking of passwords
    //  System.out.println("The password entered is: "+pass);
	//System.out.println("user name"+" "+user+"password is"+" "+pass);//printing the username and password
	boolean m;
	Auth ob=new Auth();  //creating object of auth class
	m=ob.chkpass(user,pass); //calling the method that returns a boolean method
	if(m==true)
	{
	System.out.println("* valid user id and password * ");
	System.out.println();
         int a;
		 String name;
		 String branch;
		 String publication;
		 Validator o=new Validator();  //creating object of validator class
		 
		  System.out.println("welcome to library managemt system");
		  System.out.println();
		
		do
		{ System.out.println("1.Add a book ");
		System.out.println("2.View all the books");
		System.out.println("3.Issue a book");
		System.out.println("4.Exit");
		 a=sc.nextInt();
		 //while(a!=4)
		 if(a==1)
		 {  
             Add ad=new Add();
		 	System.out.println("do u want to enter the details of the books?");
		  char input;
		  input=sc.next().charAt(0);
		  while(input=='y')
		   {  
             System.out.println("enter the password one more time");
             int tpass;
             tpass=sc.nextInt();
             if(tpass==123)
		 	 { System.out.print("enter name of the book : ");
		 	sc.nextLine();
		 	name=sc.nextLine();
		 	System.out.print("enter branch : ");
		 	branch=sc.nextLine();
		 	System.out.print("enter publication : ");
		 	publication=sc.nextLine();
            boolean l;
		 	l=o.add(name,branch,publication);
		 	System.out.println(l);
		 	if(l==true)
            { ad.writeDataLineByLine(name,branch,publication);
            }
            else
            	;
        }
          else
          {
          	System.out.println("incorrect password");
          	break;
          }
		 	System.out.println("want to enter more?");
		 	input=sc.next().charAt(0);
		   }
		 //break;
	    }
	    else if(a==2)
	    {
	    	Read r=new Read();
		    r.readDataLineByLine("C:\\Users\\sunil\\Desktop\\unguided\\csv\\example.csv"); //calling method by passing file path
		   // break;
	
	    }
	    else if(a==3)
	    {
	    	String book;
	    	System.out.println("enter the name of the book u want to issue");
	    	sc.nextLine();
	    	book=sc.nextLine();
	    	 Issue oi=new Issue();
        oi.IsueBook(book);
	    }
	     else if(a==4)
	     {
	    	System.exit(0);  //to exit from the program
	    }
	}while(a!=4);

	}
	  
	
	else
	System.out.println("...invalid... ");
    i--;
    }
	}
}