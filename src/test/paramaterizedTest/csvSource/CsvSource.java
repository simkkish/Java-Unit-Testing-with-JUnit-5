package test.paramaterizedTest.csvSource;

import example.StringHelper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class CsvSource {


    @ParameterizedTest
    @org.junit.jupiter.params.provider.CsvSource({
            "car, 'my car' ",
            "test, tset",
            "google,elgoog"
    })

    public void csvSourceWithSingleQuotes(String first,String second){
        assertNotNull(first);
       assertNotNull(second);
    }
    @ParameterizedTest
    @org.junit.jupiter.params.provider.CsvSource({
            "car, rac ",
            "test, tset",
            "google,elgoog"
    })

    public void csvSourceTest(String input,String expect){
        StringHelper stringHelper=new StringHelper();
        assertEquals(expect,stringHelper.reverse(input));
    }
    @ParameterizedTest
    @org.junit.jupiter.params.provider.CsvSource({
            "One, 3 ",
    })

    public void csvSourceWithIntegers(String first,Integer second){
        assertNotNull(first);
        assertNotNull(second);
    }
}
