package homework.library;

public class LibraryImpl implements Library {
    // поля
    Book[] book;
    int size;

    // конструктор
    public LibraryImpl(Book[] book) {
        this.book = book;
    }

    // методы
    @Override
    public boolean addBook(Book book) {
        return false;
    }

    @Override
    public Book removeBook(long isbn) {
        return null;
    }

    @Override
    public Book findBook(long isbn) {
        return null;
    }

    @Override
    public int quantity() {
        return 0;
    }

    @Override
    public void printBook() {

    }

}