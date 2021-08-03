package IntList;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SquarePrimesTest {

    /**
     * Here is a test for isPrime method. Try running it.
     * It passes, but the starter code implementation of isPrime
     * is broken. Write your own JUnit Test to try to uncover the bug!
     */
    @Test
    public void testSquarePrimesSimple() {
        IntList lst = IntList.of(14, 15, 16, 17, 18);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("14 -> 15 -> 16 -> 289 -> 18", lst.toString());
        assertTrue(changed);
    }

    @Test
    public void testSquarePrimes2() {
        IntList lst = IntList.of(14, 15, 16, 3, 18);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("14 -> 15 -> 16 -> 9 -> 18", lst.toString());
        assertTrue(changed);
    }

    @Test
    public void testSquarePrimes3() {
        IntList lst = IntList.of(11, 14, 15, 16, 11, 18);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("121 -> 14 -> 15 -> 16 -> 121 -> 18", lst.toString()); // appears to only square the prime number once, even if it's in the list more than once
        assertTrue(changed);
    }

    @Test
    public void testSquarePrimes4() {
        IntList lst = IntList.of(11, 11, 11, 11, 11, 11);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("121 -> 121 -> 121 -> 121 -> 121 -> 121", lst.toString()); // appears to only square the prime number once, even if it's in the list more than once
        assertTrue(changed);
    }
}
