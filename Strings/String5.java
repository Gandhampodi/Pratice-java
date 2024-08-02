package Strings;

public class String5 {
    public static void main(String[] args) {
        String s1 = "Sai kumar"; // store in string pool
        String s2 = new String("Sai kumar");  // store in heap memory
        String s3 = "Sai kumar";
        String s4 = new String("Sai kumar");
        System.out.println(s1==s3);
        System.out.println(s2==s4);
        System.out.println(s2.equals(s4));// i use equal() method because here data comparison working
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }
}
