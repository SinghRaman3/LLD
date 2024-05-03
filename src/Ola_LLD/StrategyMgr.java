package Ola_LLD;

public class StrategyMgr {
    static final StrategyMgr strategyMgrInstance = new StrategyMgr();

    private StrategyMgr() {}
    public static StrategyMgr getInstance() {
        return strategyMgrInstance;
    }

//    public PricingStrategy determinePricingStrategy(Trip tripData){}
//
//    public DriverMatchingStrategy determineDriverMatchingStrategy(Trip tripData){}
//
}
