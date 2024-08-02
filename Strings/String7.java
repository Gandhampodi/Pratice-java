package Strings;

public class String7 {
    public static void main(String[] args) {
        String s1="Ayyappa";
        String s2="ayyappa";
        String s3="Ayyappa";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s2.contains("a"));
        System.out.println(s2.startsWith("a"));
        System.out.println(s2.endsWith("a"));

    }
}
