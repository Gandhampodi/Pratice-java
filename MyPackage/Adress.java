package MyPackage;

public class Adress {
   private String name;
   private  String city;
   private String state;        // This class contain properties is called Tightly
   private int zip;
   private  int houseNumber;
   private int age;
    public void setName(String name) {
        this.name = name;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setState(String state) {
        this.state = state;
    }
    public void setZip(int zip) {
        this.zip = zip;
    }
    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public String getCity(){
        return city;
    }
    public String getState(){
        return state;
    }
    public int getZip(){
        return zip;
    }
    public int getHouseNumber(){
        return houseNumber;
    }
    public int getAge(){
        return age;
    }
    public static void main(String agrs[]){
        Adress a = new Adress();
        a.setAge(40);
        a.setCity("San Francisco");
        a.setState("CA");
        a.setHouseNumber(10);
        a.setName("Ayyappa");
        a.setZip(5068);
        System.out.println(a.getName());
        System.out.println(a.getCity());
        System.out.println(a.getState());
        System.out.println(a.getHouseNumber());
        System.out.println(a.getAge());
        System.out.println(a.getZip());

    }

}
