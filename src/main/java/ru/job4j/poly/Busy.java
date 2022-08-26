package ru.job4j.poly;

public class Busy implements Transport {
    @Override
    public void drive() {
        System.out.println("едет по дороге");
    }

    @Override
    public void human(int amount) {
        int people = 4;
        System.out.println("Количество человек в машине " + people);
    }

    @Override
    public int refuel(int fuel, int money) {
        int petrol = 55;
        int buy = 50;
        if (petrol < 10) {
            System.out.println("покупаем бензин и заправляемся");
            int purchase = buy * 20;
        } else {
            System.out.println("Едем дальше");
        }
        return money;
    }
}

