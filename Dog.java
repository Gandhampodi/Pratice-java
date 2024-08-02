public class Dog {
    int age=9;
    String name="jokey";
    void eat(String food){
      System.out.println("instance method");
    }
    static void sleep(int hours){
        System.out.println("Static method");
    }
    Dog(int newage ){
        System.out.println("0-agru constructors");
    }
    Dog(String updateName){
        System.out.println("1-argument constructors");
    }
    {
        System.out.println("Instance block");
    }
    static {
        System.out.println("static block");
    }
    public static void main(String[] agrs){
        Dog d1=new Dog(89);
        System.out.println(d1.age);
        System.out.println(d1.name);
        d1.eat("chicken");
        d1.sleep(10);
        Dog d2 =new Dog("john");

    }

}
