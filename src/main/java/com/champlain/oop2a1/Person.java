package com.champlain.oop2a1;

import java.time.LocalDate;

/**
 * Represents a person with a name, date of birth, email address, and parking pass.
 * Immutable except for the parking pass status.
 */
public class Person {
    private final String aName;
    private final LocalDate aDOB;
    private final String aEmailAddress;
    private boolean aPurchasedParkingPass;

    /**
     * Constructs a new Person with validated input values.
     *
     * @param pName the person's name (not null)
     * @param pDOB the person's date of birth (not null, not in the future)
     * @param pEmailAddress the person's email (must contain "@")
     */
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

    /**
     * @return the person's name
     */
    public String getName() {
        return aName;
    }

    /**
     * @return the person's date of birth
     */
    public LocalDate getDOB() {
        return aDOB;
    }

    /**
     * @return the person's email address
     */
    public String getEmailAddress() {
        return aEmailAddress;
    }

    /**
     * @return true if the person has purchased a parking pass
     */
    public boolean isPurchasedParkingPass() {
        return aPurchasedParkingPass;
    }

    /**
     * Purchases a parking pass if not already owned
     * @return true if purchased successfully, false if already owned
     */
    public boolean purchaseParkingPass() {
        if (aPurchasedParkingPass) {
            return false;
        }
        aPurchasedParkingPass = true;
        return true;
    }

    @Override
    public String toString() {
        return aName + ", Parking Pass: " + (aPurchasedParkingPass? "Yes" : "No");
    }
}
