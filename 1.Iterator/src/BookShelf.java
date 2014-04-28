import java.util.ArrayList;


public class BookShelf implements Aggregate{
    private ArrayList bookList;
    private int last = 0;
    
    public BookShelf(){
        this.bookList = new ArrayList();
    }
    public Object getBookAt(int index){
        return bookList.get(index);
    }
    public void appendBook(Book book){
        this.bookList.add(book);
    }
    public int getLength(){
        return bookList.size();
    }
    public Iterator iterator(){
        return new BookShelfIterator(this);
    }
}
