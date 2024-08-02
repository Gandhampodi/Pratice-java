package Car;

public class Vehicle {
    private String name;
    private int currentSpeed;
    private int currentdirection;

    public Vehicle(String name) {
        this.name = name;
        this.currentSpeed = 0;
        this.currentdirection = 0;
    }
    public void steering(int direction){
        this.currentdirection+= direction;
        System.out.println("steer method called: steering at"+ currentdirection+"degree");

    }
    public void move(int speed, int direction){
        currentSpeed=speed;
        currentdirection=direction;
        System.out.println("move method called: moveing at"+currentSpeed+"in direction"+currentdirection);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getCurrentdirection() {
        return currentdirection;
    }

    public void setCurrentdirection(int currentdirection) {
        this.currentdirection = currentdirection;
    }
    public void stop(){
        this.currentSpeed=0;
    }
}
