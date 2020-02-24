package test;

import model.Book;
import org.junit.Test;
import service.BookService;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class AssertTrue {
    @Test
    public void assertTrueWithNoMessage() {
        BookService bookService = new BookService();
        // Book headFirstJavaBook=new Book("1","Head First Java","Wrox");
        //  bookService.addBook(headFirstJavaBook);
        List<Book> listOfBooks = bookService.books();
        assertTrue(listOfBooks.isEmpty());
    }

    @Test
    public void assertTrueWithMessage() {
        BookService bookService = new BookService();
        Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
        //  bookService.addBook(headFirstJavaBook);
        List<Book> listOfBooks = bookService.books();
        assertTrue(listOfBooks.isEmpty(), "List of books is not empty");
    }

    @Test
    public void assertTrueWithMessageSupplier() {
        BookService bookService = new BookService();
        Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
        // bookService.addBook(headFirstJavaBook);
        List<Book> listOfBooks = bookService.books();
        assertTrue(listOfBooks.isEmpty(), () -> "List of books is not empty");
    }

    @Test
    public void assertTrueWithBooleanSupplierAndNoMessage() {
        BookService bookService = new BookService();
        Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
        // bookService.addBook(headFirstJavaBook);
        List<Book> listOfBooks = bookService.books();
        assertTrue(() -> listOfBooks.isEmpty());
    }

    @Test
    public void assertTrueWithBooleanSupplierAndMessage() {
        BookService bookService = new BookService();
        Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
        // bookService.addBook(headFirstJavaBook);
        List<Book> listOfBooks = bookService.books();
        assertTrue(() -> listOfBooks.isEmpty(), "ist of books is not empty");
    }

    @Test
    public void assertTrueWithBooleanSupplierAndMessageSupplier() {
        BookService bookService = new BookService();
        Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
        // bookService.addBook(headFirstJavaBook);
        List<Book> listOfBooks = bookService.books();
        assertTrue(() -> listOfBooks.isEmpty(), () -> "ist of books is not empty");
    }
}
