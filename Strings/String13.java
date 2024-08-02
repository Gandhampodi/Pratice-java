package Strings;

public class String13 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Saikumar");
        StringBuilder sb2 = new StringBuilder("Saikumar");
        System.out.println(sb1==sb2);
        sb1=sb1.append("Gandhampodi");
        System.out.println(sb1==sb2);
        StringBuilder sb3 = new StringBuilder("Saikumar Gandhampodi");
        System.out.println(sb1==sb3);


        System.out.println("------------------------");




        String s1= "Saikumar";
        String s2= "Saikumar";
        System.out.println(s1 == s2);
        s1=s1+"Gandhampodi";   // here change the different address
        System.out.println(s1 == s2);
        String s3= "saikumar gandhampodi";
        System.out.println(s1 == s3);
    }
}
