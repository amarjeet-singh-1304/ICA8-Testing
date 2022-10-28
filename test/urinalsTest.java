import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class urinalsTest {

    @Test
    @DisplayName("====== Amarjeet Singh == Test goodString Method =======")
    void checkString() {
        System.out.println("Checking Empty String Test Case");
        boolean check = urinals.goodString("");
        assertFalse(check);
        System.out.println("Empty String Test Case Passed");
        System.out.println("Checking Good String Test Case");
        boolean check1 = urinals.goodString("01010");
        assertTrue(check1);
        System.out.println("Good String Test Case Passed");
    }


}