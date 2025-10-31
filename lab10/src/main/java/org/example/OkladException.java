package org.example;

public class OkladException extends Exception {
    private final double badOklad;

    public OkladException(double badOklad) {
        super("отрицательный оклад: " + badOklad);
        this.badOklad = badOklad;
    }

    public double getBadOklad() { return badOklad; }
}
