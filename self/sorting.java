/*

//BASIC SORTING ALGORITHMS //

1.Bubble Sort
2.Selection Sort
3.Insertion Sort

// Bubble Sort //
    Bubble sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. 
    The pass through the list is repeated until the list is sorted.

    Time Complexity: O(n^2)
    Space Complexity: O(1)
    Stable: Yes
    Inplace: Yes


// Selection Sort //
    The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from unsorted part and putting it at the beginning.
    The algorithm maintains two subarrays in a given array.
    1) The subarray which is already sorted.
    2) Remaining subarray which is unsorted.

    Time Complexity: O(n^2)
    Space Complexity: O(1)
    Stable: No
    Inplace: Yes


// Insertion Sort //
    Insertion sort is a simple sorting algorithm that works similar to the way you sort playing cards in your hands. 
    The array is virtually split into a sorted and an unsorted part. 
    Values from the unsorted part are picked and placed at the correct position in the sorted part.

    Time Complexity: O(n^2)
    Space Complexity: O(1)
    Stable: Yes
    Inplace: Yes


*/

import java.util.*;

class Bubble{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a]; // no of elements
        for(int i=0;i<a;i++){ // input
            arr[i]=sc.nextInt(); // elements
        }
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j+1]<arr[j]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

class selection{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a]; // no of elements
        for(int i=0;i<a;i++){ // input
            arr[i]=sc.nextInt(); // elements
        }
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

class insertion{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a]; // no of elements
        for(int i=0;i<a;i++){ // input
            arr[i]=sc.nextInt(); // elements
        }
        int n=arr.length;
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}