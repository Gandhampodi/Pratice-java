package MyPackage;


 abstract class Bike {

    abstract void speed ();

    abstract void price();

    public void version() {
        System.out.println("Bike Version is 2023 model");

    }
}
class Tvs extends Bike {
    void speed() {
        System.out.println("TV Speed minimum 45");
    }

    void price() {
        System.out.println("TV Price is $45");
    }


    public static void main(String agru[]) {
        Tvs t = new Tvs();
        t.price();
        t.speed();
        t.version();
    }
}




