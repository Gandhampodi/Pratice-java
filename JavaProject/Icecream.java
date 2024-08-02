package JavaProject;

public class Icecream {
    public static void main(String[] args) {
        int price=25;
        String itemname="Chocolate";
        int quantity=5;
        switch(itemname){
            case "Chocolate":
                price=25;
                quantity=5;
                System.out.println("itemname is "+itemname);
                System.out.println("Quantity is "+quantity);
                System.out.println("Icecream price is "+price);
                break;
            case "buttersctoch":
                price=30;
                quantity=9;
                System.out.println("itemname is "+itemname);
                System.out.println("Quantity is "+quantity);
                System.out.println("Icecream price is "+price);
                break;
            case "fruitsalad":
                price=45;
                quantity=7;
                System.out.println("itemname is "+itemname);
                System.out.println("Quantity is "+quantity);
                System.out.println("Icecream price is "+price);
                break;
            default:
                System.out.println("invalid item");   
        }
    }
}
