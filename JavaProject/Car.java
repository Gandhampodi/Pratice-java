package JavaProject;

public class Car {
    public static void main(String[] agr){
        int carspeed=100;
        int capacity=4;
        int year=2022;
        if(carspeed>=120&&(capacity>=4&&year>2022)){
            System.out.println("I want this model range car ");
        }
        else if(carspeed<=100&&(capacity<=5&&year<=2022)){
            System.out.println("it's ok but i want update version");
        }
        else{
            System.out.println("i don't want this model range car");
        }
    }
}
