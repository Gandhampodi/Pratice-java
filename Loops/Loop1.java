package Loops;

public class Loop1 {
    public static void main(String[] args) {
        int row = 6;
        for (int i = 1; i <= row; i++) { //each row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}