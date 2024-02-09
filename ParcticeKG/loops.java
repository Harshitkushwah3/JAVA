package ParcticeKG;

import java.util.*;;
/*

// While loop
class doWhile{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=sc.nextInt();
        while (age<0 || age>100) {
            System.out.println("Please enter your age");
            age=sc.nextInt();            
        }
        System.out.println("your age is " + age);
    }
}

*/

// Do while loop
class doWhile{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=0;
        do{
            System.out.println("Enter your age");
            age=sc.nextInt();
        }
        while (age<0 || age>100);        
        System.out.println("your age is " + age);
    }
}


// for loop

class forloop{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N ");
        int N=sc.nextInt();
        System.out.println("Enter your name");
        String name=sc.next();
        for (int i=0; i<N; i++) {
            System.out.println(name);
        }
   }
}

// for each loop

class foreachloop{
    public static void main(String[] args) {
        String [] array =new String[]{
            "Java",
            "C++",
            "Python",
            "C#",
            "Ruby"
        };
        printarray(array);
    }
    public static void printarray(String[] array){
        // for ( int i=0 ;i<array.length; i++){ 
        //     System.out.println(array[i]);
        // }
        for (String element : array) { // for each loop iteration
            System.out.println(element);
        }


    }
    
}