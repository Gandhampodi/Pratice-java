package JavaProject;

public class Employee {
    public int id=123;
    public String name="Saikumar";
    private int age=22;
    protected String gender="Male";
    private int experience=5;
   public void m1(int salary){
        System.out.println("m1 method");
        System.out.println("Salary="+salary);
    }
  private void m2(String company){
        System.out.println("m2 method");
        System.out.println("Company="+company);
    }
    Employee(){
        System.out.println("0-agrument constructor");
    }
    Employee(int age){
        System.out.println("1-agru constructor");
    }
    {
        System.out.println("Instance method");
    }
    static {
        System.out.println("Static method");
    }
    public static void main(String[] agrs){
       Employee e1=new Employee();
       System.out.println(e1.age);
       System.out.println(e1.gender);
       System.out.println(e1.experience);
       e1.m2("VERIZON");

    }
}
