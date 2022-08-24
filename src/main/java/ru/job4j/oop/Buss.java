package ru.job4j.oop;

public class Buss implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " Едем по дороге.");
    }

    @Override
    public void model() {
        System.out.println(getClass().getSimpleName() + " Модель: HYUNDAI.");
    }
}
