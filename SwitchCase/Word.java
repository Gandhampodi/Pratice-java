package SwitchCase;

public class Word {
    public static void main(String[] args) {
        int digit=1;
        switch(digit){
            case 1: digit=1;
                System.out.println("one");
                break;
            case 2: digit=2;
                System.out.println("two");
                break;
            case 3: digit=3;
                   System.out.println("three");
                   break;
            case 4: digit=4;
                   System.out.println("four");
                   break;
            case 5: digit=5;
                    System.out.println("five");
                    break;
            default:
                System.out.println("Invalid digit");
        }
    }
}
