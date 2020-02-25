package test.dynamicTest;

import example.StringHelper;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.*;
import java.util.stream.Stream;

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
        return "dynamic Test ";
    }
    @TestFactory
    public Collection<DynamicTest> dynamicTestsFromCollection(){
        List<String> inputList=createInputList();
        List<String> outputList=createOutputList();

        Collection<DynamicTest> dynamicTests=new ArrayList<>();

        for(int i=0;i<inputList.size();i++){
            String input=inputList.get(i);
            String output=outputList.get(i);
            DynamicTest dynamicTest=DynamicTest.dynamicTest("Dynamic Test for reverse() : input - "+input,()->{
                assertEquals(output,stringHelper.reverse(input));
            });
            dynamicTests.add(dynamicTest);
        }

        return dynamicTests;
    }

    private List<String> createOutputList() {
        return Arrays.asList("ecar","mom","dad");
    }

    private List<String> createInputList() {
        return Arrays.asList("race","mom","dad");
    }
    @TestFactory
    public Iterable<DynamicTest> dynamicTestsFromIterable(){
        List<String> inputList=createInputList();
        List<String> outputList=createOutputList();

        Collection<DynamicTest> dynamicTests=new ArrayList<>();

        for(int i=0;i<inputList.size();i++){
            String input=inputList.get(i);
            String output=outputList.get(i);
            DynamicTest dynamicTest=DynamicTest.dynamicTest("Dynamic Test for reverse() : input - "+input,()->{
                assertEquals(output,stringHelper.reverse(input));
            });
            dynamicTests.add(dynamicTest);
        }

        return dynamicTests;
    }
    @TestFactory
    public Iterator<DynamicTest> dynamicTestsFromIterator(){
        List<String> inputList=createInputList();
        List<String> outputList=createOutputList();

        Collection<DynamicTest> dynamicTests=new ArrayList<>();

        for(int i=0;i<inputList.size();i++){
            String input=inputList.get(i);
            String output=outputList.get(i);
            DynamicTest dynamicTest=DynamicTest.dynamicTest("Dynamic Test for reverse() : input - "+input,()->{
                assertEquals(output,stringHelper.reverse(input));
            });
            dynamicTests.add(dynamicTest);
        }

        return dynamicTests.iterator();
    }
    @TestFactory
    public Stream<DynamicTest> dynamicTestsFromStreams(){
        List<String> inputList=createInputList();
        List<String> outputList=createOutputList();

        Collection<DynamicTest> dynamicTests=new ArrayList<>();

        for(int i=0;i<inputList.size();i++){
            String input=inputList.get(i);
            String output=outputList.get(i);
            DynamicTest dynamicTest=DynamicTest.dynamicTest("Dynamic Test for reverse() : input - "+input,()->{
                assertEquals(output,stringHelper.reverse(input));
            });
            dynamicTests.add(dynamicTest);
        }

        return dynamicTests.stream();
    }
    @TestFactory
    public DynamicTest[] dynamicTestsFromArray(){
        List<String> inputList=createInputList();
        List<String> outputList=createOutputList();

        Collection<DynamicTest> dynamicTests=new ArrayList<>();

        for(int i=0;i<inputList.size();i++){
            String input=inputList.get(i);
            String output=outputList.get(i);
            DynamicTest dynamicTest=DynamicTest.dynamicTest("Dynamic Test for reverse() : input - "+input,()->{
                assertEquals(output,stringHelper.reverse(input));
            });
            dynamicTests.add(dynamicTest);
        }

        return dynamicTests.toArray(new DynamicTest[dynamicTests.size()]);
    }
}
