import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> collection;

    public Borrower(){
        collection = new ArrayList<>();
    }

    public boolean borrowBookFromLibrary(Library library){
        Book book = library.removeBook();
        if (book == null){
            return false;
        }
        else {
            collection.add(book);
            return true;
        }
    }

    public void printCollection(){
        for (Book elements : collection){
            System.out.println(elements.getTitle() + " - Genre: " + elements.getGenre() + " - " + elements.getDescription());
        }
    }
}
