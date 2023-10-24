import java.util.*;
import java.lang.*;
import java.io.*;


class average{
    public static int aveg(int a,int b,int c){
        c=(a+b+c)/2;
        System.out.println("avg is "+c);
        return 0;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(aveg(a, b, c));

    }
}

class odd_sum{
    public static int odd_sum(int n){
        if (n<=0){
            System.out.println("Invalid no.");
            return 0;
        }
        int s=0;
        for(int i=1;i<=n;i++){
            if (i%2!=0){
                s=s+i;
            }
        }
        return s;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("sum of odd no." + odd_sum(n));
    }
}


class great{
    public static void great(int a,int b){
        if (a>b){
            System.out.println(a + " is greater tha " + b);
        }
        else{
            System.out.println(b + " is greater than " + a);
        }
        return ;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        great(a, b);
    }
}


class circumference{
    public static void circum(int n){
        double a=3.14*n*n;
        System.out.println("area is " + a);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        circum(n);   // Here we are calling the function directly because we use void in main method which does not return any value.   
    }
}


class eligible{
    public static void age(int n){
        if (n>=18){
            System.out.println("eligible");
        }
        else{
            System.out.println("Not eligible");
        }
    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        age(n);
    }
}


class infinite_loop{
    public static void main(String[]args){
        while(true){
        System.out.println("hello world");
        }
    }
}


class count_pos_neg_zero{
    public static void count(int n){
        

    }
}