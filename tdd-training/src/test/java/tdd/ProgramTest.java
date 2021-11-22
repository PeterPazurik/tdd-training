package tdd;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ProgramTest {
    @Test public void failingTest() {
    	assertTrue("failing test", false);
    }

    @Test public void passingTest() {
    	assertTrue(true);
    }
}
