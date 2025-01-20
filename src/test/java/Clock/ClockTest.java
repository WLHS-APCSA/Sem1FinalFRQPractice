package Clock;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClockTest {
    ClockKey testClock = new ClockKey(11,57);
    //uncomment when ready
    //Clock testClock = new Clock(11,57);
    @Test
    void testNext() {

        testClock.next();
        assertEquals("The time is 11:58", testClock.toString());
        testClock.setTime(11,59);
        testClock.next();
        assertEquals("The time is 12:00", testClock.toString());
        testClock.setTime(12,59);
        testClock.next();
        assertEquals("The time is 1:00", testClock.toString());

    }
}