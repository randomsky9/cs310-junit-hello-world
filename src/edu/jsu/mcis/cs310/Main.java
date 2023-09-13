package edu.jsu.mcis.cs310;

public class Main {

    public static void main(String[] args) {
        
        Main m = new Main();
        String message = m.getGreeting();
        
        System.out.println(message);
        System.out.println(m.reverse(message));
        
    }
    
    public String getGreeting() {
        return "Hello, World!";
    }
    
    public String reverse(String message) {
           StringBuilder str
            = new StringBuilder ("Hello World!");
 
        StringBuilder reverseStr = str.reverse();
        
         System.out.println(""
                           + reverseStr.toString());
         return "" ;
    
       }
    }
       

