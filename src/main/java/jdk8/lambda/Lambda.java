/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdk8.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author happy
 */
public class Lambda {

    public static void main(String[] args) {
        Thread oldSchool = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("This is from an anonymous class.");
            }
        });

//        System.out.println("jdk8.ttt.main()"+(x,y)->{x+y});
        Thread gaoDuanDaQiShangDangCi = new Thread(() -> {
            System.out.println("This is from an anonymous method (lambda exp).");
        });

        oldSchool.start();
        gaoDuanDaQiShangDangCi.start();

        List<String> sslist = new ArrayList<>();
        sslist.add("a");
        sslist.add("b");
        sslist.forEach(o -> {
            System.out.println(o);
        });
    }
}
