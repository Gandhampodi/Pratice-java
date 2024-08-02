package SchoolManagementSystem;

public class School extends Teacher {
    private int schoolexpensives;
    private int paidsalaries;
    private int remaingamount;

    public School(int paidsalaries, int schoolexpensives, int remaingamount) {
        super(60000,"Ayyappa",10,40000);

        this.paidsalaries = paidsalaries;
        this.schoolexpensives = schoolexpensives;
        this.remaingamount = remaingamount;
    }

    public int getSchoolexpensives() {
        return schoolexpensives;
    }

    public void setSchoolexpensives(int schoolexpensives) {
        this.schoolexpensives = schoolexpensives;
    }

    public int getPaidsalaries() {
        return paidsalaries;
    }

    public void setPaidsalaries(int paidsalaries) {
        this.paidsalaries = paidsalaries;
    }

    public int getRemaingamount() {
        return remaingamount;
    }

    public void setRemaingamount(int remaingamount) {
        this.remaingamount = remaingamount;
    }
}