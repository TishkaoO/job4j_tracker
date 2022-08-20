package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book roman = new Book("Бедная Настя", 500);
        Book cooking = new Book("Теория Хлеба", 900);
        Book history = new Book("История большого заговора", 12);
        Book cleanCode = new Book("Чистый код", 1000);
        Book[] books = new Book[4];
        books[0] = roman;
        books[1] = cooking;
        books[2] = history;
        books[3] = cleanCode;
        for (int i = 0; i < books.length; i++) {
            Book tmp = books[i];
            System.out.println(tmp.getName() + " - " + tmp.getAmountPage());
        }
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int i = 0; i < books.length; i++) {
            Book tmp = books[i];
            if ("Чистый код".equals(tmp.getName())) {
                System.out.println(tmp.getName() + " - " + tmp.getAmountPage());
            }
        }
    }
}
