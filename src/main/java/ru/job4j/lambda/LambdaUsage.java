package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaUsage {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("eeeee", "a", "ccc", "dddd", "bb");
        Comparator<String> comparator = (left, right) -> {
            System.out.println("compare - " + right.length() + " : " + left.length());
            for (String str : strings) {
                System.out.println(str);
            }
            return Integer.compare(right.length(), left.length());
        };
        strings.sort(comparator);
    }
}
