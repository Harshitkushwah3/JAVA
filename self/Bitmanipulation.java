/*

// 1. You are given a number n.
// 2. You have to print the number formed by reversing the bits of n.

Operations on bits

1.Get bit
2.Set bit
3.Clear bit
4.Update bit

(We will use 0 based indexing from right)

// GET BIT:
    Use Bit Mask to get the bit
    1<<i
    e.g.
        Get the 3rd bit (Position = 2) of a number n. (n=0101)
        bit mask = 1<<2 = 0100
        operation = AND 
            0100 AND 0101 = 0100 // (Bit at position 2 is 1) because we have 1 at position 2 in bit mask

            
// SET BIT:
    Use Bit Mask to set the bit
    1<<i
    e.g.
        Set the 3rd bit (Position = 2) of a number n. (n=0101)
        bit mask : 1<<i = 1<<2 = 0100
        operation = OR 
            0100 OR 0101 = 0101 // (Bit at position 2 is 1) because we have 1 at position 2 in bit mask


// CLEAR BIT:
    Use Bit Mask to clear the bit
    1<<i
    e.g.
        Clear the 3rd bit (Position = 2) of a number n. (n=0101)
        bit mask : 1<<i = 1<<2 = 0100
        operation = AND with NOT
        1.operation = NOT
            NOT 0100 = 1011
        2.operation = AND
            0101 AND 1011 = 0001 // (Bit at position 2 is 0) because we have 0 at position 2 in bit mask


// UPDATE BIT:
    Use Bit Mask to update the bit
    1<<i
    e.g.
        Update the 2nd bit (Position = 1) of a number n to 1. (n=0101)
        for 1:
            bit mask : 1<<i = 1<<1 = 0010
            operation = OR 
                0101 OR 0010 = 0111 // (Bit at position 1 is 1) because we have 1 at position 1 in bit mask
        for 0:
            bit mask : 1<<i = 1<<1 = 0010
            operation = AND with NOT
            1.operation = NOT
                NOT 0010 = 1101
            2.operation = AND
                0101 AND 1101 = 0101 // (Bit at position 1 is 0) because we have 0 at position 1 in bit mask



            */

import java.util.Scanner;

class get{
    public static void main(String[]args){
        int n=5;//0101
        int pos=3;
        int bitmask=1<<pos;
        if((bitmask &n)==0){
            System.out.println("Bit is 0");
        }
        else{
            System.out.println("Bit is 1");
        }
    }
}


class set{
    public static void main(String[]args){
        int n=5;//0101
        int pos=1;
        int bitmask=1<<pos;
        int New=n|bitmask;
        System.out.println(New);
    }
}

class clear{
    public static void main(String[]args){
        int n=5;//0101
        int pos=2;
        int bitmask=1<<pos;
        int notbitmask=~bitmask;
        int New=n&notbitmask;
        System.out.println(New);
    }
}

class update{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int oper =sc.nextInt(); 
        int n=5;//0101
        int pos=1;
        // for oper=1 : set oper=0 : clear
        if(oper==1){
        int bitmask=1<<pos;
        int New=n|bitmask;
        System.out.println(New);
        }
        else{
        int bitmask=1<<pos;
        int notbitmask=~bitmask;
        int New=n&notbitmask;
        System.out.println(New);
        }
    }
}