public class MehrereElemente {

    int eins;
    char zwei;
    String drei;

    public MehrereElemente(int eins, char zwei, String drei){
        this.eins = eins;
        this.zwei = zwei;
        this.drei = drei;
    }
    @Override
    public String toString(){
        return "Eine Zahl: " + this.eins + ", Ein Character: " + this.zwei + ", Eine Zeichenkette: " + this.drei;
    }
}
