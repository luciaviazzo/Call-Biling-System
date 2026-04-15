import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NationalCallTest {

    @Test
    void testNationalCallCost() {
        NationalCall call = new NationalCall(10, LocalDateTime.of(2026, 4, 15, 10, 0), 0.50);
        assertEquals(5.0, call.getCost(), 0.001);
    }

    @Test
    void testNationalCallType() {
        NationalCall call = new NationalCall(10, LocalDateTime.of(2026, 4, 15, 10, 0), 0.50);
        assertEquals(CallType.NATIONAL, call.getCallType());
    }
}
