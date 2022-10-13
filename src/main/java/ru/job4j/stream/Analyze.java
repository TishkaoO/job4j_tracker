package ru.job4j.stream;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Класс Analyze получает статистику по аттестатам.
 */
public class Analyze {

    public static double averageScore(Stream<Pupil> stream) {
        return stream
                .flatMap(pupil -> pupil.subjects().stream())
                .mapToInt(Subject::score)
                .average()
                .orElse(Double.NaN);

    }

    /*
    Метод вычисляет средний балл по каждому ученику.
    То есть берем одного ученика и считаем все его баллы за все предметы и делим на количество предметов.
    Возвращает список из объекта Tuple (имя ученика и средний балл).
     */
    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
        return stream
                .map(pupil -> new Tuple(pupil.name(), pupil.subjects().stream()
                        .mapToInt(Subject::score)
                        .average()
                        .orElse(Double.NaN)
                ))
                .collect(Collectors.toList());
    }

    /*
    Метод вычисляет средний балл по каждому предмету.
    Например, собираем все баллы учеников по предмету география и делим на количество учеников.
    Возвращает список из объектов Tuple (название предмета и средний балл).
     */
    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {
        return stream
                .flatMap(pupil -> pupil.subjects().stream())
                .collect(Collectors.groupingBy(subject -> subject.name(),
                        LinkedHashMap::new, Collectors.averagingDouble(value -> value.score())))
                .entrySet().stream()
                .map(s -> new Tuple(s.getKey(), s.getValue()))
                .collect(Collectors.toList());
    }

    /*
     Метод возвращает лучшего ученика. Лучшим считается ученик с наибольшим суммарным баллом по всем предметам.
      Возвращает объект Tuple (имя ученика и суммарный балл).
     */
    public static Tuple bestStudent(Stream<Pupil> stream) {
        return stream
                .map(pupil -> new Tuple(pupil.name(), pupil.subjects().stream()
                        .mapToInt(Subject::score)
                        .sum()
                ))
                .max(Comparator.comparingDouble(Tuple::score))
                .orElse(null);
    }

    /*
     Метод Возвращает предмет с наибольшим баллом для всех студентов.
     Возвращает объект Tuple (имя предмета, сумма баллов каждого ученика по этому предмету).
    */
    public static Tuple bestSubject(Stream<Pupil> stream) {
        return stream
                .flatMap(pupil -> pupil.subjects().stream())
                .collect(Collectors.groupingBy(Subject::name, LinkedHashMap::new,
                        Collectors.summingDouble(value -> value.score())))
                .entrySet().stream()
                .map(s -> new Tuple(s.getKey(), s.getValue()))
                .max(Comparator.comparing(Tuple::score))
                .orElse(null);
    }
}
