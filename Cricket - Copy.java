public class Cricket {
    int score =687;
    static String name="sachin";
    public static void main(String[] agrs){
        Cricket c=new Cricket();
        System.out.println(c.score);
        System.out.println(c.name);
        Cricket c1=new Cricket();
        c1.m1(878,"Rohit","chennai");
        c1.m2(67,90,"mumbai indians");
    }
    void m1(int updatescore, String name,String location){
        System.out.println("m1");
    }
    static void m2(int sixes,int fours,String teamname) {
        System.out.println("m2");
    }
}
