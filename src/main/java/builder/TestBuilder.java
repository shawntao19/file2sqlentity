/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import com.alibaba.fastjson.JSON;
import lombok.extern.log4j.Log4j;

/**
 *
 * @author happy
 */
@Log4j
public class TestBuilder {

    public static void main(String[] args) {
        Person person = new Person.Builder(1, "张三")
                .age(18).sex("男").desc("测试使用builder模式").build();
        log.info(JSON.toJSONString(person));
//        PersonBuilder pb=new PersonBuilder();
        PersonBuilder pb = PersonBuilder.builder().sex("nan").name("22").phone("123").build();
//        log.info(pb.getName());
        log.info(JSON.toJSONString(PersonBuilder.builder().sex("nan").name("22").phone("123").build()));
    }
}
