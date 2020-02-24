package test;

import model.Book;
import org.junit.Test;
import service.BookService;
import static org.junit.jupiter.api.Assertions.*;

public class AssertEqual {
    @Test
    public void assertEqualsWithNoMessage(){
        BookService bookService=new BookService();

        Book headFirstJavaBook= new Book("1","Head First Java","Wrox");
        Book headFirstDesignPatternBook= new Book("2","Head First Design Pattern","Packet");

        bookService.addBook(headFirstJavaBook);
        bookService.addBook(headFirstDesignPatternBook);

        Book actualBook=bookService.getNookByID("1");

        assertEquals("1",actualBook.getBookId());
        assertEquals("Head First Java",actualBook.getTitle());
    }
    @Test
    public void assertEqualsWithMessage(){
        BookService bookService=new BookService();

        Book headFirstJavaBook= new Book("1","Head First Java","Wrox");
        Book headFirstDesignPatternBook= new Book("2","Head First Design Pattern","Packet");

        bookService.addBook(headFirstJavaBook);
        bookService.addBook(headFirstDesignPatternBook);

        Book actualBook=bookService.getNookByID("1");

        assertEquals("1",actualBook.getBookId());
        assertEquals("Head First Java",actualBook.getTitle(),"Book title didn't match!");
    }
    @Test
    public void assertEqualsWithMessageSupplier(){
        BookService bookService=new BookService();

        Book headFirstJavaBook= new Book("1","Head First Java","Wrox");
        Book headFirstDesignPatternBook= new Book("2","Head First Design Pattern","Packet");

        bookService.addBook(headFirstJavaBook);
        bookService.addBook(headFirstDesignPatternBook);

        Book actualBook=bookService.getNookByID("1");

        assertEquals("1",actualBook.getBookId());
        assertEquals("Head First Java",actualBook.getTitle(),()->"Book title didn't match!");
    }
}
