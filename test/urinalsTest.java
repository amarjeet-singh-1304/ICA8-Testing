import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class urinalsTest {

    @Test
    @DisplayName("====== Amarjeet Singh == Test goodString Method(Empty String) =======")
    void checkEmptyString() {
        boolean check = urinals.goodString(" ");
        assertFalse(check);
    }
    @Test
    @DisplayName("====== Amarjeet Singh == Test goodString Method(Good String) =======")
    void checkGoodString() {
        boolean check1 = urinals.goodString("01010");
        assertTrue(check1);
    }

    @Test
    @DisplayName("====== Amarjeet Singh == Test goodString Method(Bad String) =======")
    void checkBadString() {
        boolean check1 = urinals.goodString("01011");
        assertFalse(check1);
    }

    @Test
    @DisplayName("====== Amarjeet Singh == Test goodString Method(String Length >20) =======")
    void checkStringLength() {
        boolean check1 = urinals.goodString("0101010101010101010101");
        assertFalse(check1);
    }




}