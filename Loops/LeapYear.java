package Loops;

public class LeapYear {
    public static void main(String[] args) {
        int year=2016;
        if(year%400==0){   // if year mulitple by the 400 then it is leap year
            System.out.println("Leap Year");
        }
      else if(year%100==0){ // if year multiple by the 100 then it is not leap year
           System.out.println(" not Leap Year");
       }
      else if(year%4==0){ // if year multiple by the 4  then it is a leap year
           System.out.println("Leap Year");
       }

    }
}
