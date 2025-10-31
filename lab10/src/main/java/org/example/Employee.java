package org.example;

public abstract class Employee {
    private String fio;
    private String position;
    private double oklad;


    protected Employee(String fio, String position, double oklad) throws OkladException {
        setOklad(oklad);
        this.fio = fio;
        this.position = position;
    }

    public String getFio() { return fio; }
    public void setFio(String fio) { this.fio = fio; }

    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }

    public double getOklad() { return oklad; }


    public void setOklad(double oklad) throws OkladException {
        if (oklad < 0) throw new OkladException(oklad);
        this.oklad = oklad;
    }


    public abstract double rasschitatZarplatu();
}
