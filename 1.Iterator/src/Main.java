
public class Main {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.appendBook(new Book("���₷�݃v���v��"));
        bookShelf.appendBook(new Book("�f���炵�����E"));
        bookShelf.appendBook(new Book("�Ђ���̂܂�"));
        bookShelf.appendBook(new Book("�������z���O���t"));
        bookShelf.appendBook(new Book("�\���j��"));
        
        Iterator it = bookShelf.iterator();
        while(it.hasNext()){
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }

}
