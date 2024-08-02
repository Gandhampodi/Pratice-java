public class Cal extends Advancedcal {
    Cal(){
        this(12,"saikumar");
        System.out.println("0-agru constructor");
    }
    Cal(int a, String Name){
        System.out.println("1-argu constructor");
    }

    {
        System.out.println("Instance block");
    }
    static
    {
        System.out.println("static block");
    }
    public static void main(String[] args){
        Cal cal1 = new Cal();
        Cal cal = new Cal();
        cal.add();
        cal.sub();
        cal.mul();
        cal.div();
        cal.mod();
        cal.greaterthan();
        cal.lessthan();
        cal.greaterthanequalsto();
        cal.lessthanequalsto();
        cal.orlogical();
        cal.andlogical();
        cal.sin();
        cal.cos();
        cal.tan();
        cal.csc();
        cal.csc();
        cal.cot();
    }
}
