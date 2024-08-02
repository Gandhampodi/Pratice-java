package If;

public class Salary {
    public static void main(String agr[]) {
        double baseSalary = 50000;
        double finalSalary = baseSalary;
        String rating = "B";
        int experience = 6;
        String role = " senior developer";
        if (role.equalsIgnoreCase("Junior developer")) {
            finalSalary = baseSalary;
        } else if (role.equalsIgnoreCase("devloper")) {
            finalSalary = baseSalary + 10;

        } else if (role.equalsIgnoreCase("senior developer")) {
            finalSalary = baseSalary + 20;

        } else if (role.equalsIgnoreCase("team lead")) {
            finalSalary = baseSalary + 30;

        } else if (role.equalsIgnoreCase("manager")) {
            finalSalary = baseSalary + 40;

        }
        if (experience > 2 && experience <= 5) {
            finalSalary = baseSalary + 0.5;
        } else if (experience > 5) {
            finalSalary = baseSalary + 0.10;

        }
        if (rating.equalsIgnoreCase("A")) {
            finalSalary += baseSalary * 0.15;
        } else if (rating.equalsIgnoreCase("B")) {
            finalSalary += baseSalary * 0.10;
        } else if (rating.equalsIgnoreCase("c")) {
            finalSalary += baseSalary * 0.5;

        } else if (rating.equals("D")) {
            finalSalary += 0;
        } else if (rating.equals("E")) {
            finalSalary -= baseSalary * 0.5;

        }
        System.out.println("you final  salary is:" + finalSalary);
    }
}
