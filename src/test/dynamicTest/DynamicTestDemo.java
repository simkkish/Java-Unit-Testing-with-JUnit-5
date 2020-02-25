package test.dynamicTest;

import example.StringHelper;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import static org.junit.jupiter.api.Assertions.*;

public class DynamicTestDemo {
    StringHelper stringHelper=new StringHelper();
    @TestFactory
    public DynamicTest testReverse(){
       return DynamicTest.dynamicTest("Dynamic Test for reverse method",()->{
            assertEquals("god",stringHelper.reverse("dog"));
        });
    }
    @TestFactory
    @Disabled
    public String testReverseWithString(){
        return "Dynamic Test for reverse method";
    }
}
