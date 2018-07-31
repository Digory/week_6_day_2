public class Book {
    private String title;
    private BookGenre genre;

    public Book(String title, BookGenre genre){
        this.title = title;
        this.genre = genre;
    }

    public String getTitle(){
        return title;
    }

    public BookGenre getGenre(){
        return genre;
    }

    public String getDescription(){
        return genre.getDescription();
    }
}

