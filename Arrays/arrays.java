package Arrays;
/*
 DEFINING ARRAY

 type[] arrayName = new type[size];
    e.g. 
        int[] arr = new int[3];
 */

 import java.util.*;

class arrays{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int marks[]=new int[n];

        // marks[0]=10;    //defined values
        // marks[1]=20;
        // marks[2]=30;
        for (int i=0;i<n;i++){
            marks[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++){
            System.out.print(marks[i] +" ");
        }
    }}

    //EXAMPLE

class search{
        public static void main (String[]args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
             int a=sc.nextInt();
            for (int i=0;i<arr.length;i++){
                if (a==arr[i])
                {
                    System.out.println("found at index " + i );
                    break;
                }
            }
        }
    }

// 2D ARRAYS
/*z
DEFINING 2D ARRAY
        type[][] array_name = new type[rows][columns];
        e.g.
            int[][] arr = new int[3][3];
*/

class Two_Darray{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        //input of 2d array
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        //output of 2d array
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
}

// example 

class two_d_search{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int arr[][]=new int[a][b];
        for (int i=0;i<a;i++){
            for (int j=0;j<b;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int c=sc.nextInt();
        for(int i=0;i<a;i++){
            for (int j=0;j<b;j++){
                if (c==arr[i][j]){
                    System.out.println("found at index " + i + " " + j);
                    break;
                }
            }
        }

    }
} 



//