/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examtestproject;

import java.util.concurrent.Semaphore;

/**
 *
 * @author happy
 */
public class sfas {

    public static void main(String[] args) {
        Semaphore semp = new Semaphore(5);

        try {
            // 申请许可
            semp.acquire();
            try {
                // 业务逻辑
            } catch (Exception e) {

            } finally {
                // 释放许可
                semp.release();
            }
        } catch (InterruptedException e) {

        }
        
    }
}
