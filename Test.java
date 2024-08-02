public class Test {
    void  m1() {
        System.out.println("m1");
    }
    static void m2(){
        System.out.println("m2");
    }

    Test(){
        System.out.println("0-arg constructor");
    }
    Test(int a){
        System.out.println("1-arg constructor");
    }
    public static void main(String[] agrs){
        Test t=new Test();
        Test t1=new Test(23);
        t.m1();
        Test.m2();
    }


}
