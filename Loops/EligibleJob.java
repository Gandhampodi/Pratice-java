package Loops;

public class EligibleJob {
    public static void main(String[] args) {
        String Gender="male";
        int age=56;
        int marks=60;
        if(Gender.equalsIgnoreCase("male")&& age>=21 && marks>=60){
            System.out.println("He is selected");
        }
        else{
            System.out.println("He is not selected");
        }
    }

}
