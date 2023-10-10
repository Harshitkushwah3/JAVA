package com.Harshit;

public class AdavncePattern {

// BUTTERFLY PATTERN

/* 
    public static void main(String[] args){
        int n=5;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            int sp = 2*(n-i);
            for (int j=1;j<=sp;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
            for (int i=n;i>=1;i--){
            for (int j=i;j>=1;j--){
                System.out.print("*");
            }
            int sp = 2*(n-i);
            for (int j=sp;j>=1;j--){
                System.out.print(" ");
            }
            for (int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
*/

// SOLID RHOMBUS PATTERN

/* 
public static void main(String[] args){
    int n=5;
    for(int i=1;i<=n;i++){
        for (int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for (int j=1;j<=n;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
*/

//NUMBER PYRAMID

/*
public static void main(String[]args){
    int n=5;
    for (int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for (int j=1;j<=i;j++){
            //System.out.print(j + " ");
            //OR
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
*/

//PALINDROMIC PATTERN

/*
public static void main(String[] args){
    int n=5;
    for(int i=1;i<=n;i++){
        for (int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for (int j=i;j>=1;j--){
            System.out.print(j);
        }
        for(int j=2;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
    }
}
*/

//DIAMOND PATTERN

/*
public static void main(String[] args){
    int n=5;
    for(int i=1;i<=n;i++){
        for (int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for (int j=1;j<=2*i-1;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=n;i>=1;i--){
        for (int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for (int j=1;j<=2*i-1;j++){
            System.out.print("*");
        }

    
        System.out.println();
    }
}
*/

}

