
public class Main {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("おやすみプンプン"));
        bookShelf.appendBook(new Book("素晴らしき世界"));
        bookShelf.appendBook(new Book("ひかりのまち"));
        bookShelf.appendBook(new Book("虹が原ホログラフ"));
        
        Iterator it = bookShelf.iterator();
        while(it.hasNext()){
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }

}
