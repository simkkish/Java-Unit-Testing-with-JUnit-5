package test.paramaterizedTest.nullAndEmptySource;

import example.StringHelper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.*;

public class NullAndEmptySource {
    @ParameterizedTest
    @NullSource
    public void testReverseWithNullSource(String input){
        StringHelper stringHelper=new StringHelper();
        assertEquals(null,stringHelper.reverse(input));
        assertNull(stringHelper.reverse(input));
    }
    @ParameterizedTest
    @EmptySource
    public void testReverseWithEmptySource(String input){
        StringHelper stringHelper=new StringHelper();
        assertEquals("",stringHelper.reverse(input));
    }
    @ParameterizedTest
    @org.junit.jupiter.params.provider.NullAndEmptySource
    public void testReverseWithNullAndEmptySource(String input){
        StringHelper stringHelper=new StringHelper();
        assertEquals(input,stringHelper.reverse(input));
    }
    @ParameterizedTest
    @NullSource
    @EmptySource
    public void testReverseWithNullAndEmptySourceCombined(String input){
        StringHelper stringHelper=new StringHelper();
        assertEquals(input,stringHelper.reverse(input));
    }
}
