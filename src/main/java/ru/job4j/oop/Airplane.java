package ru.job4j.oop;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " Летим-Летим.");
    }

    @Override
    public void model() {
        System.out.println(getClass().getSimpleName() + " Модель: Боинг 747.");
    }
}
