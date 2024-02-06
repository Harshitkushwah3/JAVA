// FUNCTIONS OR METHODS
import java.util.*;
import java.math.*;
import java.io.*;

 // 1. Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
class maxmini{
    public static int max(int a,int b,int c){
        if (a>b && a>c){
            return a;
        }
        else if (b>a && b>c){
            return b;
        }
        else{
            return c;
        }
    } 
    public static int min(int a,int b,int c){
        if (a<b && a<c){
            return a;
        }
        else if (b<a && b<c){
            return b;
        }
        else{
            return c;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(max(a,b,c));
        System.out.println(min(a, b, c));
    }
}

// 2. Define a program to find out whether a given number is even or odd.
class eoro{
    public static void check(int a) {
        if (a%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        check(a);
    }
}

// 3. A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
class eligible{
    public static void vote(int age){
        if (age>=18){
            System.out.println("Eligible");
        }
        else{
            System.out.println("Not Eligible");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        vote(age);
        
    }
}

// 4. Write a program to print the sum of two numbers entered by user by defining your own method.
class sum{
    public static void sum(int a, int b) {
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sum(a,b);
    }
}

// 5. Define a method that returns the product of two numbers entered by user.
// 6. Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
// 7. Define a method to find out if number is prime or not.
class prime{
    public static void prime(int a) {
        int count=0;
        for (int i=1;i<=a;i++){
            if (a%i==0){
                count++;
            }
        }
        if (count==2){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        prime(a);
    }
}

// 8. Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
class grade{
    public static void mark(int a) {
        if(a<=40){
            System.out.println("fail");
        }
        else if(a>40 && a<=50){
            System.out.println("DD");
        }
        else if(a>50 && a<=60){
            System.out.println("CD");
        }
        else if(a>60 && a<=70){
            System.out.println("BC");
        }
        else if(a>70 && a<=80){
            System.out.println("BB");
        }
        else if(a>80 && a<=90){
            System.out.println("AB");
        }
        else{
            System.out.println("AA");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        mark(a);
    }
}

// 9. Write a program to print the factorial of a number by defining a method named 'Factorial'.
class fact{
    public static void facto(int a) {
        int fact=1;
        for (int i=1;i<=a;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        facto(a);
    }
}


// 10. Write a function to find if a number is a palindrome or not. Take number as parameter.

// 11. Convert the programs in flow of program, first java, conditionals & loops assignments into functions.

// 12. Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).

// 13. Write a function that returns all prime numbers between two given numbers.

// 14. Write a function that returns the sum of first n natural numbers.
