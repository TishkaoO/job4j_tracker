package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Комендантов Кирилл Александрович");
        student.setGroup(3);
        student.setDate(14);
        System.out.println(student.getFullName() + " № Группы- " + student.getGroup() + "  "
                + " дата: " + student.getDate() + " февраля");
    }
}
