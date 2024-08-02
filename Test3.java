public class Test3 {
    int a=10;
    static int b=29;
    void m1(int a){
        System.out.println("Instance method");
    }
    static void m2(int a, int b){
        System.out.println("Static method");
    }
    Test3(String name){
        System.out.println("0-arguments constructor");
    }
    Test3(int a, int b){
        System.out.println("1-arguments constructor");
    }
    {
        System.out.println("instance block");
    }
    static{
        System.out.println("static block");
    }
    public  static void main(String agrs[]){
        Test3 t=new Test3("saikumar");
        System.out.println(t.a);
        System.out.println(t.b);
        Test3 t1=new Test3(89,90);
        t.m1(34);
        t.m2(78,9);

    }
}
