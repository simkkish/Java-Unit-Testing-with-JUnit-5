package test.conditional.os;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

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
