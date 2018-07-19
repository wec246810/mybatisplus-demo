package com.ysk.mybatisplusdemo.controller;

import com.ysk.mybatisplusdemo.domain.User;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述
 *
 * @author Y.S.K
 * @date 2018/7/18 14:58
 */
@RestController
@Log4j2
public class UserController {

    @PostMapping("user")
    public String saveUser(@RequestBody User user) {
        log.info(user);
        user.insert();
        return "插入完毕";
    }
}
