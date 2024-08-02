public class Car {
    private int speed=120;
    public int year=2023;
    private String model="Nissan";
    private void m1(int speed){
        System.out.println("Speed="+ speed);
    }
    private void m2(int year){
        System.out.println("Year="+year);

    }
    private void m3(String model){
        System.out.println("Model="+model);
    }
    Car(){
        System.out.println("0- argument constructor");
    }
   private Car(int newspeed){
        System.out.println("1-argument constructor");
    }
   private Car(String newmodel, int newyear){
        System.out.println("2-argument constructor");
    }
    {
        System.out.println("Instance Block");
    }
    static{
        System.out.println("static block");

    }
    public static void main(String agrs[]){
        Car car = new Car();
        car.m1(100);
        car.m2(2024);
        car.m3("BMW");
        Car car1=new Car(250);
        Car car2=new Car("sportcar",2025);
        System.out.println(car1.year);
        System.out.println(car1.model);
    }

    }


