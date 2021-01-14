import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {


    public static void main (String [] args){
    int [] asd = new int[] {1,2,3,4,5,6,7,8};

    for(int b : asd){
        System.out.println(b);
    }
    HashMap<Integer, String> te = new HashMap<>();
    
    te.put(1, "eins");
    te.put(2,"zwei");
    te.put(3, "drei");
    te.put(4, "vier");

    Iterator <Integer> itr = te.keySet().iterator();

    while(itr.hasNext()){
        System.out.println(te.get(itr.next()));


    }


    LinkedList<Integer> li = new LinkedList<>();
    li.add(123);
    li.add(234);
    li.add(456);
    li.add(567);




    }

}
