package Loops;

public class Employees {
    public static void main(String[] args) {


        int salary = 5000;
        int hra = 15;
        int da = 17;
        if (salary >= 5000){
            salary=salary+hra+da;
            System.out.println("Salary is "+salary);
        }
        else if (salary <= 5000){
            salary=salary+hra+da;
            System.out.println("Salary is "+salary);
        }
    }
}