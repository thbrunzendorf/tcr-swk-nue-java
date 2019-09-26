package tcr;

import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class KataTest {
    @Test public void testSomeMethod() {
        Kata classUnderTest = new Kata();
        assertEquals("love:love", classUnderTest.getScore());
    }

    @Ignore
    @Test public void testSomeMethod2() {
        Kata classUnderTest = new Kata();
        classUnderTest.pointForA();
        assertEquals("15:love", classUnderTest.getScore());
    }
}
