public class Phoneprice {
    public static void main(String[] agrs) {

        String phone = "Iphone";
        int price = 100000;
        if (price>=10000 && price<=20000 ){
            System.out.println("The phone price is "+price);
            System.out.println("the phone company is"+phone);
        }
        else if(price>=20000 && price<=50000){
            System.out.println("The phone price is "+price);
            System.out.println("the phone company is"+phone);
        }
        else if(price>=50000 && price<=100000){
            System.out.println("The phone price is "+price);
            System.out.println("the phone company is"+phone);
        }
        
    }
}
