package Loops;

public class TotalAverageMarks {
    public static void main(String[] args) {
        int maths=90;
        int english=80;
        int telugu=89;
        int science=70;
        int social=60;
        int hindi=56;
        if(maths>80 && maths<=100){
            System.out.println(" maths score " + maths);
            System.out.println("Maths garde is A");
        }
        if(english>70 && english<=79){
            System.out.println("english score " + english);
            System.out.println("english garde is B");
        }
        if(telugu>80 && telugu<=100){
            System.out.println("telugu score " + telugu);
            System.out.println("telugu garde is A");
        }
        if(science>70 && science<=79){
            System.out.println("science score " + science);
            System.out.println("science garde is B");
        }
        if(social>60 && social<=69){
            System.out.println("social score " + social);
            System.out.println("social garde is C");
        }
        if(hindi>50 && hindi<=59){
            System.out.println("hindi score " + hindi);
            System.out.println("hindi garde is D");
        }
        int totalmarks=maths+english+science+social+hindi;
        System.out.println("Total marks: "+totalmarks);
        System.out.println("Average marks: "+totalmarks/6);

    }
}
