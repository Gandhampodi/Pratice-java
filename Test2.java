public class Test2 {
    int eid ;
    String ename;
    Float salary;
    String location;
    int deskNumber;
    Test2(int eid, String ename, Float salary, String location, int deskNumber){// conversion local variable to instance variable
        this.eid=eid;
        this.ename=ename;
        this.salary=salary;
        this.location=location;

    }
    void display(){
        System.out.println("eid="+eid);
        System.out.println("ename="+ename);
        System.out.println("salary="+salary);
        System.out.println("loaction="+location);
        System.out.println("deskNumber="+deskNumber);
    }
    public static void main(String[] agru){
        Test2 t1 = new Test2(767,"Saikumar Gandhampodi",90000f,"USA",645);
        t1.display();
        Test2 t2= new Test2(456,"ayyappa",56000f,"Chennai",890);
    }
}
