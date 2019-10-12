package org.zss.springboot.pack;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("hello")
    public String hello() {
        User user = new User();
        user.setName("xiaoming");
        user.setMail("aa@qq.com");
        user.setAge(17);

        String data = "{\n  \"name\" : \"小明\",\n  \"mail\" : \"aaa@qq.com\",\n  \"age\" : 16\n}";

        String dd = "";
        return user.toString();
    }
}
