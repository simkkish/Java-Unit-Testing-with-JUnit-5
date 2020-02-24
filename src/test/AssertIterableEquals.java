package test;

import model.Book;
import org.junit.Test;
import service.BookService;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AssertIterableEquals {
    @Test
    public void assertIterableEqualsWithNoMessage() {
        BookService bookService = new BookService();

        Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
        Book headFirstDesignPatternBook = new Book("2", "Head First Design Pattern", "Packet");
        Book headFirstJavascriptBook = new Book("3", "Head First Javascript", "Wrox");

        bookService.addBook(headFirstJavaBook);
        bookService.addBook(headFirstDesignPatternBook);
        bookService.addBook(headFirstJavascriptBook);

        List<String> actualTitles=bookService.getBookTitleByPublisher("Wrox");

        List<String> expectedTitles= new ArrayList<>();
        expectedTitles.add("Head First Java");
        expectedTitles.add("Head First Javascript");

        assertIterableEquals(expectedTitles,actualTitles);
    }

    @Test
    public void assertIterableWithMessage() {
        BookService bookService = new BookService();

        Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
        Book headFirstDesignPatternBook = new Book("2", "Head First Design Pattern", "Packet");
        Book headFirstJavascriptBook = new Book("3", "Head First Javascript", "Wrox");

        bookService.addBook(headFirstJavaBook);
        bookService.addBook(headFirstDesignPatternBook);
        bookService.addBook(headFirstJavascriptBook);

        List<String> actualTitles=bookService.getBookTitleByPublisher("Wrox");

        List<String> expectedTitles= new ArrayList<>();
        expectedTitles.add("Head First Java");
        expectedTitles.add("Head First Javascript");
        //expectedTitles.add("Head First book");

        assertIterableEquals(expectedTitles,actualTitles,"Book title did't match !");
    }

    @Test
    public void assertIterableWithMessageSupplier() {
        BookService bookService = new BookService();

        Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
        Book headFirstDesignPatternBook = new Book("2", "Head First Design Pattern", "Packet");
        Book headFirstJavascriptBook = new Book("3", "Head First Javascript", "Wrox");

        bookService.addBook(headFirstJavaBook);
        bookService.addBook(headFirstDesignPatternBook);
        bookService.addBook(headFirstJavascriptBook);

        List<String> actualTitles=bookService.getBookTitleByPublisher("Wrox");

        List<String> expectedTitles= new ArrayList<>();
        expectedTitles.add("Head First Java");
        expectedTitles.add("Head First Javascript");
        //expectedTitles.add("Head First book");

        assertIterableEquals(expectedTitles,actualTitles,()->"Book title did't match !");
    }
}
