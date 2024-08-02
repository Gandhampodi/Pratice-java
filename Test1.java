public class Test1 {
    Test1(){
        this(34);
        System.out.println("0-agruments constructor");

    }
    Test1(int a){
        this(45,67);
        System.out.println("1-agruments constructor");
    }
    Test1(int a, int b){
        System.out.println("2-agruments constructor");
    }
    public static void main(String[] argument){
        Test1 t1=new Test1();
    }
}
