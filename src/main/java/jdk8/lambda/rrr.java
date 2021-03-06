/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdk8.lambda;

import java.io.File;
import java.io.FileFilter;
import java.security.PrivilegedActionException;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author happy
 */
public class rrr {

    public static void main(String[] args) throws PrivilegedActionException {
//        FileFilter java = (File f) -> f.getName().endsWith("*.java");
        test15();
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

    public static void filter(List<String> names, Predicate condition) {
        for (String name : names) {
            if (condition.test(name)) {
                System.out.println(name + " ");
            }
        }
    }
}
