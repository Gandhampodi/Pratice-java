public class Calculator {
    int a = 90;
    int b = 90;
    int c = 90;
    int d = 78;
    int e = 89;
    int f = 90;
    int g = 9;

    void add(int a, int b) {
        System.out.println("Add="+a + b);
        //System.out.println(this.a + this.b);
    }

    void sub(int a, int c) {
        System.out.println("Sub="+(a - c));
       // System.out.println(this.a - this.c);
    }

    void multiple(int a, int b) {
        System.out.println("Multiple="+a * b); // local variable
        //System.out.println(this.a * b); // instance variable
    }

    void division(int a, int b) {
        System.out.println("division="+a / b);
        //System.out.println(this.a / b);
    }

    void module(int a, int b) {
        System.out.println("Module="+a % b);
        //System.out.println(this.a % b);
    }

    void greatest(int a, int b) {
        System.out.println("Greatest=" +(a > b));
        //System.out.println(this.a > b);
    }
    Calculator(){
        System.out.println("0-argu constructor");
    }
    Calculator(int a, int b){
        System.out.println("1-argu constructor");
    }
    {
        System.out.println("Instance block");
    }
    static {
        System.out.println("Static block");
    }
    public static void main(String[] agrs){
        Calculator calc = new Calculator();
        calc.add(1,2);
        calc.sub(6,8);
        calc.multiple(6,9);
        calc.division(8,9);
        calc.module(56,98);
        calc.greatest(67,67);
       /* System.out.println(calc.a+calc.b);
        System.out.println(calc.c*calc.d);
        System.out.println(calc.a-calc.b);
        System.out.println(calc.c/calc.d);
        System.out.println(calc.a>calc.b);*/
        Calculator calc1= new Calculator();
        Calculator calc2= new Calculator(67,90);

    }
}



