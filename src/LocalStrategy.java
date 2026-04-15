import java.time.DayOfWeek;

public class LocalStrategy implements CostStrategy {
    
    @Override
    public double calculateCost(Call call) {
        LocalCall c = (LocalCall) call;

        DayOfWeek day = c.getDateTime().getDayOfWeek();
        int hour = c.getDateTime().getHour();

        boolean isWorkingDay = day != DayOfWeek.SATURDAY && day != DayOfWeek.SUNDAY;
        boolean isWorkingHour = hour >= 8 && hour < 20;

        double costPerMinute = isWorkingDay && isWorkingHour ? 0.20 : 0.10;
        
        return c.getMinutes() * costPerMinute;
    }
}