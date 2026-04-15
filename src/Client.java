import java.util.ArrayList;
import java.util.List;

public class Client {
    private String name;
    private double pass;
    private List<Call> calls;

    public Client(String name, double pass) {
        this.name = name;
        this.pass = pass;
        this.calls = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getPass() {
        return pass;
    }

    public List<Call> getCalls() {
        return calls;
    }   

    public void addCall(Call call) {
        calls.add(call);
    }
}
