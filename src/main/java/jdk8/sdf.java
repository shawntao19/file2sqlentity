/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdk8;

import com.alibaba.fastjson.JSON;

/**
 *
 * @author happy
 */
public class sdf {
    
    public static void main(String[] args) {
//        int ss = 7;
//        System.out.println("jdk8.sdf.main() org:" + ss);
//        int ssout = fun(ss);
//        System.out.println("jdk8.sdf.main() ss:" + ss);
//        System.out.println("jdk8.sdf.main() ssout:" + ssout);
        
        Student std = new Student();
        funStudent(std);
        System.out.println("jdk8.sdf.main()" + JSON.toJSONString(std));
    }
    
    public static int fun(int i) {
        i = i + 10;
        return i;
    }
    
    public static void funStudent(Student in) {
        in.setAge("10");
        in.setName("张小毛");
    }
    
}
