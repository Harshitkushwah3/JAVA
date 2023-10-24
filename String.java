/*
    String: 
        - String is a class in java.lang package
        - String is a sequence of characters
        - String is immutable

    String class methods:
        - charAt(int index)
        - length()
        - substring(int beginIndex)
        - substring(int beginIndex, int endIndex)
        - concat(String str)
        - equals(String str)
        - equalsIgnoreCase(String str)
        - compareTo(String str)
        - compareToIgnoreCase(String str)
        - contains(CharSequence s)
        - startsWith(String prefix)
        - endsWith(String suffix)
        - indexOf(String str)
        - indexOf(String str, int fromIndex)
        - lastIndexOf(String str)
        - lastIndexOf(String str, int fromIndex)
        - replace(char oldChar, char newChar)
        - replace(CharSequence target, CharSequence replacement)
        - toLowerCase()
        - toUpperCase()
        - trim()
        - valueOf(int i)
        - valueOf(double d)
        - valueOf(char[] data)
        - valueOf(char[] data, int offset, int count)
        - valueOf(boolean b)
        - valueOf(Object o)
        - valueOf(long l)
        - valueOf(float f)
        - valueOf(char c)
        - valueOf(byte b)
        - valueOf(short s)
        - valueOf(int i, int radix)
        - valueOf(long l, int radix)
        - valueOf(float f, int radix)
        - valueOf(double d, int radix)
        - valueOf(BigInteger bi)
        - valueOf(BigInteger bi, int radix)
        - valueOf(BigDecimal bd)
        - valueOf(char[] data, int offset, int count)
        - valueOf(char[] data)
        - valueOf(boolean b)
        - valueOf(Object o)
        - valueOf(char c)
        - valueOf(byte b)
        - valueOf(short s)
        - valueOf(int i, int radix)
        - valueOf(long l, int radix)
        - valueOf(float f, int radix)
        - valueOf(double d, int radix)
        - valueOf(BigInteger bi)
        - valueOf(BigInteger bi, int radix)
        - valueOf(BigDecimal bd)
        - valueOf(char[] data, int offset, int count)
        - valueOf(char[] data)
        - valueOf(boolean b)
        - valueOf(Object o)
        - valueOf(char c)
        - valueOf(byte b)
        - valueOf(short s)
        - valueOf(int i, int radix)
        - valueOf(long l, int radix)
        - valueOf(float f, int radix)

    String Constructors:
        - String()
        - String(String original)
        - String(char[] value)
        - String(char[] value, int offset, int count)
        - String(int[] codePoints, int offset, int count)
        - String(byte[] bytes)
        - String(byte[] bytes, int offset, int length)
        - String(byte[] bytes, int offset, int length, String charsetName)
        - String(byte[] bytes, String charsetName)
        - String(StringBuffer buffer)
        - String(StringBuilder builder)
        - String(StringBuilder builder)
        - String(StringBuffer buffer)
        - String(StringBuilder builder) 
    
    String Conactenate :
        public static void main(String[] args) {
            String s1 = "Hello";
            String s2 = "World";
            String s3 = s1 + s2;
            System.out.println(s3);
        }
    Stirng each character print:
        public static void main(String[] args) {
            String s1 = "Hello";
            for(int i = 0; i < s1.length(); i++) {
                System.out.println(s1.charAt(i));
            }
        }

    String compare :
        public static void main(String[] args) {
            String s1 = "Hello";
            String s2 = "hello";
            if(s1.compareTo(s2) == 0) {
                System.out.println("Equal");
            } else {
                System.out.println("Not Equal");
            }
        }

// We can't use == operator to compare two strings  . == operator compares the references of the objects

class compare {
    public static void main(String[] args) {
        if(new String("Hello") == new String("Hello")) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}


Substrings: To find the substring of a string, we use substring() method. This method has two variants.
            - substring(int beginIndex)
            - substring(int beginIndex, int endIndex)

    e.g.
        public static void main(String[] args) {
            String s1 = "Hello World is my first program";
            System.out.println(s1.substring(1,5));
        }

//ParseInt Method of Integer class


    public static void main(String[] args) {
        String s1 = "123";
        int i = Integer.parseInt(s1);
        System.out.println(i);
    }

    public static void main(String[] args) {
        String s1 = "123.45";
        double d = Double.parseDouble(s1);
        System.out.println(d);
    }

    public static void main(String[] args) {
        String s1 = "123.45";
        float f = Float.parseFloat(s1);
        System.out.println(f);
    }

    public static void main(String[] args) {
        String s1 = "123.45";
        long l = Long.parseLong(s1);
        System.out.println(l);
    }

    public static void main(String[] args) {
        String s1 = "123.45";
        short s = Short.parseShort(s1);
        System.out.println(s);
    }

    public static void main(String[] args) {
        String s1 = "123.45";
        byte b = Byte.parseByte(s1);
        System.out.println(b);
    }

    public static void main(String[] args) {
        String s1 = "123.45";
        boolean b = Boolean.parseBoolean(s1);
        System.out.println(b);
    }

    public static void main(String[] args) {
        String s1 = "123.45";
        char c = s1.charAt(0);
        System.out.println(c);
    }

    public static void main(String[] args) {
        String s1 = "123.45";
        char[] c = s1.toCharArray();
        System.out.println(c);
    }

        
 */

// \\ STRING BUILDERS // \\

/*

Strings in java are immutable. It means that once we create a string object, we can't modify it. If we try to modify it, a new object is created.

HOW WE DECLARE STRING BUILDERS
        StringBuilder sb = new StringBuilder("Hello");


    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb);
    }

*/



class concat {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1 + s2;
        System.out.println(s3);
    } 
}


class eachCharacterPrint {
    public static void main(String[] args) {
        String s1 = "Hello";
        for(int i = 0; i < s1.length(); i++) {
            System.out.println(s1.charAt(i));
        }
    }
}


class compare {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "hello";
        if(s1.compareTo(s2) == 0) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}

class sentence{
    public static void main(String[] args) {
        String s1 = "Hello World is my first program";
        System.out.println(s1.substring(1,5));
    }
}



class parseint{
    public static void main(String args[]) {
       String str = "123";
       int number = Integer.parseInt(str);
       System.out.println(number);  
   }
}


class toString{
    public static void main(String args[]) {
       int number = 123;
       String str = Integer.toString(number);
       System.out.println(str);
       System.out.println(str.length());  
   }
}


// STRINFG BUILDER //

class stringbuilder{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.charAt(0));  // char at index 0.
        sb.setCharAt(0, 'L');  // set char at index 0 to L.
        System.out.println(sb);
        sb.insert(2,'Y'); // insert values at defined index in it.
        System.out.println(sb);
        sb.delete(0, 3); // delete values from defined index 0 to 3.
        System.out.println(sb);
        sb.append(" World"); // append values at the end of string.
        System.out.println(sb);
        sb.reverse(); // reverse the string.
        System.out.println(sb);
        System.out.println(sb.length());


// In this we use for loop to reverse the string.
/*
        for(int i=0;i<sb.length()/2;i++){
            int front=i;
            int back=sb.length()-i-1;
            char temp=sb.charAt(front);
            char temp2=sb.charAt(back);
            sb.setCharAt(front, temp2);
            sb.setCharAt(back, temp);
        }
        System.out.println(sb);
    }
*/

// In this we use while loop to reverse the string.
/*
        int i=0;
        int j=sb.length()-1;
        while(i<j){
            char temp=sb.charAt(i);
            char temp2=sb.charAt(j);
            sb.setCharAt(i, temp2);
            sb.setCharAt(j, temp);
            i++;
            j--;
        }
        System.out.println(sb);
    }

*/

}
}