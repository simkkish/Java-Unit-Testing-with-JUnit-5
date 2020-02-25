package test.repeatedTest;

import static org.junit.jupiter.api.Assertions.*;

public class RepeatedTest {
    @org.junit.jupiter.api.RepeatedTest(5)
    public void simpleRepeatedTest(){
        assertTrue(0<5);
    }
}
