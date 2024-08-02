package Loops;

public class Bill {
    public static void main(String[] args) {
        int unitbill = 199;
        double amount = 5.75;
        if (unitbill > 0 && unitbill <= 49) {
            amount = amount * unitbill;
            System.out.println(amount);
        } else if (unitbill > 50 && unitbill <= 99) {
            amount = amount * unitbill;
            System.out.println(amount);
        } else if (unitbill > 100 && unitbill <= 149) {
            amount = amount * unitbill;
            System.out.println(amount);
        } else if (unitbill > 150 && unitbill <= 199) {
            amount = amount * unitbill;
            System.out.println(amount);
        } else if (unitbill >= 200) {
            amount = amount * unitbill;
            System.out.println(amount);
        }
    }

}

