package org.example;

public class StaffEmployee extends Employee {
    private double premiya;

    public StaffEmployee(String fio, String position, double oklad, double premiya) throws OkladException {
        super(fio, position, oklad);
        this.premiya = premiya;
    }

    public double getPremiya() { return premiya; }
    public void setPremiya(double premiya) { this.premiya = premiya; }

  
    @Override
    public double rasschitatZarplatu() {
        try {
            if (premiya < 0) {
                throw new PremiyaException(premiya);
            }
            return getOklad() + premiya;
        } catch (PremiyaException ex) {
            System.out.println("Ошибка премии: " + ex.getMessage());
            return getOklad();
        } catch (Exception ex) {
            System.out.println("Ошибка при расчёте зарплаты (штатный): " + ex.getMessage());
            return 0.0;
        }
    }
}
