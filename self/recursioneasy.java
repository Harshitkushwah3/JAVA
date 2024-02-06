/*
PREREQUISITE:
    - Iteration / loops
    -Functions

RECURSION:
    A function that calls itself
    - Base case
    - Recursive case
    - Get closer and closer to base case
    - Usually have 2 returns
    e.g.
        F(x)=x^2 - given
        F(F(x))=F(x^2)
        F(F(x))=x^4

        x=2
        F(2)=2^2=4
        F(F(2))=F(4)=4^2=16


Function:
    - A block of code which is executed only when it is called
    - Can pass in parameters
    - Can return values
    - Can be called multiple times
    - Can be called from other functions

    e.g.
        public static void main(String[]args){
            System.out.println("Hello World");
        }
*/

// Print Number from 5 to 1

import java.util.*;

class num{
    public static void print(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        print(n-1);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print(n);
    }
}

// Print Number from 1 to 5

class num2{
    public static void print(int n){
        if(n==10){
            return;
        }
        System.out.println(n);
        print(n+1);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print(n);
    }
}