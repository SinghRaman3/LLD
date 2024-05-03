package Ola_LLD;

import java.util.HashMap;
import java.util.Map;

public class TripMgr {
    static final TripMgr tripMgrInstance = new TripMgr();
    RiderMgr riderMgr;
    DriverMgr driverMgr;

    Map<Integer, Trip> tripInfo = new HashMap<Integer, Trip>();


    private TripMgr(){}

    public static TripMgr getTripMgrInstance(){
        return tripMgrInstance;
    }

    public void CreateTrip(){}

    public Map<Integer, Trip> getTripMap(){
        return tripInfo;
    }
}
