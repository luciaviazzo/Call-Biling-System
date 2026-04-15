import java.util.ArrayList;
import java.util.List;

public class Client {
    private String name;
    private double susbscription;
    private List<Call> calls;

    public Client(String name, double susbscription) {
        this.name = name;
        this.susbscription = susbscription;
        this.calls = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getSusbscription() {
        return susbscription;
    }

    public List<Call> getCalls() {
        return calls;
    }   

    public void addCall(Call call) {
        calls.add(call);
    }
}
