package JavaProject;

public class Cricket {
    public static void main(String[] agrs){
        int score=30;
        int wickets=1;
        int catches=3;
        if(score>=75&&(wickets>=4&&catches<=5)){
            System.out.println("you got man of the match");
        }
        else if(score<=75&&(wickets>=5&&catches<=5)){
            System.out.println("better to next time");

        }
        else{
            System.out.println("you have to practice more");
        }
    }
}
