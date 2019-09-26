package tcr;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KataTest {
    @Test
    public void initialScore() {
        Kata classUnderTest = new Kata();
        assertEquals("", classUnderTest.doSomething());
    }
}
