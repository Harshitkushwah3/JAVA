package ParcticeKG;
import java.util.Scanner;

// 1
// WAP TO PRINT MULTIPLICATION TABLE FOR A GIVEN NUMBER

class prc_1_10 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("multiplication");
        System.out.println("Enter your Number:");
        int n=sc.nextInt();
        multiplication(n);
    }
    public static void multiplication(int n) {
        int i=1;
        while(i<=10){
            System.out.println(n + "x" + i + "=" + n*i);
            i++;
        }
    }    
}


// 2
// wap for sum of all odd numbers form 1 to N

class num{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your number:");
    int n=sc.nextInt();
    int sum=0;
    System.out.println(oddsum(n));
    }
    public static int oddsum(int n) {
        /*
        int sum=0; // using for loop
        for(int i=1;i<n;i++){
            if (i%2!=0){
                sum=sum+i;
            }
        }
        */
        int sum=0; // using while loop
        int i=1;
        while (i<=n) {
            sum+=i;
            i+=2;
        }
        return sum;
        
    }
}

// 3
// WAP to calculate factorial

class fact{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter you number");
        int n=sc.nextInt();
        System.out.println(factorial(n));
    }
    public static int factorial(int n) {
        int i=1;
        int sum=1;
        while(i<=n){
            sum*=i;
            i++;
        }
        return sum;
    }
}

// 4 
// WAP to computer sum of a numbers digit

class sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n=sc.nextInt();
        System.out.println(n_sum(n));

    }
    public static int n_sum(int n) {
        int sum=0;
        while(n>0){
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }
}

// 5
// WAP to calculate LCM of 2 no.

class LCM{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your 1st  number");
        int n=sc.nextInt();
        System.out.println("Enter your 2nd number");
        int j=sc.nextInt();
        System.out.println(lcm(n,j));

    }
    public static int lcm(int n,int j) {
        int i=1;
        while(true){
            int num=n*i; 
            if(num%j==0){
                return num;
            }
            i++;
        }
    }
}

// 6  Wap to fing GCD
// 7 Wap to check number is prime
// 8 Wap to reverse the digit of a number
// 9 Wap to print fibnacci numbers series
// 10 Wap to verfiy numbe ris pallindrom
//10 print patterns

/*
 
*
**
***
****
*****

*/

/* 

*****
****
***
**
*

*/

/*

    *
   **
  ***
 ****

*/