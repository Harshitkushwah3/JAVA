package ParcticeKG;

import java.util.*;


// example

class recurse{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Factoiral search");
    System.out.println("Enter the number");
    int n=sc.nextInt();
    long fact= factorial(n);
    System.out.println("Factorial of the number is " + fact);        
    }
    // recursive call
    public static long factorial (int n) {
        if (n==1) {
            return 1;
        } 
        else {
            return n*factorial(n-1);
    }

/*
// basic approach
    public static long factorial (int n) {
        long res=1;
        for (int i=1;i<=n;i++) {
            res=res*i;
        }
        return res;

        
    }
*/
}
}
