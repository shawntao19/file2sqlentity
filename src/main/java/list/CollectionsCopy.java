/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author happy
 */
public class CollectionsCopy {

    public static void main(String[] args) {
        ArrayList arrlst = new ArrayList();

        // populate the list
        arrlst.add("A");
        arrlst.add("B");
        arrlst.add("C");
        arrlst.add("D");
        arrlst.add("E");

        // reverse the list
        Collections.reverse(arrlst);

        System.out.println("The Reverse List is :" + arrlst);

        System.out.println("The initial list is :" + arrlst);
        List<String> dest1 = new ArrayList<String>();
        List<String> arrlst2 = new ArrayList<String>(Arrays.asList(new String[arrlst.size()]));
        Collections.addAll(dest1, new String[arrlst.size()]);

        Collections.copy(dest1, arrlst);
        Collections.copy(arrlst2, arrlst);

        arrlst.clear();
        System.out.println("The initial arrlst is :" + arrlst);
        System.out.println("The initial dest1 is :" + dest1);
        System.out.println("The initial arrlst2 is :" + arrlst2);
    }
}
