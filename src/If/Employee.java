package If;

public class Employee {
    public static  void main(String agr[]){
        String empName="Ayyappa";
        String empID="122";
        String emplocation="Banglore";
        int empsalary=30000;
        //String status="";

        System.out.println("Emplyeee Details");
        System.out.println("-----------------");
        System.out.println("empName:"+empName);
        System.out.println("empId:"+empID);
        System.out.println("empLocation:"+emplocation);
        System.out.println("empsalary:"+empsalary);


        if (empsalary>=1000 && empsalary<=100000){
            if(empsalary<10000)
                System.out.println("support mannager");
        }
        else if(empsalary<20000){
            System.out.println("HR manager");
        }
        else if(empsalary<30000){
            System.out.println("Develop engineer");
        }
        else if(empsalary<40000){
            System.out.println("java developer");
        }
        else if(empsalary<50000){
            System.out.println("manager");
        }
        else if(empsalary<60000){
            System.out.println("Director of company");
        }
        else {
            System.out.println("Invalid salary");
        }

    }
}
