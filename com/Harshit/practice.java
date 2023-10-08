package com.Harshit;
import java.util.*;
class practice
{   
    public static void main(String[] args)
    {
        /*
        String name="Harshit";
        String lname="Kushwah";
        System.out.println(name+" "+lname);
        int age=40;
        double price=20.5;
        System.out.println(age+" "+price); 
        System.out.println("Hello World !");
    }*/
    Scanner sc=new Scanner(System.in);
    String name=sc.nextLine();
    System.out.println(name);
    int age=sc.nextInt();
    System.out.println(age); 
}
}

class out{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String c=sc.nextLine();
        int a=sc.nextInt();
        float b=sc.nextFloat();

        
        System.out.println("String: " + c);
        System.out.println("Double: " + b);
        System.out.println("Int: " + a);
    }
}
// PRINT PATTERNS


class loop{
    public static void main(String[] args){
        int i=0;
        //for (i=1;i<=10;i++){
          //  System.out.println(i);
        //}
      //hile(i<11){
        //System.out.println(i);
        //i++;
 //   }


do{
    System.out.println(i);
    i++;
}
while(i<11);
    }
}

class sum{
    public static void main(String[] args){
        int a=0;
        for (int i=1;i<11;i++)
        {
            a=a+i;       
            
        }
        System.out.println(a);
    }
}