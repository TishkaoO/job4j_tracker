package ru.job4j.pojo;

public class Book {
    private String name;
    private int amountPage;

    public Book(String name, int amountPage) {
        this.name = name;
        this.amountPage = amountPage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountPage() {
        return amountPage;
    }

    public void setAmountPage(int amountPage) {
        this.amountPage = amountPage;
    }
}
