public class Flight {
    int flightNo=2424;
    int capacity=150;
   static String flightname="delta";
    public static void main(String agrs[]){
        Flight f=new Flight();
        System.out.println(f.flightNo);
        System.out.println(f.capacity);
        System.out.println(Flight.flightname);
        Flight f1= new Flight();
        f1.m1(6755,"americanairlines");
        Flight.m2(45);
    }
    void m1(int updateNumber,String updateName){
        System.out.println(updateNumber);
        System.out.println(updateName);
    }
    static void m2(int seatnumber){
        System.out.println(seatnumber);
    }
}
