public class Clg {

    void list(int members){
        System.out.println("Members="+ members);
    }
    void list(int rollnumber,int id){
        System.out.println("RoLLNUMBER="+rollnumber);
        System.out.println("ID="+id);

    }
    void list(int totalmarks, String name, int desknumber){
        System.out.println("Total Marks="+totalmarks);
        System.out.println("Name="+name);
    }
    void list(char c){
        System.out.println("Char="+c);
    }

    {
        System.out.println("instance method");
    }
    static {
        System.out.println("static method");
    }
    public static void main(String[] agrs){
        Clg c=new Clg();
        c.list(25);
        c.list(111518,13);
        c.list(600,"Saikumar",1);
        c.list('S');
    }
}
