public class Emp2 {
    int eid;
    String ename;
    float salary;
    Emp2(){
         eid =56;
         ename ="Ayyappa";
         salary =20000.7f;


    }
    void display(){

        System.out.println("eid is "+eid);

        System.out.println("ename is "+ename);
        System.out.println("salary is "+salary);
    }
    public static  void main(String[] agrs){
        Emp2 e=new Emp2();
        e.display();
    }

}
