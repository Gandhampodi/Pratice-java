
 class Roll {
    private int rollnumber=10;
    private String Name="Ayyappa";
    public int age=40;
    private int roomnumber=65;
    private int studying=12;
   public void m1(int rollnumber){
        System.out.println("Roll="+rollnumber);
    }
   public void m2(String Name){
        System.out.println("Name="+Name);
    }
   public void m3(int age){
        System.out.println("Age="+age);
    }
   public void m4(int roomnumber){
        System.out.println("RoomNumber="+roomnumber);
    }
   public void m5(int studying){
        System.out.println("Studying="+studying);
    }
    Roll(){
        System.out.println("0-argument constructor");
    }
    Roll(int newrollnumber, String newName, int newage){
        System.out.println("1-argument constructor");
    }
    Roll(int newroomnumber, int newstudying){
        System.out.println("2-argument constuctor");
    }
    {
        System.out.println("Instance block");
    }
    static {
        System.out.println("static block");
    }
    public static void main(String[] agrs){
       Roll roll=new Roll();
       System.out.println(roll.rollnumber);
       System.out.println(roll.Name);
       System.out.println(roll.studying);
    }
}
