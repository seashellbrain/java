package org.example;

public class Squirrel {
    // поля с разными модификаторами доступа
    public String name;         // публичное поле
    private int age;            // приватное поле
    protected double weight;    // защищённое поле
    int nuts;                   // пакетный доступ (default)

    // Конструктор по умолчанию
    public Squirrel() {
        this("Безымянная", 0, 0.3);
    }

    // Конструктор с параметрами
    public Squirrel(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.nuts = 0;
    }

    // Геттер и сеттер для приватного поля age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    // Публичный метод
    public void chatter() {
        System.out.println(name + ": чик-чик-чик!");
    }

    // Перегрузка метода (overloading)
    public void buryNut() {
        nuts++;
        System.out.println(name + " спрятала орех. Всего: " + nuts);
    }

    public void buryNut(int count) {
        nuts += count;
        System.out.println(name + " спрятала " + count + " орехов. Всего: " + nuts);
    }

    // Приватный метод (вызов только внутри класса)
    private void secret() {
        System.out.println("Секретный тайник: " + nuts);
    }

    // Метод для вызова приватного
    public void showSecret() {
        secret();
    }
}
