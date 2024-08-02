package If;
public class Cars {
    public static  void main(String agr[]){
        int price=22000;
        String car="BMW";
        int carmodel=22;
        System.out.println("CAR DETAILS");
        System.out.println("---------------");
        System.out.println("car price:"+ price);
        System.out.println("car company:"+car);
        System.out.println("car model:"+ carmodel);
        if(price>15000 && price<=20000 && carmodel>20 && carmodel<=22){
            System.out.println("this is nissan  price and model");
        }
        else if(price>20000 && price<=25000 && carmodel>21 && carmodel<=23){
            System.out.println("this is BMW price and model");
        }
        else if(price>25000 && price<=30000 && carmodel>22 && carmodel<=23){
            System.out.println("this is KIA price and model");
        }
        else if(price>30000 && price<=40000 && carmodel>24){
            System.out.println("this is Genesis price and model");
        }
        else {
            System.out.println("This car company not avalible");
        }
    }
}
