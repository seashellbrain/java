package org.example;

public class Main {

    public static void main(String[] args) {

        Firm firm = new Firm("ООО «Ромашка»");
        Department it = new Department("ИТ-отдел");
        firm.addDepartment(it);

        // 1) Нормальные сотрудники
        try {
            Employee e1 = new StaffEmployee("Иванов Иван", "Разработчик", 120_000, 15_000);
            Employee e2 = new ContractEmployee("Петров Пётр", "Тестировщик", 95_000);
            it.addEmployee(e1);
            it.addEmployee(e2);
        } catch (OkladException ex) {
            // сюда не попадём — оклады положительные
            System.err.println("main: повторно поймали OkladException: " + ex.getMessage());
        }


        System.out.println("\n=== Демонстрация PremiyaException в расчёте зарплаты штатного сотрудника ===");
        Employee badBonus = null;
        try {
            badBonus = new StaffEmployee("Сидорова Анна", "Аналитик", 150_000, -5_000);
            it.addEmployee(badBonus);
        } catch (OkladException ex) {
            // конструктор штатника кидает только OkladException при отриц. окладе — оклад нормальный
            System.err.println("main: непредвиденный OkladException: " + ex.getMessage());
        }

        if (badBonus != null) {
            double s = badBonus.rasschitatZarplatu();
            System.err.printf("Итог по расчёту (после обработки исключения внутри метода): %.2f%n", s);
        }

        // 3) Демонстрация OkladException (б): отрицательный оклад в конструкторе
        System.out.println("\n=== Демонстрация OkladException из конструктора ===");
        try {

            createStaffWithOklad("Кузнецов Олег", "Админ", -1000, 3000);
        } catch (OkladException ex) {

            System.err.println("main: повторно поймали OkladException: " + ex.getMessage());
        }

        // 4) Печать базы
        System.out.println("\n=== Справка по фирме и отделу ===");
        System.out.println("Фирма: " + firm.getName());
        for (Department d : firm.getDepartments()) {
            System.out.printf("Отдел: %s, сотрудников: %d%n", d.getName(), d.getEmployeeCount());
            for (Employee e : d.getEmployees()) {
                System.out.printf(" - %s (%s). Зарплата по расчёту: %.2f%n",
                        e.getFio(), e.getPosition(), e.rasschitatZarplatu());
            }
        }
    }

    private static Employee createStaffWithOklad(String fio, String position, double oklad, double premiya)
            throws OkladException {
        try {
            return new StaffEmployee(fio, position, oklad, premiya);
        } catch (OkladException ex) {
            System.err.println("Невозможно создать сотрудника – указан отрицательный оклад: " + ex.getBadOklad());
            throw ex;
        }
    }
}
