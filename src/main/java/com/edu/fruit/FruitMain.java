/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.fruit;

import lombok.extern.log4j.Log4j;
import org.apache.log4j.BasicConfigurator;

/**
 *
 * @author happy
 */
@Log4j
public class FruitMain {

    public static void main(String[] args) {
//        BasicConfigurator.configure();
        Apple ap = new Apple();
        ap.setColour(0);
//        System.out.println("com.edu.fruit.FruitMain.main():" + ap.toString());
        System.out.println("com.edu.fruit.FruitMain.main()");
        log.info(ap.toString());;
    }

}
