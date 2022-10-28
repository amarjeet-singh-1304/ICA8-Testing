import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.net.URL;

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
    @DisplayName("====== Amarjeet Singh == Test countUrinals(Normal Case) =======")
    void countUrinals()
    {
        int count = Urinals.countUrinals("10001");
        assertEquals(1, count);

    }
    @Test
    @DisplayName("====== Amarjeet Singh == Test countUrinals(New Test Case) =======")
    void countUrinals1()
    {
        int count = Urinals.countUrinals("00000");
        assertEquals(3, count);
    }

    @Test
    @DisplayName("====== Amarjeet Singh == Test Case for File Exists =======")
    void fileNotFound()  {
        ClassLoader classLoader = this.getClass().getClassLoader();
        URL fileURL = classLoader.getResource("urinal.dat");
        assert fileURL != null;
        File file = new File(fileURL.getFile());
        assertTrue(file.exists());
    }









}