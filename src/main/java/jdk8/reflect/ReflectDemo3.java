/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdk8.reflect;

import jdk8.Student;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;

/**
 *
 * @author happy
 */
public class ReflectDemo3 {

    public static void main(String[] args)
            throws IntrospectionException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Person p = new Person();
        p.setId("0");
        PropertyDescriptor prop = new PropertyDescriptor("id", Person.class);

        // 获取getter方法，反射获取id值
        Object str = prop.getReadMethod().invoke(p);

        // 获取setter方法，反射赋值
        prop.getWriteMethod().invoke(p, "1");

        System.out.println("获取ID值:" + str);
        System.out.println("赋值ID:" + p.getId());
    }
}
