package BeanClass;

public class TestEmp {
    public static void main(String[] ar){
        Employee emp= new Employee();
        emp.setEmpName("Ayyappa");
        System.out.println("EmpName is:"+emp.getEmpName());
        emp.setSalary(10000);
        System.out.println("EmpSalary is:"+emp.getsalary());
        emp.setBenchnumber(12);
        System.out.println("EmpBenchNumber is:"+emp.getBenchnumber());
        emp.setCompanyName("Verizon");
        System.out.println("EmpCompany is:"+emp.getCompanyName());
        emp.setLocation("USA");
        System.out.println("emplocation is:"+emp.getLocation());
    }
}
