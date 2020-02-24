package test.performanceTest;

import model.Book;
import org.junit.Test;
import service.BookService;
import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class AssertTimeOut {
    @Test
    public void assertTimeOutWithNoMessage(){
        BookService bookService=new BookService();
        for(int i=1;i<=10000;i++){
            bookService.addBook(new Book(String.valueOf(i),"Head First Java","Wrox"));
        }
        List<String> actualTitles= new ArrayList<>();

        assertTimeout(Duration.ofMillis(5),()->{
            actualTitles.addAll(bookService.getBookTitleByPublisher("Wrox"));
        });
        assertEquals(10000,actualTitles.size());
    }

    @Test
    public void assertTimeOutWithMessage(){
        BookService bookService=new BookService();
        for(int i=1;i<=10000;i++){
            bookService.addBook(new Book(String.valueOf(i),"Head First Java","Wrox"));
        }
        List<String> actualTitles= new ArrayList<>();

        assertTimeout(Duration.ofMillis(5),()->{
            actualTitles.addAll(bookService.getBookTitleByPublisher("Wrox"));
        },"Performance issues with getBookTitlesByPublisher() method !");
        assertEquals(10000,actualTitles.size());
    }

    @Test
    public void assertTimeOutWithMessageSupplier(){
        BookService bookService=new BookService();
        for(int i=1;i<=10000;i++){
            bookService.addBook(new Book(String.valueOf(i),"Head First Java","Wrox"));
        }
        List<String> actualTitles= new ArrayList<>();

        assertTimeout(Duration.ofMillis(5),()->{
            actualTitles.addAll(bookService.getBookTitleByPublisher("Wrox"));
        },()->"Performance issues with getBookTitlesByPublisher() method !");
        assertEquals(10000,actualTitles.size());
    }
}
