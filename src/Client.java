import java.util.ArrayList;
import java.util.List;

public class Client {
    private String name;
    private double suscription;
    private List<Call> calls;

    public Client(String name, double suscription) {
        this.name = name;
        this.suscription = suscription;
        this.calls = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getSuscription() {
        return suscription;
    }

    public List<Call> getCalls() {
        return calls;
    }   

    public void addCall(Call call) {
        calls.add(call);
    }
    // las llamadas van aca
}
