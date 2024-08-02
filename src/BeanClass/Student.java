package BeanClass;

public class Student implements java.io.Serializable {
    private String name;
    private String classname;
    private int rno;
    private String contact;
    public Student(){


    }

    public String getName(){
        return name;
    }
    public void setName(String s){
        name=s;
    }
    public String getClassname(){
        return classname;
    }
    public void setClassname(String c){
        classname =c;
    }

    public int getRno() {
        return rno;
    }

    public void setRno ( int r ) {
         rno=r;
    }
    public String getContact(){
        return contact;

    }
    public void setContact(String A){
        contact=A;
    }


}
