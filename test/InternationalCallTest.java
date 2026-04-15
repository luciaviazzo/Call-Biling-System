import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InternationalCallTest {

    @Test
    void testInternationalCallCost() {
        InternationalCall call = new InternationalCall(10, LocalDateTime.of(2026, 4, 15, 10, 0), 1.50);
        assertEquals(15.0, call.getCost(), 0.001);
    }

        @Test
    void testInternationalCallType() {
        InternationalCall call = new InternationalCall(10, LocalDateTime.of(2026, 4, 15, 10, 0), 1.50);
        assertEquals(CallType.INTERNATIONAL, call.getCallType());
    }
}
