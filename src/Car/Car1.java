package Car;

public class Car1 extends Vehicle{
    private int wheels;
    private String type;
    private int door;
    private int gears;
    private int currentgear;

    public Car1(String name, int wheels, String type, int door, int gears,  int currentgear) {
        super(name);
        this.wheels = wheels;
        this.type = type;
        this.door = door;
        this.gears = gears;
       this. currentgear = 1;
    }
    public void changegear(int newgear){
        this.currentgear=newgear;
        System.out.println("changegear method called: changed to"+this.currentgear+"gear");

    }
    public void changespeed(int newspeed, int newdirection){
        move(newspeed, newdirection);
        System.out.println("change speed method called: speed"+newspeed+"direction"+newdirection);
    }

}
