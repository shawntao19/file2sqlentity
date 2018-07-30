/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import com.alibaba.fastjson.JSON;
import java.util.ArrayList;
import java.util.List;
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
        List<PersonBuilder> pbList = new ArrayList<PersonBuilder>();
//        for (int i = 0; i < 10; i++) {
        int i = 2;
        PersonBuilder pb1 = PersonBuilder.builder().id(i).name("张三").age(i * 10).sex("男").desc("测试使用builder模式").build();
        PersonBuilder pb2 = PersonBuilder.builder().id(3).name("张三").age(i * 10).sex("男").desc("测试使用builder模式").build();
//            pbList.add(pb);
        if (pb1.equals(pb2)) {
            log.info("true");
        }
        log.info(pb1.hashCode());
        log.info(pb2.hashCode());
        log.info(pb2.toString());
//        }
//        log.info(pb.getName());
        log.info(JSON.toJSONString(pbList));
    }
}
