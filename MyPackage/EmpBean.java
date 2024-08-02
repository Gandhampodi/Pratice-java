package MyPackage;

public class EmpBean {
    private int empid;
    private String ename;
    private String dept;
    private String job;
    private int sal;
     // setter used to the values to properties
    public void setEmpid(int empid) {
        this.empid = empid;
    }
    public void setEname(String ename) {
        this.ename = ename;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public void setSal(int sal) {
        this.sal = sal;
    }
    // getter are used to the get the value from properties
    public int getEmpid() {
        return empid;
    }
    public String getEname() {
        return ename;
    }
    public String getJob() {
        return job;
    }
    public String getDept() {
        return dept;
    }
    public int getSal() {
        return sal;
    }

    }


