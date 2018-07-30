
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author happy
 */
public class wwww {

    @Test
    public void test168() {
//        Random random = new Random();
//        random.ints().limit(10).sorted().forEach(System.out::println);
//        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
//        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
//        long count = strings.stream().filter(string -> string.isEmpty()).count();
//        System.out.println("空字符串数量为: " + count);
//        Collectors.c
        List<Integer> list = IntStream.range(1, 100).boxed().collect(Collectors.toList());
        Double avarage = list.stream().collect(Collectors.averagingInt(item -> item));
        System.out.println("空字符串数量为avarage: " + avarage);
        IntSummaryStatistics iss = list.stream().collect(Collectors.summarizingInt(name -> name));
        System.out.println(iss);
    }
}
