package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Item {
    private LocalDateTime created = LocalDateTime.now();
    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
    private int id;
    private String name;

    public Item() {
    }

    public Item(String name) {
        this.name = name;
    }

    public Item(int id, String name, LocalDateTime created) {
        this.id = id;
        this.name = name;
        this.created = created;
    }
}