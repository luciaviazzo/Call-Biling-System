public class InternationalCall extends Call{
    private Country country;

    public InternationalCall(int minutes, CostStrategy costStrategy, Country country) {
        super(minutes, costStrategy);
        this.country = country;
    }

    public Country getCountry() {
        return country;
    }

    @Override
    public CallType getCallType() {
        return CallType.INTERNATIONAL;
    }
}
