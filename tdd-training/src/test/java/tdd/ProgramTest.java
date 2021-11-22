package tdd;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class ProgramTest {
    @Test public void failingTest() {
    	assertTrue("failing test", false);
    }

    @Test public void failingTest2() {
    	assertEquals(1, 2	, "failing test 2");
    }
    
    @Test public void passingTest() {
    	assertTrue(true);
    }

}
