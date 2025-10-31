package org.example;

public class ContractEmployee extends Employee {

    public ContractEmployee(String fio, String position, double oklad) throws OkladException {
        super(fio, position, oklad);
    }


    @Override
    public double rasschitatZarplatu() {
        try {

            return getOklad();
        } catch (Exception ex) {
            System.out.println("Ошибка при расчёте зарплаты (контракт): " + ex.getMessage());
            return 0.0;
        }
    }
}
