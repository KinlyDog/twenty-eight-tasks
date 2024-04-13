package tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static tasks.ShopOLAP.*;

class ShopOLAPTest {

    @Test
    void defaultTest() {
        String[] strings = {
                "платье1 5",
                "сумка32 2",
                "платье1 1",
                "сумка23 2",
                "сумка128 4"
        };

        int len = strings.length;

        String[] result = shopOLAP(len, strings);

        String[] stringsGood = {
                "платье1 6",
                "сумка128 4",
                "сумка23 2",
                "сумка32 2"
        };

        assertArrayEquals(result, stringsGood);
    }
}