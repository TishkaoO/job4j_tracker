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
                size1++;
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
        int index = indexOf(id);
        return index != 1 ? items[index] : null;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
       boolean rsl = index != -1;
       if (rsl) {
           item.setId(id);
           items[index] = item;
       }
       return rsl;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int i = 0; i < size; i++) {
            if (items[i].getId() == id) {
                rsl = i;
                break;
            }
        }
        return rsl;
    }
}