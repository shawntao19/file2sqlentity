/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

/**
 *
 * @author happy
 */
public class ArraysTest {

    String[] array = new String[]{"a", "c", "2", "1", "b"};
    Integer[] ints = new Integer[]{5, 1, 4, 3, 2};

//    @Test
    public void test1() {
        List<String> lists = Arrays.asList(array);
    }

    @Test
    public void sort() {
        /* Arrays.sort(array);
        for(String str : array){
            System.out.println(str);
        }*/
        Arrays.sort(array, 2, 5);
        System.out.println(Arrays.deepToString(array));//[a, c, 1, 2, b]
    }
}
