package ru.job4j.tracker;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class Item {
    private LocalDateTime created = LocalDateTime.now();
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