public class Knoten<T> {
    private T val;
    private Knoten next;
    public Knoten(T val){
        this.val = val;
        this.next = null;
    }
    public Knoten(T val, Knoten next){
        this.val = val;
        this.next = next;
    }

    public T getVal() {
        return val;
    }

    public Knoten getNext() {
        return next;
    }

    public void setVal(T val) {
        this.val = val;
    }

    public void setNext(Knoten next) {
        this.next = next;
    }
}
