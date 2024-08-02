public class Bikes1 extends Bikes {
    void hondha(int Speed,int price,int version ){
        System.out.println(" White colour");
        System.out.println("Speed="+Speed);
        System.out.println("Price="+price);
        System.out.println("Version="+version);
    }
    public static void main(String[] agrs){
        Bikes1 b1= new Bikes1();
        b1.hondha(120,60000,2024);
        b1.hondha(80,45000,2010);
    }
}
