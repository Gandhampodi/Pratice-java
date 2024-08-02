package JavaProject;

public class Menu {
    public static void main(String[] args) {
        int idly=10;
        int poori=15;
        int vada=5;
        if((idly>=5&&poori<=10)||(poori>=10&&vada>=15)){
            System.out.println("i want this type of breakfast");

        } else if ((idly<=6&&vada>=10)||(poori>=10&&idly<=10)) {
            System.out.println("it's ok for the breakfast");
        }
        else{
            System.out.println("i don't want this type of breakfast");
        }
    }
}
