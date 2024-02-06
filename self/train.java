/*public class train {
  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}*/

/*PRINT NUMBAERS */

import java.util.Scanner;

class train {
  public static void main(String[] args) {
    System.out.println(3+3);
    System.out.println(15*6);
  }
}

class studnet {
  public static void main(String[] args) {
    int myNum = 5;
float myFloatNum = 5.99f;
char myLetter = 'D';
boolean myBool = true;
String myText = "Hello";
String fname="Harshit";
String lname="Kushwah";
String fullname=fname+myNum;
Scanner scn = new Scanner(System.in);
int n=scn.nextInt();
    System.out.println(n);
    System.out.println(fullname);
    System.out.println("hii"+myNum);
    System.out.println(myFloatNum);
    System.out.println(myLetter);
    System.out.println(myBool);
    System.out.println(myText);
  }
}

class name{
  public static void PrintMyName(String name){
    System.out.println(name);
    return;
  }
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String name=scn.next();
    System.out.println("Hello World");
    PrintMyName(name);
  }
}

class sum{
  public static int sum(int a, int b){
    System.out.println(a+b);
    return 0;
  }
  public static void main(String[]args){
    Scanner scn =new Scanner(System.in);
    int a=scn.nextInt();
    int b=scn.nextInt();
    int sum=a+b;
    System.out.println(sum);
     
  }
}

class prod{
  public static int prod(int a,int b){
    return a*b;
  }
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int a=scn.nextInt();
    int b=scn.nextInt();
    System.out.println(prod(a,b));
  }}


class facto{
    public static int facto(int n){
      if( n<=0){
        System.out.println("invalid input");
        return 0;
      }
      int fact=1;
      for (int i=1;i<=n;i++){
        fact=fact*i;
      }
      return fact;
    }
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      System.out.println(facto(n));
    }
  }