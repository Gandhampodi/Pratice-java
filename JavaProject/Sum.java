package JavaProject;

public class Sum {
    public static void main(String[] args) {
        int start = 40;
        int end = 80;
        int sum = 0;
        int number = start;
        while (number<= end) {
            if (number % 2 == 0) {
                sum += number;
            }
            number++;
        }
        System.out.println("Sum of even numbers between " + start + " and " + end + " is: " + sum);
    }
    }


