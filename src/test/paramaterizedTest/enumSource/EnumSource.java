package test.paramaterizedTest.enumSource;

import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;

public class EnumSource {
    @ParameterizedTest
    @org.junit.jupiter.params.provider.EnumSource(value = Animal.class)
    public void enumSourceTest(Animal animal) {
        assertNotNull(animal);
    }
    @ParameterizedTest
    @org.junit.jupiter.params.provider.EnumSource(value = Animal.class,names = {"Dog","Cat"})
    public void enumSourceWithNamesTest(Animal animal) {
        assertNotNull(animal);
    }
    @ParameterizedTest
    @org.junit.jupiter.params.provider.EnumSource(value = Animal.class,mode = org.junit.jupiter.params.provider.EnumSource.Mode.EXCLUDE,names = {"Dog","Cat"})
    public void enumSourceWithExcludeModeTest(Animal animal) {
        assertNotNull(animal);
    }
    @ParameterizedTest
    @org.junit.jupiter.params.provider.EnumSource(value = Animal.class,mode = org.junit.jupiter.params.provider.EnumSource.Mode.MATCH_ALL,names = "^(C|L).+$")
    public void enumSourceWithMatchAllModeTest(Animal animal) {
        assertNotNull(animal);
    }
}
