public class Flight1 {
    int flightNumber;
    String flightName;
    float price;
    int seats;
    Flight1()
    {
        flightNumber=8976;
        flightName="Delta";
        price=245.0f;
        seats=80;

    }
    void display(){
        System.out.println("flightNumber="+flightNumber);
        System.out.println("flightName="+flightName);
        System.out.println("price="+price);
        System.out.println("seats="+seats);
    }
    public static void main(String[] agrs){
        Flight1 f = new Flight1();
        f.display();
    }

}
