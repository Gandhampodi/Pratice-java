public class Teacher {
     Teacher(float salary){
        System.out.println("0-agru constructor");
        System.out.println("Salary="+salary);
    }
     Teacher(int member, int age, String name){

        System.out.println("1- agruments Constructor");
        System.out.println("Member="+member);
        System.out.println("AGE="+age);
        System.out.println("Name="+name);
    }
     Teacher(String qualification, int address){
        System.out.println("2-agruments constructor");
        System.out.println("QUALIFICATION="+qualification);
        System.out.println("ADDRESS="+address);
    }
    public static void main(String[] agrs){
        Teacher teacher=new Teacher(20000);
        Teacher teacher1=new Teacher(5,35,"JOHN");
        Teacher teacher2=new Teacher("MBA",561);
    }
}
