package JavaProject;

public class College {
    public static void main(String agr[]) {
        float gpa = 3.5f;
        int sat = 1100;
        int act=27;
        if(gpa>=3.0&&(sat>=1200&&act>=25)){
            System.out.println(" admitted ");
        }
        else if(gpa<=3.5&&(sat<=1200&&act>=20)){
            System.out.println(" waitlisted ");
        }
        else {
            System.out.println("Rejected");
        }

    }
}
