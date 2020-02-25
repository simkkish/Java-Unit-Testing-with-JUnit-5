package test.conditional.os;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class OperatingSystemConditions {
    @Test
    @EnabledOnOs(value = {OS.WINDOWS,OS.MAC})
    public void enableOnWindowsAndMac(){
        System.out.println("Only execute on Windows and Mac !!!");
    }
    @Test
    @DisabledOnOs(value = {OS.WINDOWS})
    public void disableOnWindow(){
        System.out.println("Only disable on Windows!!!");
    }
}
