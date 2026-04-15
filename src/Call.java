public abstract class Call {
    protected int minutes;
    protected CostStrategy costStrategy;

    public Call(int minutes, CostStrategy costStrategy) {
        this.minutes = minutes;
        this.costStrategy = costStrategy;
    }

    public int getMinutes() {
        return minutes;
    }

    public double getCost() {
        return costStrategy.calculateCost(this);
    }

    public abstract CallType getCallType();
}
