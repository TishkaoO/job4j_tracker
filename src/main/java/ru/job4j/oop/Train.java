package ru.job4j.oop;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " Едем по рельсам.");
    }

    @Override
    public void model() {
        System.out.println(getClass().getSimpleName() + " Модель: М62");
    }
}
