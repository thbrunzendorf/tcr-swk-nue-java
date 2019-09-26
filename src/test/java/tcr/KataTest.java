package tcr;

import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class KataTest {
    @Test public void initialScore() {
        Kata classUnderTest = new Kata();
        assertEquals("love:love", classUnderTest.getScore());
    }

    @Test public void firstPointForA() {
        Kata classUnderTest = new Kata();
        classUnderTest.pointForA();
        assertEquals("15:love", classUnderTest.getScore());
    }

    @Test public void secondPointForA() {
        Kata classUnderTest = new Kata();
        classUnderTest.pointForA();
        classUnderTest.pointForA();
        assertEquals("30:love", classUnderTest.getScore());
    }
}
