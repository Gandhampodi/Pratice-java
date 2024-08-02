public class Test4 {
    Test4(){
        System.out.println("0-argu constructor");
    }
    Test4(int a){
        System.out.println("1-argu constructor");
    }
    Test4(int a, int b){
        System.out.println("2-argu constructor");
    }
    {
        System.out.println("instance block");
    }
    public static void main(String[] args){
        Test4 t1 = new Test4();
        Test4 t2 = new Test4(45);
        Test4 t3 = new Test4(98,89);
    }
}
