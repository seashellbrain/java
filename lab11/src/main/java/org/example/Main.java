package org.example;

import java.io.*;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) {

        String fileName = "about_me.txt";
        String content = "Имя: Басалай Дарья\nГруппа:т-318\nХобби: ура ура я программист";

        try {

            Files.write(Paths.get(fileName), content.getBytes());
            System.out.println("Файл создан и записан!");


            File file = new File(fileName);


            System.out.println("\n--- Информация о файле ---");
            System.out.println("Имя файла: " + file.getName());
            System.out.println("Путь: " + file.getAbsolutePath());
            System.out.println("Размер (байт): " + file.length());
            System.out.println("Существует: " + file.exists());
            System.out.println("Чтение разрешено: " + file.canRead());

            System.out.println("\n--- Содержимое файла ---");
            String text = new String(Files.readAllBytes(Paths.get(fileName)));
            System.out.println(text);

        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
