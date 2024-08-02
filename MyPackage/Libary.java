package MyPackage;

public class Libary {
    String bookname="social";
    int price=90;
   static int rownumber=89;
   void m1(String location){
       System.out.println("instance method");
   }
   static void m2(int streetnumber){
       System.out.println("static method");
   }
   Libary(int newcoloumn){
       System.out.println("0-argu constructor");
   }
   Libary(int newprice, String newbookname){
       System.out.println("1-argu constructor");

   }
    {
        System.out.println("instance method");
    }static{
       System.out.println("static method");
    }
    public static void main(String agrs[]){
       Libary l1=new Libary(89);
       Libary l2=new Libary(90,"telugu");
       System.out.println(l1.price);
       System.out.println(l1.bookname);
       l2.m1("chennai");
       l2.m2(78);

    }

}
