package SchoolManagementSystem;

public class Students  {
        private int id;
        private String name;
        private int grade;
        private int paidfee;
        private int totalfee;

        public Students(int id, String name, int grade, int paidfee, int totalfee) {
            this.id = id;
            this.name = name;
            this.grade = grade;
            this.paidfee = paidfee;
            this.totalfee = totalfee;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getGrade() {
            return grade;
        }

        public void setGrade(int grade) {
            this.grade = grade;
        }

        public int getPaidfee() {
            return paidfee;
        }

        public void setPaidfee(int paidfee) {
            this.paidfee = paidfee;
        }

        public int getTotalfee() {
            return totalfee;
        }

        public void setTotalfee(int totalfee) {
            this.totalfee = totalfee;
        }
    }


