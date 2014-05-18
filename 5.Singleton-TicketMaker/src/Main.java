
public class Main {

    public static void main(String[] args) {
        TicketMaker obj1 = TicketMaker.getInstance();
        System.out.println("Aさんのチケットは" + obj1.getNextTicketNumber() + "番です");
        System.out.println("Bさんのチケットは" + obj1.getNextTicketNumber() + "番です");
        TicketMaker obj2 = TicketMaker.getInstance();
        System.out.println("Cさんのチケットは" + obj2.getNextTicketNumber() + "番です");
        System.out.println("Dさんのチケットは" + obj2.getNextTicketNumber() + "番です");
    }

}
