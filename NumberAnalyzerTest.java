import static org.junit.Assert.*;
import org.junit.Test;

public class NumberAnalyzerTest {

    @Test
    public void testPrime() {
        assertTrue(NumberAnalyzer.isPrime(7));
    }

    @Test
    public void testNotPrime() {
        assertFalse(NumberAnalyzer.isPrime(4));
    }

    @Test
    public void testLessThan2() {
        assertFalse(NumberAnalyzer.isPrime(1));
    }

    @Test
    public void testCount() {
        assertEquals(4, NumberAnalyzer.countPrimes(10));
    }
}