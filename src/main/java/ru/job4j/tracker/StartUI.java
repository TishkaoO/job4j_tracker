package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item item = new Item();
        item.getCreated();
        LocalDateTime created = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String createdFormat = created.format(formatter);
        System.out.println("Текущие дата и время после форматирования: " + createdFormat);
        System.out.println("Item: " + item);
    }
}
