package test.repeatedTest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.*;

public class RepeatedTestDemo {
    @org.junit.jupiter.api.RepeatedTest(value = 5,name = "{displayName} - {currentRepetition} / {totalRepetitions}")
    @DisplayName("Simple Repeated Test")
    public void simpleRepeatedTest(){
        assertTrue(0<5);
    }
    @org.junit.jupiter.api.RepeatedTest(value = 5,name = RepeatedTest.LONG_DISPLAY_NAME)
    public void simpleRepeatedTestWithLongDisplayName(){
        assertTrue(0<5);
    }
    @org.junit.jupiter.api.RepeatedTest(value = 5,name = RepeatedTest.SHORT_DISPLAY_NAME)
    @DisplayName("Simple Repeated Test")
    public void simpleRepeatedTestWithShortDisplayName(){
        assertTrue(0<5);
    }
}
