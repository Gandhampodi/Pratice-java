public class Emp1 {
    int eid;
    String ename;
    float sal;
    Emp1()
    {

    }
    void display(){
        System.out.println("emp id ="+eid);
        System.out.println("emp name="+ename);
        System.out.println("emp sal="+sal);
    }
    public static void main(String[] agrs){
        Emp1 e1=new Emp1();
        e1.display();
    }
}
