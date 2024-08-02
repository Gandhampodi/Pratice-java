public class Cars {
    void tesla(int gears){
        System.out.println("Instance method1");
    }

    void tesla(int updatemodel,int updategears ,String colour  ){
        System.out.println("Instance method1");

    }
    void tesla(String updatecolour){
        System.out.println("Instance method3");
    }
    public static void main(String agrs[]){
        Cars cars=new Cars();
        cars.tesla(3);
        cars.tesla(3,6,"red");
        cars.tesla("Black");



    }
}
