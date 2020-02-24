package test;

import model.Book;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import service.BookService;
import exception.BookNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

@Disabled("skipped until #95 issue has been fixed")
public class AssertThrows {
    @Test
    public void assertThrowsWithNoMessage() {
        BookService bookService = new BookService();

        Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
        Book headFirstDesignPatternBook = new Book("2", "Head First Design Pattern", "Packet");


        bookService.addBook(headFirstJavaBook);
        bookService.addBook(headFirstDesignPatternBook);

        BookNotFoundException bookNotFoundException= assertThrows(BookNotFoundException.class,()->bookService.getBookByTitle("Head First Spring"));
        assertEquals("Book not found in bookstore!",bookNotFoundException.getMessage());
    }

    @Test
    public void assertThrowsWithMessage() {
        BookService bookService = new BookService();

        Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
        Book headFirstDesignPatternBook = new Book("2", "Head First Design Pattern", "Packet");


        bookService.addBook(headFirstJavaBook);
        bookService.addBook(headFirstDesignPatternBook);

        assertThrows(BookNotFoundException.class,()->bookService.getBookByTitle("Head First Spring"),"Different exception thrown!");
    }

    @Test
    public void assertThrowsWithMessageSupplier() {
        BookService bookService = new BookService();

        Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
        Book headFirstDesignPatternBook = new Book("2", "Head First Design Pattern", "Packet");


        bookService.addBook(headFirstJavaBook);
        bookService.addBook(headFirstDesignPatternBook);

        assertThrows(BookNotFoundException.class,()->bookService.getBookByTitle("Head First Spring"),()->"Different exception thrown!");
    }
}
