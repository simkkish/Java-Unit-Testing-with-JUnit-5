package DisplayName;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Display Name annotation demo")

public class displayName {
    @Test
    @DisplayName("DisplayName demo test")
    @Disabled
    public void displayNameTest(){
        assertEquals(false,true);
    }
}
