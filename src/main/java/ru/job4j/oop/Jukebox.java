package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
       if (position == 1) {
           System.out.println("Пусть бегут неуклюже");
       } else {
           System.out.println("Песня не найдена");
       }
       if (position == 2) {
           System.out.println("Спокойной ночи");
       } else {
           System.out.println("Песня не найдена");
       }
    }

    public static void main(String[] args) {
        Jukebox robot = new Jukebox();
        robot.music(1);
        robot.music(2);
        robot.music(3);
    }
}
