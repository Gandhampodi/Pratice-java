package If;

public class Houses {
    public static void main(String agr[]) {
        String Houseaddr = "Centron";
        int HouseRent = 2500;
        int HouseNum = 571;
        System.out.println("House  Detail");
        System.out.println("-----------");
        System.out.println("HouseRent:" + HouseRent);
        System.out.println("Houseaddr:" + Houseaddr);
        System.out.println("HouseNum:" + HouseNum);

            if (HouseRent > 1000 && HouseRent <= 2000 && HouseNum > 560 && HouseNum <= 570) {
                System.out.println("two bed and one bath apartment");
            } else if (HouseRent > 2000 && HouseRent <= 3000 && HouseNum > 570 && HouseNum <= 580) {
                System.out.println("Three bed and two bath apartment");
            } else if (HouseRent > 3000 && HouseRent <= 4000 && HouseNum > 580 && HouseNum <= 590) {
                System.out.println("four bed and three bath apartment");
            } else if (HouseRent > 4000 && HouseRent <= 5000 && HouseNum > 590 && HouseNum <= 600) {
                System.out.println("four bed and three bath apartment");
            } else {
                System.out.println("this apartments are full");
            }
        }
    }

