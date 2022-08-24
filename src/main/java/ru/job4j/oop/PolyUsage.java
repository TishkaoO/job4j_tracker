package ru.job4j.oop;

public class PolyUsage {
    public static void main(String[] args) {
        Vehicle buss = new Buss();
        Vehicle train = new Train();
        Vehicle airplane = new Airplane();
        Vehicle[] vehicles = new Vehicle[] {buss, train, airplane};
        for (Vehicle tmp : vehicles) {
            tmp.move();
            tmp.model();
        }
    }
}
