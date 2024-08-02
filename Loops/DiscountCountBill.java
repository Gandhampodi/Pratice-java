package Loops;

public class DiscountCountBill {
    public static void main(String[] args) {
        int bill=500;
        int discount=3;
        int netbill;
        if(bill<=500){
            discount=(bill*discount/100);
            netbill=bill-discount;
            System.out.println("discount ="+ discount);
            System.out.println("netbill ="+ netbill);
        }
        else if(bill>500){
            discount=(bill*discount/100);
            netbill=bill-discount;
            System.out.println("discount ="+ discount);
            System.out.println("netbill ="+ netbill);
        }
    }
}
