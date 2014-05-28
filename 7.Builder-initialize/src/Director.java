
public class Director {
    private Builder builder;
    public Director(Builder builder) {
        this.builder = builder;
    }
    public void construct(){
        builder.makeTitle("Greetings");
        builder.makeString("From morning to afternoon.");
        builder.makeItems(new String[]{"Good morning.", "Good afternoon."});
        
        builder.makeString("In the evening.");
        builder.makeItems(new String[]{"Good evening.", "Good night.", "See you."});
        
        builder.close();
    }
}
