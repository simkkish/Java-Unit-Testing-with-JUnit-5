package Assumptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

public class AssumeTrue {

    @Test
    public void assumeTrueWithNoMessage(){
        assumeTrue("DEV".equals(System.getProperty("ENV")));

        System.out.println("Assumption passed !!!");
        assertEquals(3,2+1);
    }

    @Test
    public void assumeTrueWithMessage(){
        assumeTrue("DEV".equals(System.getProperty("ENV")),"Assumption Failed !!!");

        System.out.println("Assumption passed !!!");
        assertEquals(3,2+1);
    }

    @Test
    public void assumeTrueWithMessageSupplier(){
        assumeTrue("DEV".equals(System.getProperty("ENV")),()->"Assumption Failed !!!");

        System.out.println("Assumption passed !!!");
        assertEquals(3,2+1);
    }
}
