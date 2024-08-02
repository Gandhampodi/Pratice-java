public class Flight2 {
    Flight2(){
        this("saikumar");
        System.out.println("0-arguments constructors");
    }
    Flight2(String ename){
        System.out.println("1-arguments constructors");
    }
    public static void main(String[] agrs){
        Flight2 flight= new Flight2();
    }
}
