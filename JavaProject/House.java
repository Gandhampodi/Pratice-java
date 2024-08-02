package JavaProject;

public class House {
    public static void main(String[] args) {

    int housenumber=561;
    int code=5433;
    String address="San Francisco";
    switch (housenumber){
        case 561:
            code=5433;
            address="San Francisco";
            System.out.println("Housenumber: "+housenumber);
            System.out.println("Code: "+code);
            System.out.println("Address: "+address);
            break;
            case 543:
                code=545;
                address="centerton";
                System.out.println("Housenumber: "+housenumber);
                System.out.println("Code: "+code);
                System.out.println("Address: "+address);
                break;
        case 345:
            code=3456;
            address="Atlanta";
            System.out.println("Housenumber: "+housenumber);
            System.out.println("Code: "+code);
            System.out.println("Address: "+address);
            break;
        default:
            System.out.println("i am staying outside city");
    }


    }
}
