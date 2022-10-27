import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class urinalsTest {

    @Test
    @DisplayName("====== Amarjeet Singh == Test Good String Method =======")
    void checkEmptyString() {
        boolean check = urinals.goodString("   ");
        assertFalse(check);
    }


}