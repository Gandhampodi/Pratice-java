package Loops;

public class UnitBill {
    public static void main(String[] args) {
       int units =150;
       double amount =3.50;
       if(units>150){
           amount=amount*units;
           System.out.println("total amount: "+amount);

       }
       else if(units<=150){
           amount=amount*units;
           System.out.println("total amount: "+amount);
       }
       else {
           System.out.println("Total amount");
       }

    }
}
