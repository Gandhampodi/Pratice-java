package If;

public class Tickets {
    public static void main(String agr[]) {
        int age = 67;
        int Ticketprice = 20;
        String dayofweek = "saturday";

        if (dayofweek.equalsIgnoreCase("monday")) {
            System.out.println("Monday ticket price:" + Ticketprice);
        } else if (dayofweek.equalsIgnoreCase("Tuesday")) {
            System.out.println("Tuesday ticket price:" + Ticketprice);
        } else if (dayofweek.equalsIgnoreCase("wednesday")) {
            System.out.println("wednesday ticket price:" + Ticketprice);

        } else if (dayofweek.equalsIgnoreCase("Thursday")) {
            System.out.println("Thursday ticket price:" + Ticketprice);
        } else if (dayofweek.equalsIgnoreCase("Friday")) {
            System.out.println("friday ticket price:" + Ticketprice);
        }
       else if (dayofweek.equalsIgnoreCase("Saturday") || dayofweek.equalsIgnoreCase("Sunday")) {
            Ticketprice *= 0.8;
        }

        if (age < 5) {
            System.out.println("Below five year Ticketprice:" + Ticketprice);
        } else if (age >= 5 && age <= 12) {
            System.out.println("children age  Ticketprice:" + Ticketprice);
        } else if (age >= 13 && age <= 17) {
            System.out.println("teen age Ticketprice:" + Ticketprice);
        } else if (age >= 18 && age <= 64) {
            System.out.println(" adult Ticketprice:" + Ticketprice);
        } else if (age >= 65) {
            System.out.println(" old age Ticketprice:" + Ticketprice);
        }


    }
}
