import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BillTest {

    @Test
    void testMonthlyBillingOnlyCountsCurrentMonth() {
        Client client = new Client("Test", 10.0);
        Call callApril = new LocalCall(10, LocalDateTime.of(2026, 4, 10, 10, 0));
        Call callMarch = new LocalCall(10, LocalDateTime.of(2026, 3, 10, 10, 0));
        client.addCall(callApril);
        client.addCall(callMarch);
        Bill bill = new Bill(client, 4, 2026);
        double expected = 10.0 + (10 * 0.20);
        assertEquals(expected, bill.totalAmount(), 0.001);
    }

    @Test
    void testLocalAndNotLocalCosts() {
        Client client = new Client("Lucia", 50.0);
        Call local = new LocalCall(5, LocalDateTime.of(2026, 4, 15, 9, 0));
        Call national = new NationalCall(10, LocalDateTime.of(2026, 4, 15, 12, 0), 0.5);
        Call international = new InternationalCall(3, LocalDateTime.of(2026, 4, 15, 18, 0), 2.0);   
        
        client.addCall(local);
        client.addCall(national);
        client.addCall(international);
        Bill bill = new Bill(client, 4, 2026);
        
        assertEquals(1.0, bill.localCost(), 0.001);
        assertEquals(11.0, bill.nationalAndInternationalCost(), 0.001);
        assertEquals(62.0, bill.totalAmount(), 0.001);
    }
}
