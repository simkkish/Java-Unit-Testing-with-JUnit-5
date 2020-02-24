package lifecycle;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

//@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class Lifecycle {
    public Lifecycle() {
        System.out.println("Constructor got executed !!!");
    }
    @BeforeAll
    public static void beforeAll(){
        System.out.println("@BeforeAll got executed !!!");
    }
    @BeforeEach
    public void beforeEach(){
        System.out.println("@BeforeEach got executed !!!");
    }
    @Test
    public void testOne(){
        System.out.println("testOne() got executed !!!");
    }
    @Test
    public void testTwo(){
        System.out.println("testTwo got executed !!!");
    }
    @AfterEach
    public void afterEach(){
        System.out.println("@AfterEach got executed !!!");
    }
    @AfterAll
    public static void afterAll(){
        System.out.println("@AfterAll got executed !!!");
    }
}
