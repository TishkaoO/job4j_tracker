package ru.job4j.poly;

public interface Transport {
    void drive();

    void human(int amount);

    int refuel(int fuel, int money);
}
