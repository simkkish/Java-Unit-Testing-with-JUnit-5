package test.paramaterizedTest.methodSource;

import example.StringHelper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MethodSource {
    @ParameterizedTest
    @org.junit.jupiter.params.provider.MethodSource("argumentsProvider")
    public void methodSourceWithArguments(String input,String expected){
        StringHelper stringHelper=new StringHelper();
        assertEquals(expected,stringHelper.reverse(input));
    }
    public static Stream<Arguments> argumentsProvider(){
        return Stream.of(
                Arguments.arguments("car","rac"),
                Arguments.arguments("mom","mom")
        );
    }
}
