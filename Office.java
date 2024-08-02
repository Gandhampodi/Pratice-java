public class Office {
    public static void main(String[] args){
        College col = new College();
        col.m1("jay");
        col.m2(7);
        col.m3("male");
        col.m4("'RMD");
        System.out.println(col.age);
        System.out.println(col.name);
        System.out.println(col.clg);
        System.out.println(col.Gender);
        Marks m=new Marks(787);
        m.updatedatabasescore(78);
        m.updatejavascore(98);
        m.updatemongodbscore(90);
        m.updatepowerbiscore(98);
        m.updatewebscore(0);
        System.out.println(col.name);
        System.out.println(col.clg);
        System.out.println(col.age);
        System.out.println(col.Gender);
        System.out.println(m.totalmarks);
        System.out.println(m.mathscore);
        System.out.println(m.sciencescore);

    }
}
