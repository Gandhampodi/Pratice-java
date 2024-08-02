public class Gust {
    public void read(int age,int height, int weight){
        System.out.println("Read code");
    }
    Gust(){
        System.out.println("0-arg constructor");
    }
    Gust(int newage){
        System.out.println("1-agru constructor");
    }
    {
        System.out.println("Instance block");
    }
    static {
        System.out.println("Stastic block");
    }
}
