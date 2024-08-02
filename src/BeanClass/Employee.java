package BeanClass;

public class Employee implements java.io.Serializable {
    private String empName;
    private String companyName;
    private int benchnumber;
    private int salary;
    private String location;

    public String getEmpName(){
        return empName;
    }
    public void setEmpName(String s){
        empName=s;
    }
    public String getCompanyName(){
        return companyName;
    }
    public void setCompanyName(String s){
        companyName=s;
    }
    public int getBenchnumber(){
        return benchnumber;
    }
    public void setBenchnumber(int n){
        benchnumber=n;
    }
    public String getLocation(){
        return location;
    }

    public void setLocation(String l) {
         location=l;
    }
    public int getsalary(){
        return salary;
    }
    public void setSalary(int n){
        salary=n;
    }
}
