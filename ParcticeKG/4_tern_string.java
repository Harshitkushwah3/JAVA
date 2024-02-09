// TERNARY OPERATOR 

package ParcticeKG;

import java.util.Scanner;
class ternary{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int num1=sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int num2 =sc.nextInt();
        /*
        if (num1>num2) {
            System.out.println("The greater number is: "+num1);
        } 
        else {
            System.out.println("The greater number is: "+num2);{
            
            }
        }
        */
        int result = (num1>num2)?num1:num2; // ternary operator
        System.out.println("The greater number is: " +result);
         
    }
}

/*

class switcc{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day of week in number ");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter Valid  number");
                break;
        }
    }
}

*/

// Other way to define Switch Statement

class switcc{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the day of week in number ");
        int num=sc.nextInt();
        String day=switch(num){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Enter Valid  number";
        };
        System.out.println(day);
    }       
}


/**************Practice****************/
