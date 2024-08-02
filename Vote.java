public class Vote {
    public static void main(String[] agru){
        int vote =70;
        if(vote>=18 && vote <=30){
            System.out.println("youth age group");
        }
        else if(vote>=30 && vote<=50){
            System.out.println("medium age group");
        }
        else if(vote>=50 && vote<=70){
            System.out.println("old age group");
        }
    }
}
