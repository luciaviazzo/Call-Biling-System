import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LocalCallTest {

    @Test
    void testLocalCallWorkingDayWorkingHour() {
        // Monday 10 am
        LocalCall call = new LocalCall(10, LocalDateTime.of(2026, 4, 13, 10, 0));
        assertEquals(2.0, call.getCost(), 0.001);
    }

    @Test
    void testLocalCallWorkingDayNonWorkingHour() {
        // Tuesday 9 pm 
        LocalCall call = new LocalCall(10, LocalDateTime.of(2026, 4, 14, 21, 0));
        assertEquals(1.0, call.getCost(), 0.001);
    }

    @Test
    void testLocalNotWorkingDayWorkingHour() {
        // Saturday 3 pm 
        LocalCall call = new LocalCall(10, LocalDateTime.of(2026, 4, 18, 15, 0));
        assertEquals(1.0, call.getCost(), 0.001);
    }

    @Test
    void testLocalCallNonWorkingDayNonWorkingHour() {
        // Sunday 7:00 am
        LocalCall call = new LocalCall(10, LocalDateTime.of(2026, 4, 19, 7, 0));
        assertEquals(1.0, call.getCost(), 0.001);
    }

    @Test
    void testLocalCallEdgeStartWorkingHour() {
        // Monday 8:00 am (start of working hour) -> 0.20/min
        LocalCall call = new LocalCall(5, LocalDateTime.of(2026, 4, 13, 8, 0));
        assertEquals(1.0, call.getCost(), 0.001);
    }

    @Test
    void testLocalCallEdgeEndWorkingHour() {
        // Monday 8:00 pm 
        LocalCall call = new LocalCall(5, LocalDateTime.of(2026, 4, 13, 20, 0));
        assertEquals(0.5, call.getCost(), 0.001);
    }

    @Test
    void testLocalCallType() {
        LocalCall call = new LocalCall(10, LocalDateTime.of(2026, 4, 15, 10, 0));
        assertEquals(CallType.LOCAL, call.getCallType());
    }
}