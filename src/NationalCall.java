public class NationalCall extends Call{
    private Locality locality;
    
    public NationalCall(int minutes, CostStrategy costStrategy, Locality locality) {
        super(minutes, costStrategy);
        this.locality = locality;
    }

    public Locality getLocality() {
        return locality;
    }

    @Override
    public CallType getCallType() {
        return CallType.NATIONAL;
    }
}