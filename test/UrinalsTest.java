import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UrinalsTest {

    @Test
    @DisplayName("====== Amarjeet Singh == Test goodString Method(Empty String) =======")
    void checkEmptyString() {
        boolean check = Urinals.goodString(" ");
        assertFalse(check);
    }
    @Test
    @DisplayName("====== Amarjeet Singh == Test goodString Method(Good String) =======")
    void checkGoodString() {
        boolean check1 = Urinals.goodString("01010");
        assertTrue(check1);
    }

    @Test
    @DisplayName("====== Amarjeet Singh == Test goodString Method(Bad String) =======")
    void checkBadString() {
        boolean check1 = Urinals.goodString("0101100");
        assertFalse(check1);
    }

    @Test
    @DisplayName("====== Amarjeet Singh == Test goodString Method(String Length >20) =======")
    void checkStringLength() {
        boolean check1 = Urinals.goodString("0101010101010101010101");
        assertFalse(check1);
    }

    @Test
    @DisplayName("====== Amarjeet Singh == Test countUrinals =======")
    void countUrinals()
    {
        int count = Urinals.countUrinals("10001");
        assertEquals(1, count);

    }



}