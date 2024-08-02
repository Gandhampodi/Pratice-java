package JavaProject;

public class Restaurant {
    public static void main(String[] args) {
        String itemname="pizza";
        int price=50;
        switch (itemname) {
            case "pizza":
                price = 50;
                System.out.println("The pizza is $" + price);
                System.out.println("The item is " +itemname);
                break;
            case "cheese pizza":
                price=60;
                System.out.println("The cheese pizza is $" + price);
                System.out.println("The item is " +itemname);
                break;
            case "chicken pizza":
                price=70;
                System.out.println("The chicken pizza is $" + price);
                System.out.println("The item is " +itemname);
                break;
            case "veggies pizza":
                price=80;
                System.out.println("The veggies pizza is $" + price);
                System.out.println("The item is " +itemname);
                break;
            default:
                System.out.println("Invalid item name");

        }

    }
}
