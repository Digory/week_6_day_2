import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> books;
    private int capacity;
    private HashMap<BookGenre, Integer> numberOfEachGenre;

    public Library(int capacity) {
        books = new ArrayList<>();
        numberOfEachGenre = new HashMap<>();
        this.capacity = capacity;
    }

    public int countBooks() {
        return books.size();
    }

    public boolean addBook(Book book) {
        if (capacity == countBooks()) {
            return false;
        } else {
            books.add(book);
            incrementGenreCounter(book);
            return true;
        }
    }

    public Book removeBook() {
        if (countBooks() == 0) {
            return null;
        } else {
            Book book = books.get(0);
            books.remove(0);
            return book;
        }
    }

    private void incrementGenreCounter(Book book) {
        if (numberOfEachGenre.containsKey(book.getGenre())) {
            int currentAmount = numberOfEachGenre.get(book.getGenre());
            numberOfEachGenre.replace(book.getGenre(), currentAmount + 1);
        } else {
            numberOfEachGenre.put(book.getGenre(), 1);
        }
    }

    public int getAmountOfGenre(BookGenre genre){
        if(numberOfEachGenre.get(genre) == null){
            return 0;
        }
        else {
            return numberOfEachGenre.get(genre);
        }
    }
}




