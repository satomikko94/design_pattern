
public class Triple {
    public static Triple[] triple = new Triple[3];
    private Triple(){
        System.out.println("create instance.");
    }
    public static Triple getInstance(int id){
        return triple[id];
    }
}
