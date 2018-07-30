/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import org.junit.Test;

/**
 *
 * @author happy
 */
public class TestPredicate {

    @Test
    public void test16() {
        Predicate<String> startWithJ = (n) -> n.startsWith("J");
        Predicate<String> fourLength = (n) -> n.length() == 4;

        List<String> languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");
        languages.stream().filter(startWithJ.and(fourLength))
                .forEach(System.out::println);
    }

}
