package com.ncu.addbooks;
import java.io.*;
import com.opencsv.CSVWriter;
public class Add
{ public static void writeDataLineByLine(String a,String b,String c) 
{ 
    // first create file object for file placed at location 
    // specified by filepath 
    File file = new File("C:\\Users\\sunil\\Desktop\\unguided\\csv\\example.csv"); 
    try { 
       
  
        // create FileWriter object with file as parameter 
        FileWriter outputfile = new FileWriter(file,true); 
  
        // create CSVWriter object filewriter object as parameter 
        CSVWriter writer = new CSVWriter(outputfile); 
  
        // adding header to csv 
       //String[] header = { "Name", "branch", "publication" }; 
        //writer.writeNext(header); 
  
        // add data to csv 
        String[] data1 = { a, b, c,"not issued" }; 
        writer.writeNext(data1); 
  
        // closing writer connection 
        writer.close(); 
    } 
    catch (IOException e) { 
        // TODO Auto-generated catch block 
        e.printStackTrace(); 
    } 
} 
}
/*class Testadd
{
    public static void main(String args[])
    {
    Add ob=new Add();
    ob.writeDataLineByLine("introduction to c","cse","dhanpat rai");
    ob.writeDataLineByLine("basics of mechanics","mechanical","dhanpat rai");
    ob.writeDataLineByLine("Ec","applied science","janta");
    }
}*/