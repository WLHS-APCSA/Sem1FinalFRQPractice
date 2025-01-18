package Clock;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClockTest {

    @Test
    void testNext() {
        Clock testClock = new Clock(11,57);
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