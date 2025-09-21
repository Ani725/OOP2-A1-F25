package com.champlain.oop2a1;

import java.time.LocalDate;

public class Person {
    private final String aName;
    private final LocalDate aDOB;
    private final String aEmailAddress;
    private boolean aPurchasedParkingPass;

   public Person(String pName, LocalDate pDOB, String pEmailAddress) {
        if (pName == null || pName.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        if (pDOB == null || pDOB.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Date of birth is invalid");
        }
        if (pEmailAddress == null || !pEmailAddress.contains("@")) {
            throw new IllegalArgumentException("Email is invalid");
        }
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
