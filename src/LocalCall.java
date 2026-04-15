import java.time.LocalDateTime;

public class LocalCall extends Call{
    private LocalDateTime dateTime;

    public LocalCall(int minutes, CostStrategy costStrategy, LocalDateTime dateTime) {
        super(minutes, costStrategy);
        this.dateTime = dateTime;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    @Override
    public CallType getCallType() {
        return CallType.LOCAL;
    }
}