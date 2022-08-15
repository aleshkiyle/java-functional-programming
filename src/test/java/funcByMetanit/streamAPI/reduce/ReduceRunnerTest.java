package funcByMetanit.streamAPI.reduce;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

class ReduceRunnerTest {

    private static final Integer CONST_NUMBER = 21;

    @BeforeEach
    void setUp() {
    }

    @Test
    public void testAssertSumEqualConstNumber() {
        int sumNumbers = Stream.of(1, 2, 3, 4, 5, 6)
                        .reduce(0,
                                Integer::sum);
        Assertions.assertEquals(sumNumbers, CONST_NUMBER);
        Assertions.assertNotEquals(sumNumbers, CONST_NUMBER - 2);
    }
}