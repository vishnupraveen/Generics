package genmethod;

public class GenericMethodImpl {
    public static void main(String[] args) {

        Integer[] list ={10,20,30,40,50,60,70,80};
        String[] days={"Saturday","Saturday","Saturday","Saturday","Saturday"};

        print(list);

        System.out.println("***************************");
        int count= 6>5?0:1;
        print(days);

        System.out.println("Element > 40\t-->"+countGreater(list,40));

    }
    public static <T extends Comparable<T>> int countGreater(T[] list , T limit)
    {
        int count=0;
        for(T element:list)
        {
            if(element.compareTo(limit)>0)
            {
                count++;
            }

        }
        return count;
    }
    public static <E> void print(E[] list)
    {
        for(E element:list)
        {
            System.out.print(element+" ");
        }
        System.out.println();
    }
}
