package JavaProject;

public interface Animal {
    void eat();
    void sleep();
    void walk();
    void price();
}
class Cow implements Animal {
    public void eat() {
        System.out.println("cow eat only gross");
    }
    public void sleep() {
        System.out.println("cow sleep any time");
    }
    public void walk() {
        System.out.println("cow walk any time");
    }
    public void price() {
        System.out.println("cow price is 100000");
    }
    public static void main(String[] args) {
        Cow cow = new Cow();
        cow.eat();
        cow.sleep();
        cow.walk();
        cow.price();
    }
}
