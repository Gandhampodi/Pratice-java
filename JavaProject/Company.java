package JavaProject;

public class Company {
    public static void main(String[] agrs){
        String[] company={"Version","Walmart","Hcl"};
        for(int i=0; i<company.length; i++){
            if(company[i]=="Version"){
                continue;
            }
            System.out.println(company[i]);

        }
    }
}
