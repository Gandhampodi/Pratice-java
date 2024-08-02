package Strings;

public class String11 {
    public static void main(String[] args) {
        /*
        * strings are immutable
        * stringbuffer & stringbulider are mutable
        * Stringbuffer are use the multithread      // important for the interview question
        * stringbulider are use the single thread
        * stringbuffer sb="hello" --> this called as literals
        * stringbuffer---> isa sychcroanized  1.0 version
        * Stringbulider--> is anot sychronized  1.5 version
        * datamanpulation
         */
        String s1= "saikumar";
        String s2= "Saikumar";
        System.out.println(s1 == s2);
        s1=s1+"gandhampodi";
        System.out.println(s1 == s2);
        String s3= "saikumargandhampodi";
        System.out.println(s1 == s3);

    }
}
