package tcr;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class KataTest {
    @Test
    public void initialScore() {
        Kata classUnderTest = new Kata();
        assertThat(classUnderTest.doSomething()).isEqualTo("");
    }
}
