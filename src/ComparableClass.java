import java.util.Comparator;
import java.util.Date;

public class ComparableClass {

    public static void main(String[] args) {

        //without generics
        /*Comparable c =new Date();
        System.out.println(c.compareTo("Monday"));*/

        Comparable<Date> c=new Date();
    //    System.out.println(c.compareTo("String"));//here we get an error at compile time



    }
}
