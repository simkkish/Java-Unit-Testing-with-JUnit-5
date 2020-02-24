package test.performanceTest;

import model.Book;
import org.junit.Test;
import service.BookService;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AssertTimeoutPreemptively {
    @Test
    public void assertTimeOutWithNoMessage(){
        BookService bookService=new BookService();
        for(int i=1;i<=1000;i++){
            bookService.addBook(new Book(String.valueOf(i),"Head First Java","Wrox"));
        }
        List<String> actualTitles= new ArrayList<>();

        assertTimeoutPreemptively(Duration.ofMillis(1),()->{
            actualTitles.addAll(bookService.getBookTitleByPublisher("Wrox"));
        });
        assertEquals(1000,actualTitles.size());
    }

    @Test
    public void assertTimeOutWithMessage(){
        BookService bookService=new BookService();
        for(int i=1;i<=1000;i++){
            bookService.addBook(new Book(String.valueOf(i),"Head First Java","Wrox"));
        }
        List<String> actualTitles= new ArrayList<>();

        assertTimeoutPreemptively(Duration.ofMillis(1),()->{
            actualTitles.addAll(bookService.getBookTitleByPublisher("Wrox"));
        },"Performance issues with getBookTitlesByPublisher() method !");
        assertEquals(1000,actualTitles.size());
    }

    @Test
    public void assertTimeOutWithMessageSupplier(){
        BookService bookService=new BookService();
        for(int i=1;i<=1000;i++){
            bookService.addBook(new Book(String.valueOf(i),"Head First Java","Wrox"));
        }
        List<String> actualTitles= new ArrayList<>();

        assertTimeoutPreemptively(Duration.ofMillis(1),()->{
            actualTitles.addAll(bookService.getBookTitleByPublisher("Wrox"));
        },()->"Performance issues with getBookTitlesByPublisher() method !");
        assertEquals(1000,actualTitles.size());
    }
}
