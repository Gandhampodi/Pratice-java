public class Train {
    int traincapacity=1000;
    static int trainNumber=6063;
    public static void main(String agr[]){
        Train train =new Train();
        System.out.println(train.traincapacity);
        System.out.println(Train.trainNumber);
        Train t=new Train();
        t.train(11222,"hyderabad express");
        Train.booking("indian express");
    }
    void train(int ticketnumber,String name){
        System.out.println(ticketnumber);
        System.out.println(name);

    }
    static void booking(String name){
        System.out.println(name);
    }
}
