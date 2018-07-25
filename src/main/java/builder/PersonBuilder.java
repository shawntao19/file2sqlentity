/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import lombok.Builder;
import lombok.Data;

/**
 *
 * @author happy
 */
@Builder
@Data
public class PersonBuilder {
    //必要参数

    private final int id;
    private final String name;
    //可选参数
    private final int age;
    private final String sex;
    private final String phone;
    private final String address;
    private final String desc;

}
