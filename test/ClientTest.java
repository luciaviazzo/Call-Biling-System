import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ClientTest {

    @Test
    void testClientNameAndSubscription() {
        Client client = new Client("Lucia", 50.0);
        assertEquals("Lucia", client.getName());
        assertEquals(50.0, client.getSusbscription(), 0.001);
    }

    @Test
    void testAddCallAndGetCalls() {
        Client client = new Client("Lucia", 50.0);
        Call call = new LocalCall(10, LocalDateTime.of(2026, 4, 15, 10, 0));
        client.addCall(call);
        assertEquals(1, client.getCalls().size());
        assertEquals(call, client.getCalls().get(0));
    }

    @Test
    void testClientHasNoCalls() {
        Client client = new Client("Lucia", 50.0);
        assertTrue(client.getCalls().isEmpty());
    }
}