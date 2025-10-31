package org.example;

public class PremiyaException extends Exception {
    private final double badPremiya;

    public PremiyaException(double badPremiya) {
        super("премия не может быть отрицательной: " + badPremiya);
        this.badPremiya = badPremiya;
    }

    public double getBadPremiya() { return badPremiya; }
}
