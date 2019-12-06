package org.tubetrue01.userProvider.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tubetrue01.pojo.People;

/**
 * Created by IntelliJ IDEA.
 * User : Pengfei Zhang
 * Mail : Tubetrue01@gmail.com
 * Date : 2019/12/6
 * Time : 1:49 下午
 * Description :
 */
@Log4j2
@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/info")
    public People info() {
        log.info("-==Enter the userProvider==-");
        return new People("YouTube", 2020);
    }
}
