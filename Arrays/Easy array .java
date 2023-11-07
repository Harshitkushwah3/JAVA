package Arrays;
import java.util.Scanner;
import java.util.*;
/*
 EASY JAVA ARRAY QUESTIONS 
*/

// 1. Build Array from Permutation (Leetcode - 1920)
class Permutation{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int ans[]=new int[n];
        System.out.print("Enter values in range of n-1 "); // 0 to n-1
        for (int i=0;i<n;i++){ //input
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++){ // defining ans array w.r.t arr
                ans[i]=arr[arr[i]];
        }
        System.out.println("The permutation array is ");
        for (int i=0;i<n;i++){ //output
            System.out.print(ans[i] + " ");
        }
    }
}

// 2. Concatenation of Array ( Leetcode - 1929 )
class Concatenation{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of array1");
        int n=sc.nextInt();
        System.out.println("Enter size of array2");
        int m=sc.nextInt();
        int arr1[]= new int[n];
        int arr2[]= new int [m];
        int ans[]= new int [n+m];
        System.out.println("Enter values in array 1");
        for (int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter values in array 2");
        for (int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++){
            ans[i]=arr1[i];
        }
        for (int i=0;i<m;i++){
            ans[i+n]=arr2[i];
        }
        System.out.println("The concatenated array is ");
        for (int i=0;i<n+m;i++){
            System.out.print(ans[i] + " ");
        }

    }
}

// 3. Running Sum of 1d Array (Leetcode - 1480)
class runsum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        int ans[]=new int [n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        ans[0]=arr[0];
        for (int i=1;i<n;i++){
            ans[i]=ans[i-1]+arr[i];
        }
        System.out.println("The running sum array is ");
        for (int i=0;i<n;i++){
            System.out.print(ans[i] + " ");
        }

    }
}

// 4. Richest Customer Wealth (Leetcode - 1672)
class wealth{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of customers");
        int n=sc.nextInt();
        System.out.println("Enter number of accounts per person");
        int m=sc.nextInt();
        int arr[][]=new int[n][m]; //   defining 2d array
        for (int i=0;i<n;i++){ // input
            for (int j=0;j<m;j++){  // defining 2d array
                arr[i][j]=sc.nextInt(); // input
            }
        }
        int ans[]=new int[n]; // defining ans array
        for (int i=0;i<n;i++){ // adding all accounts of a person
            for (int j=0;j<m;j++){ // 
                ans[i]=ans[i]+arr[i][j]; // 
            }
        }
        int max=ans[0]; // finding max wealth
        for (int i=1;i<n;i++){ //
            if (ans[i]>max){ // if ans[i] is greater than max then max=ans[i]
                max=ans[i]; // else max remains same
            }
        }
        System.out.println("The richest customer has " + max + " wealth");
    }
}

// 5. Shuffle the Array (Leetcode - 1470)
class Shuffle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int arr[]=new int[a];
        for (int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int n=a/2;
        int ans[] =new int[a];
        for (int i=0;i<n;i++){
            ans[2*i]=arr[i];
            ans[2*i+1]=arr[i+n];
        }
        System.out.println("The shuffled array is ");
        for (int i=0;i<a;i++){
            System.out.print(ans[i] + " ");
        }

    }
}

// 6. Kids With the Greatest Number of Candies (Leetcode - 1431)
class maxcandy{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for (int i=1;i<n;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        int extra=sc.nextInt();
        for (int i=0;i<n;i++){
            if (arr[i]+extra>=max){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
        }
    }
}
/*  OR  */
/* 
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
         
        List<Boolean> bool = new ArrayList<>();

        int max = candies[0];
        for(int i = 0; i < candies.length; i++){
            if(max < candies[i]) {
                max = candies[i];
            }
        }

        //int max = Arrays.stream(candies).max().getAsInt();
        
        for(int j = 0; j < candies.length; j++){        
            if(candies[j] + extraCandies >= max){
                bool.add(true);
            } else {
                bool.add(false);
            }
        }

        return bool;
    }
}
*/

// 7. Number of Good Pairs (Leetcode - 1512)
class pairs{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (arr[i]==arr[j] ){
                    count+=1;
                }
            }
        }
        System.out.println("The number of good pairs are " + count);

    }
}

// 8. How Many Numbers Are Smaller Than the Current Number (Leetcode - 1365)
class small{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans[]=new int [n];
        for (int i=0;i<n;i++){
            int count=0;
            for (int j=0;j<n;j++){
                if (arr[i]>arr[j]){
                    count+=1;
                }
            }
            ans[i]=count;
        }
        System.out.println("The number of smaller numbers are ");
        for (int i=0;i<n;i++){
            System.out.print(ans[i] + " ");
        }
        
    }
}

// 9. Create Target Array in the Given Order (Leetcode - 1389 )
class order{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        int index[]=new int [n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++){
            index[i]=sc.nextInt();
        }
        int ans[]=new int [n]; // defining ans array
        for(int i=0;i<arr.length;i++){
            for(int j=ans.length-1;j>index[i];j--){
                ans[j]=ans[j-1];
            }
            ans[index[i]]=arr[i];
        }
        System.out.println("The target array is ");
        for (int i=0;i<n;i++){
            System.out.print(ans[i] + " ");
        }

    }
}

// 10. Check if the Sentence Is Pangram (Leetcode - 1832)
class senpal{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        int arr[]=new int [26];
        for (int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        for (int i=0;i<26;i++){
            if (arr[i]==0){
                System.out.println("false");
                break;
            }
            else{
                System.out.println("true");
                break;
            }
        }
}
}
/* OR */
 class senpal2{
    public boolean checkIfPangram(String sentence) {
        boolean[] arr = new boolean[26];
        for(int i = 0; i < sentence.length(); i++){
            arr[sentence.charAt(i) - 'a']=true;
        }
        for(boolean i : arr){
            if(!i){
                return false;
            }
        }
        return true;
    }
 }


