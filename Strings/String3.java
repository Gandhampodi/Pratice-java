package Strings;

public class String3 {
    public static void main(String[] args) {
        String s1="Sai kumar"; // store in string pool
        String s2=new String("Sai kumar");  // store in heap memory
        String s3="Sai kumar";
        System.out.println(s1==s3);
        System.out.println(s1==s2);  // it stores in different memory
    }
}
