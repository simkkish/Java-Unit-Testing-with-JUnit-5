package test.paramaterizedTest.valueSource;

import example.Calculator;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValueSource {
    @Test
    public void testEvenValues(){
        Calculator calculator=new Calculator();
        assertTrue(calculator.isEvenNumber(2));

        assertTrue(calculator.isEvenNumber(4));

        assertTrue(calculator.isEvenNumber(6));

        assertTrue(calculator.isEvenNumber(8));

        assertTrue(calculator.isEvenNumber(12));
    }
    @ParameterizedTest
    @org.junit.jupiter.params.provider.ValueSource(ints={2,4,6,8,10})
    public void testEvenValuesUsingParameterizedTest(int number){
        Calculator calculator=new Calculator();
        assertTrue(calculator.isEvenNumber(number));

    }
}
