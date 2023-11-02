import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

// 1. Write a program to print whether a number is even or odd, also take input from the user.

class eoro{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}

// 2. Take name as input and print a greeting message for that name.

class greeting{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        String name = sc.nextLine();
        System.out.println("Hello " + name+ " have a good day");
    }
}

// 3. Write a program to input principle, time, and rate (P, T, R) from the user and find Simple Interest.

class SI{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int t=sc.nextInt();
        int r=sc.nextInt();
        int si=(p*t*r)/100;
        System.out.println(si);
    }
}

// 4. To calculate Fibonacci Series up to n numbers.

class fibonacci{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int n= sc.nextInt();
        if (n==0){
            System.out.println("0");
        }
        else if (n==1){
            System.out.println("0 1");
        }
        else{
            int a=0;
            int b=1;
            for (int i=1;i<=n;i++){
                System.out.print(a+" ");
                int c=a+b;
                a=b;
                b=c;
            }
        }
    }
}

// 5. To find out whether the given String is Palindrome or not.

class palindrom{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        if (s.equals(rev)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}

// 6. To find Armstrong Number between two given number.

class armstrong{
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        int r;
        while(n>0){
            r=n%10;
            n=n/10;
            sum=sum+(r*r*r);
        }if (sum==temp){
            System.out.println("armstrong");
        }
        else{
            System.out.println("not armstrong");
        }

    }
}


/*
 BASIC JAVA PROGRAMS

1.  Area Of Circle Java Program
2.  Area Of Triangle
3.  Area Of Rectangle Program
4.  Area Of Isosceles Triangle
5.  Area Of Parallelogram
6.  Area Of Rhombus
7.  Area Of Equilateral Triangle
8.  Perimeter Of Circle
9.  Perimeter Of Equilateral Triangle
10. Perimeter Of Parallelogram
11. Perimeter Of Rectangle
12. Perimeter Of Square
13. Perimeter Of Rhombus
14. Volume Of Cone Java Program
15. Volume Of Prism
16. Volume Of Cylinder
17. Volume Of Sphere
18. Volume Of Pyramid
19. Curved Surface Area Of Cylinder
20. Total Surface Area Of Cube
21. Fibonacci Series In Java Programs
22. Subtract the Product and Sum of Digits of an Integer
23. Input a number and print all the factors of that number (use loops).
24. Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
25. Take integer inputs till the user enters 0 and print the largest number from all.
26. Addition Of Two Numbers program
 */

 // INTERMEDIATE JAVA PROGRAMS

// 1.FACTORIAL OF A NUMBER IN JAVA
class fact{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int fact=1;
        for (int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}

// 2. Calculate Electricity Bill
class bill{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int unit=sc.nextInt();
        int bill=0;
        int rate=8;
        if (unit==0){
            System.out.println("no bill");
        }
        else if (unit<=100){
            bill=unit*rate;
            System.out.println(bill);
        }
        else if (unit>100 && unit<=300){ // 100*8 + 200*10
            bill=100*rate+(unit-100)*10; // 800 + 2000
            System.out.println(bill);   // 2800
        }
        else if (unit>300){
            bill=100*rate+200*10+(unit-300)*15; // 800 + 2000 + 1500
            System.out.println(bill); //  4300
        }
    }

}

// 3. Calculate Average Of N Numbers
class avg{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        float sum=0;
        for (int i=1;i<=n;i++){ // 1 2 3 4 5
            sum=sum+i; // 0+1+2+3+4+5
        }
        float avg=(sum/n); // 15/5
        System.out.println(avg); // 3.0
    }
}
// 4. Calculate Discount Of Product
// 5. Calculate Distance Between Two Points
// 6. Calculate Commission Percentage
// 7. Power In Java
// 8. Calculate Depreciation of Value
// 9. Calculate Batting Average
// 10. Calculate CGPA Java Program
// 11. Calculate Average Marks
// 12. Addition Of Two Numbers in Java
// 13. Sum Of N Numbers
// 14. Armstrong Number In Java
// 15. Find Ncr & Npr
// 16. Reverse A String In Java
// 17. Find if a number is palindrome or not
// 18. Future Investment Value
// 19. HCF Of Two Numbers Program
// 20. LCM Of Two Numbers
// 21. Java Program Vowel Or Consonant
// 22. Perfect Number In Java
// 23. Check Leap Year Or Not
// 24. Sum Of A Digits Of Number
// 25. Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.
class allow{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of days in month");
        int n=sc.nextInt();
        int count=0;
        for (int i=1;i<=n;i++){
            if (i%2==0){
                count=count+1;
            }
        }
        System.out.println(count);
    }
}


// 26. Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
class allsum{
    public static void main(String[] args){
        int sumneg=0;
        int sumposev=0;
        int sumposod=0;
        System.out.println("enter no. terminated with 0");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        do{
            n=sc.nextInt();
            if (n<0){
                sumneg=sumneg+n;
            }
            else if (n%2==0){
                sumposev=sumposev+n;
            }
            else if (n%2!=0){
                sumposod=sumposod+n;
            }
        }while(n!=0);
        System.out.println(sumneg);
        System.out.println(sumposev);
        System.out.println(sumposod);
    }
}