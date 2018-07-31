public class Runner {

    public static void main(String[] args){

        Library library = new Library(100);
        Book catPictures = new Book("Cat Pictures", BookGenre.NONFICTION);
        Book catPictures2 = new Book("Cat Pictures 2", BookGenre.NONFICTION);
        Book catPicturesUnseen = new Book("Cat Pictures - NEVER SEEN BEFORE", BookGenre.OTHER);
        Borrower digory = new Borrower();

        library.addBook(catPictures);
        library.addBook(catPictures2);
        library.addBook(catPicturesUnseen);

        System.out.println(digory.borrowBookFromLibrary(library));
        System.out.println(digory.borrowBookFromLibrary(library));
        System.out.println(digory.borrowBookFromLibrary(library));
        System.out.println(digory.borrowBookFromLibrary(library));

        System.out.println(library.getAmountOfGenre(BookGenre.OTHER));
        System.out.println(library.getAmountOfGenre(BookGenre.NONFICTION));

        digory.printCollection();
    }
}
