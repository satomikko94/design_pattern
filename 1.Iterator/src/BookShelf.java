import java.util.ArrayList;


public class BookShelf implements Aggregate{
    private ArrayList bookList;
    
    public BookShelf(int initialSize){
        this.bookList = new ArrayList(initialSize);
    }
    public Book getBookAt(int index){
        return (Book)bookList.get(index);
    }
    public void appendBook(Book book){
        bookList.add(book);
    }
    public int getLength(){
        return bookList.size();
    }
    public Iterator iterator(){
        return new BookShelfIterator(this);
    }
}
