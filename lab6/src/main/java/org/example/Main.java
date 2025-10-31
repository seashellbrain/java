package org.example;

public class Main {
    public static void main(String[] args) {
        // создаём белку
        Squirrel s1 = new Squirrel("Лесса", 12, 0.45);

        // вызовы методов
        s1.chatter();
        s1.buryNut();
        s1.buryNut(3);

        // использование геттера/сеттера
        System.out.println("Возраст: " + s1.getAge());
        s1.setAge(15);
        System.out.println("Новый возраст: " + s1.getAge());

        // показать «секретный» метод через публичный
        s1.showSecret();
    }
}
