package Ola_LLD;

//Singleton issue is still present

import java.util.HashMap;
import java.util.Map;

public class RiderMgr {
    static final RiderMgr riderMgrInstance = new RiderMgr();
    private Map<String, Rider> ridersMap = new HashMap<String, Rider>();

    private RiderMgr(){}

    public static RiderMgr getRiderMgr(){
        return riderMgrInstance;
    }

    void addRider(String RiderName,Rider rider){
        ridersMap.put(RiderName, rider);
    }

    Rider getRider(String RiderName){
        return ridersMap.get(RiderName);
    }

}
