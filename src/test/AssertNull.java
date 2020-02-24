package test;

import model.Book;
import org.junit.Test;
import service.BookService;
import static org.junit.jupiter.api.Assertions.*;

public class AssertNull {
    @Test
    public void assertNullWithNoMessage(){
        BookService bookService=new BookService();

        Book headFirstJavaBook= new Book("1","Head First Java","Wrox");
        Book headFirstDesignPatternBook= new Book("2","Head First Design Pattern","Packet");

        bookService.addBook(headFirstJavaBook);
        bookService.addBook(headFirstDesignPatternBook);

        Book actualBook=bookService.getNookByID("3");
        assertNull(actualBook);
    }
    @Test
    public void assertNullWithMessage(){
        BookService bookService=new BookService();

        Book headFirstJavaBook= new Book("1","Head First Java","Wrox");
        Book headFirstDesignPatternBook= new Book("2","Head First Design Pattern","Packet");

        bookService.addBook(headFirstJavaBook);
        bookService.addBook(headFirstDesignPatternBook);

        Book actualBook=bookService.getNookByID("3");
        assertNull(actualBook,"Book List is not null");
    }
    @Test
    public void assertNullWithMessageSupplier(){
        BookService bookService=new BookService();

        Book headFirstJavaBook= new Book("1","Head First Java","Wrox");
        Book headFirstDesignPatternBook= new Book("2","Head First Design Pattern","Packet");

        bookService.addBook(headFirstJavaBook);
        bookService.addBook(headFirstDesignPatternBook);

        Book actualBook=bookService.getNookByID("3");
        assertNull(actualBook,()->"Book List is not null");
    }
}
