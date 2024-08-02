package Loops;

public class Sales {
    public static void main(String[] args) {
        int sales=10000;
        int comm=10;
        int netsales;
        if(sales>=0 && sales<=5000){
           netsales =sales*comm;
           System.out.println(netsales);
        }
        else if(sales>=5000 && sales<=10000){
            netsales =sales*comm;
            System.out.println(netsales);
        }
        else if(sales>=10000 && sales<=15000){
            netsales =sales*comm;
            System.out.println(netsales);
        }
        else if(sales>=15000 && sales<=25000){
            netsales =sales*comm;
            System.out.println(netsales);
        }
        else if(sales>=25000){
            netsales =sales*comm;
            System.out.println(netsales);
        }
    }
}
