package MyPackage;

public class Testclient {
    public static void main(String[] args) {
        EmpBean eb= new EmpBean();
        // here setters are used to set the data
        eb.setEmpid(122);
        eb.setEname("Saikumar");
        eb.setJob("Software Engineering");
        eb.setDept("java");
        eb.setSal(10000);
        // here getter are used to get the data
        System.out.println(eb.getEmpid());
        System.out.println(eb.getEname());
        System.out.println(eb.getJob());
        System.out.println(eb.getDept());
        System.out.println(eb.getSal());
    }
}
