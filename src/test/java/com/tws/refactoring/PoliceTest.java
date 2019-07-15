package com.tws.refactoring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PoliceTest {

    @Test
    public void should_return_true_when_driver_age_bigger_18(){
        //GIVEN
        Driver driver = new Driver(19);
        Police police = new Police();
        //WHEN
        boolean b = police.checkDriver(driver);
        //THEN
        Assertions.assertTrue(b);
    }
}
