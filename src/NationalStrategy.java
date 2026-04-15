public class NationalStrategy implements CostStrategy {
    
    @Override
    public double calculateCost(Call call) {
        NationalCall c = (NationalCall) call;

        return call.getMinutes() * c.getLocality().costPerMinute();
    }
}
