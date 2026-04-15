public class Bill {
    private Client client;

    public Bill(Client client) {
        this.client = client;
    }

    public double localCost() {
        return client.getCalls().stream()
                .filter(call -> call.getCallType() == CallType.LOCAL)
                .mapToDouble(Call::getCost)
                .sum();
    }

    public double notLocalCost() {
        return client.getCalls().stream()
                .filter(call -> call.getCallType() != CallType.LOCAL)
                .mapToDouble(Call::getCost)
                .sum();
    }

    public double totalAmount() {
        return localCost() + notLocalCost() + client.getPass();
    }

    public void printBill() {
        System.out.println("Client: " + client.getName());
        System.out.println("Pass Cost: " + client.getPass());
        System.out.println("Local Calls Cost: " + localCost());
        System.out.println("Not Local Calls Cost: " + notLocalCost());
        System.out.println("Total Amount: " + totalAmount());
    }
}
