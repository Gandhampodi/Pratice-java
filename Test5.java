public class Test5 {
    Test5(){
        System.out.println("0-argu constructor");
    }
    Test5(int a){
        System.out.println("1-argu constructor");
    }
    static {
        System.out.println("static block");
    }
    public static void main(String[] agrs){
        Test5 t1= new Test5();
        Test5 t2= new Test5(78);
    }
}
