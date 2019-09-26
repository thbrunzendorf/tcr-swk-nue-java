package tcr;

import org.junit.Test;
import static org.junit.Assert.*;

public class KataTest {
    @Test public void testSomeMethod() {
        Kata classUnderTest = new Kata();
        assertEquals("15:30", classUnderTest.getScore());
    }
}
