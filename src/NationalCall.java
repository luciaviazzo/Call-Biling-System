import java.time.LocalDateTime;

public class NationalCall extends Call{
    private double locality; //Using double to represent the cost per minute for the locality for simplicity.
    
    public NationalCall(int minutes, LocalDateTime dateTime, double locality) {
        super(minutes, dateTime);
        this.locality = locality;
    }

    public double getLocality() {
        return locality;
    }

    @Override
    public double getCost() {
        return minutes * locality;
    }

    @Override
    public CallType getCallType() {
        return CallType.NATIONAL;
    }
}