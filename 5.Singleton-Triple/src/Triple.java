
public class Triple {
    private int id;
    public static Triple[] triple = new Triple[] {
        new Triple(0),
        new Triple(1),
        new Triple(2)
    };
    private Triple(int id){
        this.id = id;
        System.out.println("create instance " + id + ".");
    }
    public static Triple getInstance(int id){
        return triple[id];
    }
    public String toString(){
        return "[Triple id = " + id + "]";
    }
}
