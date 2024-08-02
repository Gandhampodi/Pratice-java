package Loops;

public class Grade {
    public static void main(String args[]) {
        int grade = 58;
        if (grade >= 80 && grade <= 100) {
            System.out.println("Hornors");
            System.out.println(grade);
        } else if (grade >= 69 && grade <= 79) {
            System.out.println("first division");
            System.out.println(grade);
        } else if (grade >= 50 && grade <= 69) {
            System.out.println("second division");
            System.out.println(grade);
        } else if (grade >= 40 && grade <= 50) {
            System.out.println("third division");
            System.out.println(grade);
        } else if (grade >= 0 && grade <= 40) {
            System.out.println("fail");
            System.out.println(grade);
        }

    }


}




