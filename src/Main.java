import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        
        Call local1 = new LocalCall(10, LocalDateTime.of(2026, 4, 15, 10, 0));
        Call local2 = new LocalCall(5, LocalDateTime.of(2026, 4, 18, 22, 0));
        Call national1 = new NationalCall(8, LocalDateTime.of(2026, 4, 10, 14, 0), 0.5);
        Call national2 = new NationalCall(12, LocalDateTime.of(2026, 4, 12, 16, 0), 0.3);
        Call international1 = new InternationalCall(3, LocalDateTime.of(2026, 4, 8, 18, 0), 2.0);
        Call international2 = new InternationalCall(7, LocalDateTime.of(2026, 4, 20, 11, 0), 1.5);

        Client client = new Client("Lucia", 50.0);
        client.addCall(local1);
        client.addCall(local2);
        client.addCall(national1);
        client.addCall(national2);
        client.addCall(international1);
        client.addCall(international2);

        Bill bill = new Bill(client, 4, 2026);
        bill.printBill();
    }
}