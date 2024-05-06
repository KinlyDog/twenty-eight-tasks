package tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static tasks.TheRabbitsFoot.*;

class TheRabbitsFootTest {

    @Test
    void testEncode() {
        String string = "отдай мою кроличью лапку";
        String stringEncode = "омоюу толл дюиа акчп йрьк";

        assertEquals(stringEncode, theRabbitsFoot(string, true));
    }

    @Test
    void testDecode() {
        String string = "омоюу толл дюиа акчп йрьк";
        String stringEncode = "отдаймоюкроличьюлапку";

        assertEquals(stringEncode, theRabbitsFoot(string, false));
    }
}
