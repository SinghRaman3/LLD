package Ola_LLD;

import java.util.HashMap;
import java.util.Map;

public class DriverMgr {
    static final DriverMgr driverMgrInstance = new DriverMgr();
    private Map<String, Driver> driversMap = new HashMap<>();

    private DriverMgr(){}

    static DriverMgr getDriverMgr(){
        return driverMgrInstance;
    }

    void addDriver(String driverName,Driver driver){
        driversMap.put(driverName, driver);
    }

    Driver getDriver(String driverName){
        return driversMap.get(driverName);
    }
}
