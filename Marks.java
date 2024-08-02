public class Marks {
    int totalmarks=1000;
    int mathscore=200;
    int socialscore=167;
    int englishscore=110;
    int sciencescore=178;
    int teluguscore=200;
    void Updatetotalmark(int updatetotalmark){
        System.out.println("Total marks="+totalmarks);
    }
    void updatejavascore(int java){
        System.out.println("Updatejavascore="+java);
    }
    void updatewebscore(int web){
        System.out.println("Updatewebscore="+web);
    }
    void updatedatabasescore(int database){
        System.out.println("Updatabasescore="+database);
    }
    void updatemongodbscore(int mongodb){
        System.out.println("Udatemongodbscore="+mongodb);
    }
    void updatepowerbiscore(int powerbi){
        System.out.println("Updatepowerbiscore="+powerbi);
    }
    Marks(){
        System.out.println("0- argu constuctor");
    }
    Marks(int collegenumaber){
        System.out.println("1-argu constuctor");
    }
    {
        System.out.println("Instance Block");
    }
    static
    {
        System.out.println("Static Block");
    }

}
