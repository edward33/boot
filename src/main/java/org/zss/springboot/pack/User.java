package org.zss.springboot.pack;

import lombok.Data;
import lombok.ToString;


/**
 * @author keriezhang
 * @date 2016/10/31
 */
@Data
@ToString
public class User {

    private String name;
    private String mail;
    private int age;
}
