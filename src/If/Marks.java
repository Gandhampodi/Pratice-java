package If;

public class Marks {
    public static  void main(String ar[]){
        String id="111";
        String name="Sai";
        String addr="USA";
        int marks=67;
        System.out.println("Student Details");
        System.out.println("---------------");
        System.out.println("Student Id :"+ id);
        System.out.println("Student Name :"+name);
        System.out.println("Student Marks :"+marks);
        System.out.println("Student addr:" +addr);
        String Status="";
        if(marks>=0 && marks<=100){
            if(marks<=35){
                System.out.println("fail");
            }
            else if(marks<50){
                System.out.println("Third class");
            }
            else if(marks<60){
                System.out.println("Second class");
            }
            else if(marks<70){
                System.out.println("First class");
            }
            else{
                System.out.println("Distinction");
            }
            }
        else{
            System.out.println("Invalid Marks");
        }
        System.out.println("Student Status :" +Status);
        }
    }

