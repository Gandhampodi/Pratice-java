package SchoolManagementSystem;


public class Main extends School {

    public Main( int paidsalaries, int schoolexpensives, int remaingamount){
            super(paidsalaries, schoolexpensives, remaingamount);
            Main m = new Main(100000, 100000, 50000);
            System.out.println("Paid salaries:" + paidsalaries);
            System.out.println("Schoolexpensives:" + schoolexpensives);
            System.out.println("Remaingamount:" + remaingamount);
            System.out.println("Student id:" + getId());
            System.out.println("Student name:" + getName());
            System.out.println("Student grade:" + getGrade());
            System.out.println("Student paidfee:" + getPaidfee());
            System.out.println("Student totalfee:" + getTotalfee());
            System.out.println("Teacher salary:" + getSalary());
            System.out.println("Teacher name:" + getName());
            System.out.println("Teacher experience:" + getExperiences());
            System.out.println("Teacher paidsalary:" + getPaidsalary());

        }
}



