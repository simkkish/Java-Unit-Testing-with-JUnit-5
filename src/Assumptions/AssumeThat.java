package Assumptions;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

public class AssumeThat {
    @Test
    public void assumeThatWithBooleanCondition() {
        assumingThat("DEV".equals(System.getProperty("ENV")), () -> {
            System.out.println("Dev environment !!!");
            assertEquals(5, 3 + 2);
        });
        // below code gets executed in every environment
        System.out.println("Executed in Every environment !!!");
        assertEquals(3, 2 + 1);
    }

    @Test
    public void assumeThatWithBooleanSupplier() {
        assumingThat(()->"DEV".equals(System.getProperty("ENV")), () -> {
            System.out.println("Dev environment !!!");
            assertEquals(5, 3 + 2);
        });
        // below code gets executed in every environment
        System.out.println("Executed in Every environment !!!");
        assertEquals(3, 2 + 1);
    }

}
