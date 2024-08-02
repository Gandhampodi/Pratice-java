public class Name {
    String name1="saikumar";
    String name2="Gandhampodi";
    String name3="Saikumar";
    String name4="Gandhampodi";
            void add(String name1,String name2){
                System.out.println("Full name="+name1+name2);
            }
            void add1(String name2, String name3){
                System.out.println("Full name="+name2+name3);
            }
            Name(){
                System.out.println("0-argu constructor");

            }
            Name(String name1, String name2, String name3, String name4){
                System.out.println("1-argument constructor");
            }
    {
        System.out.println("instance block");
    }static
    {
        System.out.println("static block");
    }
            public static  void main(String agrs[]){
                Name n1=new Name("saikumar","Gandhampodi","saikuamr","Gandhampodi");
                Name n2=new Name();
                n2.add("saikumar","Gandhampodi");
                n2.add1("Saikumar","Gandhampodi");
                System.out.println(n1.name1+""+n1.name2);
                System.out.println(n2.name2+""+n2.name3);

            }
}
