package com.champlain.oop2a1;

import java.time.LocalDate;

public class Person {
    private String aName;
    private LocalDate aDOB;
    private String aEmailAddress;
    private boolean aPurchasedParkingPass;

    public Person(String pName, LocalDate pDOB, String pEmailAddress) {
        aName = pName;
        aDOB = pDOB;
        aEmailAddress = pEmailAddress;
        aPurchasedParkingPass = false;
    }

    public String getName() {
        return aName;
    }

    public LocalDate getDOB() {
        return aDOB;
    }

    public String getEmailAddress() {
        return aEmailAddress;
    }

    public boolean isPurchasedParkingPass() {
        return aPurchasedParkingPass;
    }

    public boolean purchaseParkingPass() {
        if (aPurchasedParkingPass) {
            return false;
        }
        aPurchasedParkingPass = true;
        return true;
    }
}
