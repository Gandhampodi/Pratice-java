package Car;

public class Nissan extends Car1 {


    public Nissan(String name, int gears, boolean ismanual) {
        super(name, 4, "nissan", 4, 6, 3);
    }

    public void accelerate(int rate) {
        int newspeed = getCurrentSpeed() + rate;
        if (newspeed == 0) {
            stop();
        } else if (newspeed > 0 && newspeed <= 10) {
            changegear(1);
        } else if (newspeed > 10 && newspeed <= 20) {
            changegear(2);
        } else if (newspeed > 20 && newspeed <= 30) {
            changegear(3);
        } else if (newspeed > 30 && newspeed < 50) {
            changegear(4);
        } else if (newspeed > 60 && newspeed <= 70) {
            changegear(5);
        } else {
            changegear(6);
        }
        if (newspeed > 0) {
            changespeed(newspeed, getCurrentdirection());
        }
    }
}
