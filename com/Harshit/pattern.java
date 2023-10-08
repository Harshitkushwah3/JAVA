package com.Harshit;

public class pattern {
    
//FILLED RECTANGLE

/*   
public static void main(String[] args){
        for (int i=1;i<=5;i++){
            for (int j=1;j<=5 ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }    
}
*/

//HOLLOW RECTANGLE

/* 
public static void main(String[] args){
    int n=5;
    int m=4;
    for (int i =1;i<=n;i++){
        for (int j=1;j<=m;j++){
            if (i==1 || j==1 || j==m ||i==n){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
*/

//HALF PYRAMID

/*
public static void main(String[] args){
    int n=5;
    for (int i=1;i<=n;i++){
        for (int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
*/

//INVERTED HALF PYRAMID

/* 
public static void main(String[] args){
    int n=5;
    for (int i=n;i>=1;i--){
        for (int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
*/

//HALF PYRAMID AFTER 180 DEGREE ROTATION

/* 
public static void main(String[] args){
    int n=5;
    for (int i=1;i<=n;i++){
        for (int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for (int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
*/

//PRINT NUMBERS

/* 
public static void main(String[] args){
    int n=5;
    for (int i=1;i<=n;i++){
        for (int j=1;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
    }
}
*/

//PRINT 1 0 PATTERN

public static void main(String[] args){
    int n=5;
    for (int i=1;i<=n;i++){
        for (int j=1;j<=i;j++){
            if ((i+j)%2==0){
                System.out.print("1");
            }
            else{
                System.out.print("0");
            }
        }
        System.out.println();
    }
}