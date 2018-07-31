import java.util.ArrayList;

public class Library {

        private ArrayList<Book> books;
        private int capacity;

        public Library(int capacity){
            books = new ArrayList<>();
            this.capacity = capacity;
        }

        public int countBooks(){
            return books.size();
        }

        public boolean addBook(Book book){
            if (capacity == countBooks()){
                return false;
            }
            else {
                books.add(book);
                return true;
            }
        }

        public Book removeBook(){
            if (countBooks() == 0){
                return null;
            }
            else {
                Book book = books.get(0);
                books.remove(0);
                return book;
            }
        }

    }




