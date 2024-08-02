public class Phone {
    int price=90000;
    int inventedyear=1995;
    String colour="black";
    String brand="iphone";
   static String location="japan";
   static int version =19;
   static int companynumber=78;

   void m1(String newlocation){
       System.out.println("i am iphone user");
   }
   static void m2(int newyearinvented,int newcompanynumber){
       System.out.println("i am samsung user");
   }
   Phone(int newprice){
       System.out.println("0-argument constructor");
   }
   Phone(String newcolour, String newbrand){
       System.out.println("1-argument constructor");

   }

    {
        System.out.println ("instance block");
    }
    static {
       System.out.println("Static block");
    }
    public static void main(String agr[]){
       Phone p1 = new Phone(2009);
       Phone p2 = new Phone("RED","samsung");
       System.out.println(p1.price);
       System.out.println(p1.inventedyear);
       System.out.println(p1.colour);
       System.out.println(p1.brand);
       System.out.println(p1.location);
       System.out.println(p1.version);
       System.out.println(p1.companynumber);
       p2.m2(2024,789);
       p2.m1("USA");

    }

}
