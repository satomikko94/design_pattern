import framework.*;

public class Main {

    public static void main(String[] args) {
        // Prepare
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('~');
        MassageBox mbox = new MassageBox('*');
        MassageBox sbox = new MassageBox('/');
        manager.register("storong message", upen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);
        
        // Create
        Product p1 = manager.create("storong message");
        p1.use("Hello, World!");
        Product p2 = manager.create("warning box");
        p2.use("Hello, World!");
        Product p3 = manager.create("slash box");
        p3.use("Hello, World!");
    }

}
