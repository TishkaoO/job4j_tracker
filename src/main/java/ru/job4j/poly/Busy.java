package ru.job4j.poly;

public class Busy implements Transport {
    @Override
    public void drive() {

    }

    @Override
    public void human(int amount) {

    }

    @Override
    public int refuel(int fuel, int money) {
        return money;
    }
}

