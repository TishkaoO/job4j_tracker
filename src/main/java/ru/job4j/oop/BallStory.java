package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        System.out.print("Колобок встретил Зайца: ");
        hare.tryEat(ball);
        System.out.print("Колобок встретил Волка: ");
        wolf.tryEat(ball);
        System.out.print("Колобок встретил Лису: ");
        fox.tryEat(ball);
    }
}
