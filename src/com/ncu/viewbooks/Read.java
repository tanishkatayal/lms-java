package com.ncu.viewbooks;
import java.io.*;
import com.opencsv.*;
public class Read
{     //public static int countb=0;
	public static void readDataLineByLine(String file) 
{ 
          //static int countb=0;

    try { 
           // static int countb=0;
        // Create an object of filereader 
        // class with CSV file as a parameter. 
        FileReader filereader = new FileReader(file); 
  
        // create csvReader object passing 
        // file reader as a parameter 
        CSVReader csvReader = new CSVReader(filereader); 
        String[] nextRecord; 
  
        // we are going to read data line by line 
        while ((nextRecord = csvReader.readNext()) != null)
         {
            //countb++;
            for (String cell : nextRecord) { 
                System.out.print(cell+"|"+"|");
            } 
            System.out.println(); 
        } 
        // countb--;
        // countb--;
        // System.out.println();
        // System.out.println("the total number of books in library are"+countb);
    } 
    catch (Exception e) { 
        e.printStackTrace(); 
    } 
} 

}
/*class Testread
{
	public static void main(String args[]) throws Exception
	{
		Read ob=new Read();
		ob.readDataLineByLine("C:\\Users\\sunil\\Desktop\\unguided\\csv\\example.csv");
	}
}*/