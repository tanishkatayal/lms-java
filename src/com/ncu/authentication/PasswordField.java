package com.ncu.authentication;
import java.io.*;
import java.util.*;

public class PasswordField {

    public static String readPassword () {
       EraserThread et = new EraserThread();
       Thread mask = new Thread(et);

       mask.start();
 
       Scanner sc = new Scanner(System.in);
       String password;

       password = sc.nextLine();
  
       et.stopMasking();
       
       return password;
    }
 }   
 

class EraserThread extends Thread {
    boolean stop = false;
   
    public void run () {
       while (!stop){
          System.out.print("\010*");
       }
    }
 
    public void stopMasking() {
       this.stop = true;
    }
 }