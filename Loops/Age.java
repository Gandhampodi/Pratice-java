package Loops;

public class Age {
    public static void main(String[] args) {
        int age=50;
        if(age>1 && age<=5){
            System.out.println("Child age");
        }
        else if(age>13 && age<=19){
            System.out.println("Teenager age");
        }
        else if(age>20 && age<=35){
            System.out.println("Young Age");
        }
        else if(age>40 && age<=55){
            System.out.println("Old Age");
        }
    }

}
