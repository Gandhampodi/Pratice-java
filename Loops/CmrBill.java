package Loops;

public class CmrBill {
    public static void main(String[] args) {
        int comme=50;
        double commercialRate=6.25;
        int domestic=50;
        double domesticRate=3.75;
        int agricuture=200;
        double agricutureRate=6.25;
        int servicechar=20;
        int fuelchar=50;
        if(comme>=0 && comme<=50){
            commercialRate=commercialRate*comme+servicechar+fuelchar;
            System.out.println("Commercial Rate: "+commercialRate);
        }
        else if(comme>50){
           commercialRate=commercialRate*comme+servicechar+fuelchar;
           System.out.println("Commercial Rate: "+commercialRate);
        }
         if(domestic>=0 && domestic<=50){
            domesticRate=domesticRate*domestic+servicechar+fuelchar;
            System.out.println("Domestic Rate: "+domesticRate);
        }
        else if(domestic>=50 && domestic<=99){
            domesticRate=domesticRate*domestic+servicechar+fuelchar;
            System.out.println("Domestic Rate: "+domesticRate);
        }
        else if(domestic>=100 && domestic<=149){
            domesticRate=domesticRate*domestic+servicechar+fuelchar;
            System.out.println("Domestic Rate: "+domesticRate);
        }
         else if(domestic >=150 && domestic<=199){
            domesticRate=domesticRate*domestic+servicechar+fuelchar;
            System.out.println("Domestic Rate: "+domesticRate);
        }
        else if(domestic>=200){
            domesticRate=domesticRate*domestic+servicechar+fuelchar;
            System.out.println("Domestic Rate: "+domesticRate);
        }

        if(agricuture>=200){
             agricutureRate=agricutureRate*agricuture+servicechar+fuelchar;
             System.out.println("Agricuture Rate: "+agricutureRate);
         }
        else if(agricuture<50){
            agricutureRate=agricutureRate*agricuture+servicechar+fuelchar;
            System.out.println("Agricuture Rate: "+agricutureRate);
        }
    }
}
