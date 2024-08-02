public class Main1 extends Mouse2 {
    public static void main(String[] agrs){
        Mouse2 m2 = new Mouse2();
        m2.leftclick();
        m2.rightclick();
        m2.scrolldown();
        m2.scrollup();
        m2.colour("black");
        m2.connect();
        System.out.print(m2.company);
    }
}
