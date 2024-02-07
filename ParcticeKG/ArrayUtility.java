package ParcticeKG;

import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        System.out.println("Enter the elements of the array");
        int arr[]=new int [n];
        int i=0;
        while (i<n) {
            System.out.println("Enter the element" + (i + 1) + ":");
            arr[i]=sc.nextInt();
            i++;
        }
        return arr;
    }
}
