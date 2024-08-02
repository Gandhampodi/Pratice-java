public class HouseRent {
    public static void main(String[] args) {
        int bedrooms=3;
        int rent=1500;
        int bathroom=3;
        if(rent>=1000 && rent<=2000){
            System.out.println("The house rent is "+rent);
            System.out.println("The bedrooms is "+bedrooms);
            System.out.println("The bathroom is "+bathroom);

        }
       else if(rent>=2000 && rent<=3000){
            System.out.println("The house rent is "+rent);
            System.out.println("The bedrooms is "+bedrooms);
            System.out.println("The bathroom is "+bathroom);
        }
       else if(rent>=3000 && rent<=4000){
            System.out.println("The house rent is "+rent);
            System.out.println("The bedrooms is "+bedrooms);
            System.out.println("The bathroom is "+bathroom);
        }
    }
}
