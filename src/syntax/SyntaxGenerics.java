package syntax;

public class SyntaxGenerics {

    public static void main(String[] args) {

       /* ArrayList a = new ArrayList();
        a.add(15);
        a.add("Hello");
        Integer b=(Integer)a.get(1);//class Case exception
        */

      /* //Generic Version
        ArrayList<Integer> a=new ArrayList<>();
        a.add(19);
        a.add("Hello");//compile Time error here  because of generic usage

        */

      Pair<Integer,String> p1=new OrderedPair<>(1,"apple");
      Pair<String,Integer> p2=new OrderedPair<>("banana",2);
      print(p1.getKey(), p1.getValue());
      print(p2.getKey(), p2.getValue());
        print("Hello", "World");


    }

    public static <K,V> void print(K key , V value)
    {
        System.out.println("Key -->"+key+"   V--> "+value);
    }
}
