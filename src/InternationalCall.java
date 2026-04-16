import java.time.LocalDateTime;

public class InternationalCall extends Call{
    private double country; //Using double to represent the cost per minute for the country for simplicity.

    public InternationalCall(int minutes, LocalDateTime dateTime, double country) {
        super(minutes, dateTime);
        this.country = country;
    }

    public double getCountry() {
        return country;
    }

    @Override
    public double getCost() {
        return minutes * country; 
    }

    @Override
    public CallType getCallType() {
        return CallType.INTERNATIONAL;
    }
}