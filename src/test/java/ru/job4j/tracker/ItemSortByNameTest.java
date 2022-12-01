/*
package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ItemSortByNameTest {
    @Test
    public void whenItemAscByName() {
        List<Item> items = Arrays.asList(
                new Item("Vova"),
                new Item("Kirill"),
                new Item("Semen"));
        List<Item> expected = Arrays.asList(
                new Item("Kirill"),
                new Item("Semen"),
                new Item("Vova"));
        items.sort(new ItemAscByName());
        assertEquals(expected, items);

    }

    @Test
    public void whenItemDescByName() {
        List<Item> items = Arrays.asList(
                new Item("Vladimir"),
                new Item("Vova"),
                new Item("Kirill"));
        items.sort(new ItemDescByName());
        List<Item> expected = List.of(
                new Item("Kirill"),
                new Item("Vladimir"),
                new Item("Vova"));
        items.sort(new ItemAscByName());
        assertEquals(expected, items);
    }
}
 */