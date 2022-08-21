package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] rsl = new Item[items.length];
        int size1 = 0;
        for (int i = 0; i < items.length; i++) {
            Item tmp = items[i];
            if (tmp != null) {
                rsl[size1] = tmp;
                size1 ++;
            }
        }
        rsl = Arrays.copyOf(rsl, size);
        for (int i = 0; i < rsl.length; i++) {
            System.out.println(rsl[i]);
        }
        return rsl;
    }

    public Item[] findByName(String key) {
        Item[] rsl1 = new Item[items.length];
        int s = 0;
        for (int i = 0; i < size; i++) {
            Item tmp1 = items[i];
            if (tmp1.getName().equals(key)) {
                rsl1[s++] = tmp1;
            }
        }
        return Arrays.copyOf(rsl1, s);
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}