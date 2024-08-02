package Strings;

public class String6 {
    public static void main(String[] args) {
        String s1="Saikumar";
        String s2="SAIKUMAR";
        String s3="SaiKumar";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s1.contains("a"));
        System.out.println(s1.contains("y"));
        System.out.println(s1.contains("Sai"));
        System.out.println(s1.contains("saikumar"));
        System.out.println(s1.startsWith("Sa"));
        System.out.println(s1.endsWith("sa"));
    }
}
