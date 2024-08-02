package JavaProject;

public class Triangle {
    public static void main(String[] args) {
        int row = 6;
        for (int i = row; i >=1; i--) { //each row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
                System.out.println();
            }
        }
    }