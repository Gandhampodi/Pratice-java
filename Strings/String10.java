package Strings;

public class String10 {
    public static void main(String[] args) {
        String s1="SAIKUMAR";
        String s2="Saikumar";
        String s3="How are you guy doing";
        String s4="143";
        int i=123478;
        String s5="  ";
        System.out.println(s1.replace("SAIKUMAR","AYYAPPPA"));
        System.out.println(s3.replaceAll("How are you guy doing","Whatsup guys"));
        System.out.println(Integer.valueOf(s4));
        System.out.println(String.valueOf(i));
        System.out.println(s5.isEmpty());
        System.out.println(s5.isBlank());

    }
}
