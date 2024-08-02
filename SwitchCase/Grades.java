package SwitchCase;

public class Grades {
    public static void main(String[] args) {
        int marks=89;
        switch(marks){
            case 89:
                System.out.println("Honors");
                break;
            case 70:
                System.out.println("First division");
                break;
            case 65:
                System.out.println("Second division");
                break;
            case 55:
                System.out.println("Third division");
                break;
            case 45:
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid marks");
        }
    }
}
