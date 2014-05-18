
public class Main extends Thread{

    public static void main(String[] args) {
        System.out.println("start.");
        new Main("A").start();
        new Main("B").start();
        new Main("C").start();
    }
    public void run(){
        Singleton obj = Singleton.getInstance();
        System.out.println(getName() + ": obj = " + obj);
    }
    public Main(String name){
        super(name);
    }

}
