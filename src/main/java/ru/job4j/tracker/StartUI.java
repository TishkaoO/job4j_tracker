package ru.job4j.tracker;

import java.time.LocalDateTime;

public class StartUI {
    public static void main(String[] args) {
        Item item = new Item();
        item.getCreated();
        LocalDateTime created = LocalDateTime.now();
        System.out.println("dd-MMMM-EEEE-yyyy HH:mm:ss" + " " + created);

    }
}
