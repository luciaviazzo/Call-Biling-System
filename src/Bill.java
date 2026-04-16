import java.util.List;
import java.util.stream.Collectors;

public class Bill {
    private Client client;
    private int month;
    private int year;

    public Bill(Client client, int month, int year) {
        this.client = client;
        this.month = month;
        this.year = year;
    }

    private List<Call> getCallsOfMonth() {
        return client.getCalls().stream()
                .filter(call -> call.getDateTime().getMonthValue() == month && call.getDateTime().getYear() == year)
                .collect(Collectors.toList());
    }

    public double totalAmount() {
        return localCost() + nationalAndInternationalCost() + client.getSusbscription();
    }

    public double localCost() {
        return getCallsOfMonth().stream()
                .filter(call -> call.getCallType() == CallType.LOCAL)
                .mapToDouble(Call::getCost)
                .sum();
    }

    public double nationalAndInternationalCost() {
        return getCallsOfMonth().stream()
                .filter(call -> call.getCallType() == CallType.NATIONAL || call.getCallType() == CallType.INTERNATIONAL)
                .mapToDouble(Call::getCost)
                .sum();
    }

    public void printBill() {
        System.out.println("Client: " + client.getName());
        System.out.println("Subscription Cost: " + client.getSusbscription());
        System.out.println("Local Calls Cost: " + localCost());
        System.out.println("National and International Calls Cost: " + nationalAndInternationalCost());
        System.out.println("Total Amount: " + totalAmount());
    }
}