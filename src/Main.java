import java.time.LocalDateTime;

// Example implementations of Locality and Country interfaces
class City implements Locality {
    private double cost;
    public City(double cost) { this.cost = cost; }
    public double costPerMinute() { return cost; }
}

class Nation implements Country {
    private double cost;
    public Nation(double cost) { this.cost = cost; }
    public double costPerMinute() { return cost; }
}

public class Main {
    public static void main(String[] args) {
        
        CostStrategy localStrategy = new LocalStrategy();
        CostStrategy nationalStrategy = new NationalStrategy();
        CostStrategy internationalStrategy = new InternationalStrategy();

        Locality buenosAires = new City(0.5);
        Locality cordoba = new City(0.3);
        Country usa = new Nation(2.0);
        Country spain = new Nation(1.5);

        Call local1 = new LocalCall(10, localStrategy, LocalDateTime.of(2026, 4, 15, 10, 0)); 
        Call local2 = new LocalCall(5, localStrategy, LocalDateTime.of(2026, 4, 18, 22, 0)); 
        Call national1 = new NationalCall(8, nationalStrategy, buenosAires);
        Call national2 = new NationalCall(12, nationalStrategy, cordoba);
        Call international1 = new InternationalCall(3, internationalStrategy, usa);
        Call international2 = new InternationalCall(7, internationalStrategy, spain);

        Client client = new Client("Lucia", 50.0);
        client.addCall(local1);
        client.addCall(local2);
        client.addCall(national1);
        client.addCall(national2);
        client.addCall(international1);
        client.addCall(international2);
        
        Bill bill = new Bill(client);
        bill.printBill();
    }
}
