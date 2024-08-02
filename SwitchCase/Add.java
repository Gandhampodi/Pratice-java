package SwitchCase;

import Loops.Sales;

public class Add {
    public static void main(String[] args) {
        int a=89;
        int b=89;
        String operation="Addition";
        switch(operation){
            case "Addition":
                System.out.println("ADDITION  ");
                System.out.println(a+b);
                break;
            case "Subtraction":
                System.out.println("SUBTRACTION");
                System.out.println(a-b);
                break;
            case "Multiplication":
                System.out.println("MULTIPLICATION");
                System.out.println(a*b);
                break;
            case "Division":
                System.out.println("DIVISION");
                System.out.println(a/b);
                break;
            default:
                System.out.println("Unknown operation");
        }
    }
}
