import java.time.LocalDateTime;

public abstract class Call {
    protected int minutes;
    protected LocalDateTime dateTime;

    public Call(int minutes, LocalDateTime dateTime) {
        this.minutes = minutes;
        this.dateTime = dateTime;
    }

    public int getMinutes() {
        return minutes;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public abstract double getCost();

    public abstract CallType getCallType();
}