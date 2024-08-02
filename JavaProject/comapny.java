package JavaProject;

public class comapny {
    public static void main(String[] args) {
        int carprice=90000;
        int carspeed=120;
        int year=2024;
        if((carspeed>=120&&carprice<=10000)|| (year<=2022&&carprice<=10000)){

            System.out.println("I want this model range car");
        }
        else if((carspeed>=90&&carprice>=10000)||(carprice>=10000&&year<=2022)){
            System.out.println("it's ok for this range car");
        }
        else{
            System.out.println("i don't have this model range car ");
        }
    }
}
