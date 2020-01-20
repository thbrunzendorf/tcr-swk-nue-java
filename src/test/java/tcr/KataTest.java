package tcr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {
    @Test
    public void initialScore() {
        Kata classUnderTest = new Kata();
        assertEquals("", classUnderTest.doSomething());
    }
}
