/*

// OPERATORS //

1. Arithmetic Operators:
    +, -, *, /, %, ++, --

2. Relational Operators:
    ==, !=, >, <, >=, <=

3. Logical Operators:
    &&, ||, !

4. Bitwise Operators:
    &, |, ^, ~, <<, >>

5. Assignment Operators:
    =, +=, -=, *=, /=, %=, <<=, >>=, &=, ^=, |=

6. Misc Operators:
    ?:, instanceof

*/


// ARITHMETIC OPERATORS //

class arithmetic{
    public static void main(String[]args){
        int a=10;
        int b=20;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b); // INTEGER DIVISION
        System.out.println(a%b); // MODULUS OPERATOR (GIVES REMAINDER)
        System.out.println(a++);  // 10 // POST INCREMENT
        System.out.println(a--); // 11 // POST DECREMENT
        System.out.println(++a); // 11 // PRE INCREMENT
        System.out.println(--a); // 10 // PRE DECREMENT
    }
}

// RELATIONAL OPERATORS //

class relational{
    public static void main(String[]args){
        int a=10;
        int b=20;
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
    }
}

// LOGICAL OPERATORS //

class logical{
    public static void main(String[]args){
        int a=10;
        int b=20;
        System.out.println(a>b && a!=b); // && = * (AND)
        System.out.println(a>b || a!=b); // || = + (OR)
        System.out.println(!(a>b && a!=b)); // ! = NOT
    }
}

// BITWISE OPERATORS //

class bitwise{
    public static void main(String[]args){
        int a=10;
        int b=20;
        System.out.println(a&b); // 0
        System.out.println(a|b); // 30
        System.out.println(a^b); // 30
        System.out.println(~a); // -11
        System.out.println(a<<2); // 40
        System.out.println(a>>2); // 2
    }
}

// ASSIGNMENT OPERATORS //

class assignment{
    public static void main(String[]args){
        int a=10;
        int b=20;
        a+=b;
        System.out.println(a);
        a-=b;
        System.out.println(a);
        a*=b;
        System.out.println(a);
        a/=b;
        System.out.println(a);
        a%=b;
        System.out.println(a);
        a<<=b;
        System.out.println(a);
        a>>=b;
        System.out.println(a);
        a&=b;
        System.out.println(a);
        a^=b;
        System.out.println(a);
        a|=b;
        System.out.println(a);
    }
}

/*

// BINARY NUMBER SYSTEM //

1. Decimal Number System:
    0, 1, 2, 3, 4, 5, 6, 7, 8, 9
2. Binary Number System:
    0, 1

// CONVERSION OF BINARY TO DECIMAL //

1. 1010 = 1*2^3 + 0*2^2 + 1*2^1 + 0*2^0 = 8 + 0 + 2 + 0 = 10

// CONVERSION OF DECIMAL TO BINARY //

1. 10 = 10/2 = 5, 0
2. 5 = 5/2 = 2, 1
3. 2 = 2/2 = 1, 0
4. 1 = 1/2 = 0, 1
5. 1010

// CONVERSION OF BINARY TO OCTAL //

1. 1010 = 10/3 = 3, 1
2. 3 = 3/3 = 1, 0
3. 1 = 1/3 = 0, 1
4. 12

// CONVERSION OF OCTAL TO BINARY //

1. 12 = 1*8^1 + 2*8^0 = 8 + 2 = 10
2. 10 = 10/2 = 5, 0
3. 5 = 5/2 = 2, 1
4. 2 = 2/2 = 1, 0
5. 1 = 1/2 = 0, 1
6. 1010

// CONVERSION OF BINARY TO HEXADECIMAL //

1. 1010 = 10/16 = 0, A
2. A = 10/16 = 0, A
3. AA

// CONVERSION OF HEXADECIMAL TO BINARY //

1. AA = 10*16^1 + 10*16^0 = 160 + 10 = 170
2. 170 = 170/2 = 85, 0
3. 85 = 85/2 = 42, 1
4. 42 = 42/2 = 21, 0
5. 21 = 21/2 = 10, 1
6. 10 = 10/2 = 5, 0
7. 5 = 5/2 = 2, 1
8. 2 = 2/2 = 1, 0
9. 1 = 1/2 = 0, 1
10. 10101010

*/


