package SchoolManagementSystem;

public class Teacher extends Students {
    private int salary;
    private String name;
    private int experiences;
    private int paidsalary;

    public Teacher(int salary, String name, int experiences, int paidsalary) {
        super(13,"yogi",7,6000,10000);

        this.salary = salary;
        this.name = name;
        this.experiences = experiences;
        this.paidsalary = paidsalary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperiences() {
        return experiences;
    }

    public void setExperiences(int experiences) {
        this.experiences = experiences;
    }

    public int getPaidsalary() {
        return paidsalary;
    }

    public void setPaidsalary(int paidsalary) {
        this.paidsalary = paidsalary;
    }
}
