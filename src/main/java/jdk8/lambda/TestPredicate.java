/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdk8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import static jdk8.lambda.rrr.filter;
import org.junit.Test;

/**
 *
 * @author happy
 */
public class TestPredicate {

    public void test16() {
        Predicate<String> startWithJ = (n) -> n.startsWith("J");
        Predicate<String> fourLength = (n) -> n.length() == 4;

        List<String> languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");
        languages.stream().filter(startWithJ.and(fourLength))
                .forEach(System.out::println);
    }

    public void test167() {
        final int num = 1;
        Converter s = (param) -> System.out.println(String.valueOf(param + num));
        s.convert(2);  // 输出结果为 3
    }

    public interface Converter {

        void convert(int i);
    }

    public static void test15() {
        List<String> languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");

        System.out.println("Languages which starts with J :");
        filter(languages, (str) -> ((String) str).startsWith("J"));

        System.out.println("Languages which ends with a ");
        filter(languages, (str) -> ((String) str).endsWith("a"));

        System.out.println("Print all languages :");
        filter(languages, (str) -> true);

        System.out.println("Print no language : ");
        filter(languages, (str) -> false);

        System.out.println("Print language whose length greater than 4:");
        filter(languages, (str) -> ((String) str).length() > 4);

    }

    @Test
    public void test168() {
        Random random = new Random();
        random.ints().sorted().limit(10).forEach(System.out::println);
    }

}
