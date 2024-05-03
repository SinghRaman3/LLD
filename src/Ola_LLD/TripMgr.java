package Ola_LLD;

public class TripMgr {
    static final TripMgr tripMgrInstance = new TripMgr();
    RiderMgr riderMgr;
    DriverMgr driverMgr;


    private TripMgr(){}

    public static TripMgr getTripMgrInstance(){
        return tripMgrInstance;
    }

    public void CreateTrip(){}
}
