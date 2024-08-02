package Strings;

public class String12 {
    public static void main(String[] args) {
         StringBuffer sb1 = new StringBuffer("Saikumar");
        StringBuffer sb2 = new StringBuffer("Saikumar");
        System.out.println(sb1==sb2);
        sb1=sb1.append("Gandhampodi");
        System.out.println(sb1==sb2);
        StringBuffer sb3 = new StringBuffer("Saikumar Gandhampodi");
        System.out.println(sb1==sb3);


        System.out.println("------------------------");




        String s1= "Saikumar";  // s1 hold the address
        String s2= "Saikumar";
        System.out.println(s1 == s2);
        s1=s1+"Gandhampodi";   // here change the different address
        System.out.println(s1 == s2);
        String s3= "saikumar gandhampodi";
        System.out.println(s1 == s3);
    }

}
