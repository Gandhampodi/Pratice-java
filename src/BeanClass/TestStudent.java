package BeanClass;

public class TestStudent {
    public static void main(String ar[]){
        Student std= new Student();
        std.setName("sai kumar");
        System.out.println("Name is :"+ std.getName());
        std.setClassname("INFORMATION TECHNLOGY");
        System.out.println("ClassName is :"+std.getClassname());
        std.setContact("HOD");
        System.out.println("Contact is:"+std.getContact());
        std.setRno(13);
        System.out.println("RollNo:"+std.getRno());



    }
}
