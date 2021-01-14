import java.util.Iterator;

public class LinkList<T> implements Iterable<Knoten>{

    public LinkList(){

    }


    Knoten head = null;// = new Knoten();
    public void addElement(T val, int index) {
        if(head == null){
            head = new Knoten(val, null);

        }
        else{
            Knoten k = head;
            int z = 0;
            while(z != index - 1){
                k = k.getNext();
            }
            k.setNext(new Knoten(val, k.getNext())) ;
        }


    }

    public void addElement(T val){
        if(head == null){
            head = new Knoten(val, null);
        }
        else{
            Knoten k = head;
            while(k.getNext() != null){
                k = k.getNext();
            }
            k.setNext(new Knoten(val));

        }

    }

    public void printElements(){
        Knoten k = head;
        while(k.getNext() != null){
            System.out.println(k.getVal());
            k = k.getNext();
        }
        System.out.println(k.getVal());

    }


    public void removeElement(int index){
        Knoten k = head;
        int z = 0;
        while(z != index - 1){
            k = k.getNext();
            z++;

        }
        k.setNext(k.getNext().getNext());


    }

    public void ChangeElement(int index, T val){
        Knoten k = head;
        int z = 0;
        while(z != index){
            k = k.getNext();
            z++;

        }
        k.setVal(val);
    }
    public Iterator<Knoten> iterator() {
        return new It(head);
    }

    public T findElement(int index){
        Knoten k = head;
        int z = 0;
        while(z != index){
            k = k.getNext();
        }

        return (T) k.getVal();
    }

    static class It implements Iterator<Knoten>{
        Knoten head;
        public It(Knoten head){
            this.head = head;
        }

        @Override
        public boolean hasNext() {
            if(head.getNext() == null){
                return false;
            }
            return true;
        }

        @Override
        public Knoten next() {
            if(hasNext()){
                return head.getNext();
            }
            return null;
        }
    }

    public static void main (String [] args){
        LinkList<String> li = new LinkList<>();
        li.addElement("Eins");
        li.addElement("Zwei");
        li.addElement("Drei");
        li.printElements();
        li.removeElement(2);
        li.addElement("sdfksdfklö", 1);
        li.printElements();

        System.out.println(li.head.getNext().getNext().getVal());

        System.out.println("-----------------------------------------");


        LinkList<MehrereElemente> li2 = new LinkList<>();
        li2.addElement(new MehrereElemente(1, 'a', "eins"));
        li2.addElement(new MehrereElemente(2, 'b', "zwei"));
        li2.addElement(new MehrereElemente(3, 'c', "drei"));
        li2.addElement(new MehrereElemente(4, 'd', "vier"));
        li2.printElements();

    }
}
