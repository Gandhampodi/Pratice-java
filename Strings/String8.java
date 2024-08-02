package Strings;

public class String8 {
    public static void main(String[] args) {
        String s1="Hello World   ";
        String s2="  Hello World  ";
        String s3="HELLO WORLD";
        String s4="hello World";
        System.out.println(s1.length());
        System.out.println(s2.trim());
        System.out.println(s1.trim().length());
        System.out.println(s3.toLowerCase());
        System.out.println(s4.toUpperCase());
        System.out.println(s2.trim().toLowerCase());
        char[] a=s1.toCharArray();
        System.out.println(s1.toCharArray());

    }
}
