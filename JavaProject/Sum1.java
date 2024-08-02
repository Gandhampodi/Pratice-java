package JavaProject;

public class Sum1 {
    public static void main(String[] args) {
        int start=120;
        int end=20;
        int sum=0;
        int num = start;
        while(num>=end){
            if(num%2!=0){
                sum-=num;
            }
            num--;

        }
        System.out.println("Sum of odd numbers between " + start + " and " + end + " is: " + sum);
    }
    }

