public class InternationalStrategy implements CostStrategy {
    
    @Override
    public double calculateCost(Call call) {
        InternationalCall c = (InternationalCall) call;

        return call.getMinutes() * c.getCountry().costPerMinute();
    }
}