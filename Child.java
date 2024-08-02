

public class Child extends Parent {


    Child() {
        this(12, "jay");
        System.out.println("0- agru constructor");
    }

    Child(int a, String name) {
        super("VERIZON",45);
        System.out.println("1- agru constructor");

    }


    public static void main(String[] agrs) {

           Child child= new Child();

            }
    }

