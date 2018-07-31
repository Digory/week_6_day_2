public class Runner {

    public static void main(String[] args){

        Library library = new Library(100);
        Book catPictures = new Book("Cat Pictures 2", BookGenre.NONFICTION);
        Borrower digory = new Borrower();

        library.addBook(catPictures);

        System.out.println(digory.borrowBookFromLibrary(library));
        System.out.println(digory.borrowBookFromLibrary(library));

        digory.printCollection();
    }
}
