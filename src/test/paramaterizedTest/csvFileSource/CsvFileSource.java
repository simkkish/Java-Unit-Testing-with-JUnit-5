package test.paramaterizedTest.csvFileSource;

import example.StringHelper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.junit.jupiter.api.Assertions.*;

public class CsvFileSource {
    @ParameterizedTest
    @org.junit.jupiter.params.provider.CsvFileSource(resources = "..\\..\\reverse.csv")
    public void csvFileSourceTest(String first,String second){
        assertNotNull(first);
        assertNotNull(second);
    }
    @ParameterizedTest
    @org.junit.jupiter.params.provider.CsvFileSource(resources = "..\\..\\reverse.csv",numLinesToSkip = 1)
    public void csvFileSourceWithNumberOfLinesToSkipTest(String first,String second){
        assertNotNull(first);
        assertNotNull(second);
    }
}
