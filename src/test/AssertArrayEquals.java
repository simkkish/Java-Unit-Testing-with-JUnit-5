package test;

import model.Book;
import org.junit.Test;
import service.BookService;


import static org.junit.jupiter.api.Assertions.*;

public class AssertArrayEquals {

    @Test
    public void assertArraysEqualsWithNoMessage() {
        BookService bookService = new BookService();

        Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
        Book headFirstDesignPatternBook = new Book("2", "Head First Design Pattern", "Packet");
        Book headFirstJavascriptBook = new Book("3", "Head First Javascript", "Wrox");

        bookService.addBook(headFirstJavaBook);
        bookService.addBook(headFirstDesignPatternBook);
        bookService.addBook(headFirstJavascriptBook);

        String[] actualBookIds=bookService.getBookIdsByPublisher("Wrox");

       assertArrayEquals(new String[]{"1","3"},actualBookIds);
    }

    @Test
    public void assertEqualsWithMessage() {
        BookService bookService = new BookService();

        Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
        Book headFirstDesignPatternBook = new Book("2", "Head First Design Pattern", "Packet");
        Book headFirstJavascriptBook = new Book("3", "Head First Javascript", "Wrox");

        bookService.addBook(headFirstJavaBook);
        bookService.addBook(headFirstDesignPatternBook);
        bookService.addBook(headFirstJavascriptBook);

        String[] actualBookIds=bookService.getBookIdsByPublisher("Wrox");

        assertArrayEquals(new String[]{"1","3"},actualBookIds,"BookIds did't match !");
    }

    @Test
    public void assertEqualsWithMessageSupplier() {
        BookService bookService = new BookService();

        Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
        Book headFirstDesignPatternBook = new Book("2", "Head First Design Pattern", "Packet");
        Book headFirstJavascriptBook = new Book("3", "Head First Javascript", "Wrox");

        bookService.addBook(headFirstJavaBook);
        bookService.addBook(headFirstDesignPatternBook);
        bookService.addBook(headFirstJavascriptBook);

        String[] actualBookIds=bookService.getBookIdsByPublisher("Wrox");

        assertArrayEquals(new String[]{"1","3"},actualBookIds,()->"BookIds did't match !");
    }
}
