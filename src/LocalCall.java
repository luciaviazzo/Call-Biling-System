import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class LocalCall extends Call{
        public LocalCall(int minutes, LocalDateTime dateTime) {
            super(minutes, dateTime);
        }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    @Override
    public double getCost() {
        DayOfWeek day = dateTime.getDayOfWeek();
        int hour = dateTime.getHour();

        boolean isWorkingDay = day != DayOfWeek.SATURDAY && day != DayOfWeek.SUNDAY;
        boolean isWorkingHour = hour >= 8 && hour < 20;

        double costPerMinute = isWorkingDay && isWorkingHour ? 0.20 : 0.10;
        
        return minutes * costPerMinute;
    }

    @Override
    public CallType getCallType() {
        return CallType.LOCAL;
    }
}