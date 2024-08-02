package Strings;

public class String14 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Saikumar"); //sb hold the data
        sb.insert(0,"Gandhampodi"); // insert is not possible in string
        sb.deleteCharAt(1);
        sb.delete(0,6);
        sb.reverse();
      //  sb.capacity();
        // sb.ensureCapacity(100);
      //  System.out.println(sb.capacity());
        // in stringbuffer and stringbulider we use the equal and equalingore take the address
        //but insert are accessble in the stribuffer&stringbulider
    }

}
