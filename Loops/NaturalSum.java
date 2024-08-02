package Loops;

public class NaturalSum {
    public static void main(String[] args) {
        int n=6;
        int i=1;
        int sum=0;
        while(i<=n) {
            System.out.print(i);
            i++;
            sum+=i;

        }
        System.out.println(sum);

    }
}
