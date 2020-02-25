package test.conditional.jre;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class JavaRuntimeEnvironmentConditions {
    @Test
    @EnabledOnJre({JRE.JAVA_11,JRE.JAVA_8})
    public void enableOnJava9() {
        System.out.println("Enable on JRE 11 !!!");
    }
    @Test
    @DisabledOnJre(JRE.JAVA_11)
    public void disableOnJava9() {
        System.out.println("Disable on JRE 11 !!!");
    }
}
