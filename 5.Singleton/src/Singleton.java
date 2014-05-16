
public class Singleton {
    private static Singleton singleton = new Singleton();
    private Singleton() {
        System.out.println("インスタンスを生成しました。");
    }
    public static Singleton getInstance() {
        System.out.println("インスタンスを返します");
        return singleton;
    }

}
