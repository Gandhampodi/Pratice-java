package MyPackage;

public class ExplictConversion {
    public static void main(String[] args) {
        byte b=10;
        short s=500;
        int i=65;
        float f=25.1f;
        long l=7895463;
        double d=52.55;
        char c='a';
        boolean b1=true;
        s=(short)l;
        i=(int)l;
        System.out.println(s);
        System.out.println(i);
    }
}


