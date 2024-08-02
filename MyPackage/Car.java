package MyPackage;

public abstract class Car {
    abstract void price();
    public void version(){
        System.out.println("car version is 3.0");
    }
}
class Nissan extends Car {
    public void price() {
        System.out.println("car price nissan is 100000");
    }

    public static void main(String agr[]){
        Nissan n=new Nissan();
        n.price();
        n.version();

    }

}