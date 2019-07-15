package com.tws.refactoring;

public class Police {
    private final int ageLimit = 18;
    public boolean checkDriver(Driver driver) {
//        if(driver.getAge() >= ageLimit) {
//            return true;
//        }
//        else {
//            return false;
//        }
        return driver.getAge() >= ageLimit;
    }
}
