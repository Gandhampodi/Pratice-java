package Loops;

public class NumberDigits {
    public static void main(String[] args) {
        int num=234335353;
        if(num>0 && num<=9){
            System.out.println("one digit number");
        }
        else if(num>9 && num<=99){
            System.out.println("two digit number");
        }
        else if(num>99 && num<=999){
            System.out.println("three digit number");
        }
        else if(num>999 && num<=9999){
            System.out.println("four digit number");
        }
        else if(num>9999 && num<=99999){
            System.out.println("five digit number");
        }
        else {
            System.out.println("Largest number");
        }
    }
}
