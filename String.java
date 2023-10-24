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

    
 */





public class Strings {
    
}
