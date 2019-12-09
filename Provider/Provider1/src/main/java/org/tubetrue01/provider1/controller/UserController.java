package org.tubetrue01.provider1.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
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
@RefreshScope
public class UserController {
    @Value("${hello}")
    private String hello;

    @GetMapping("test")
    public String test() {
        log.info("-==Enter the provider 1==-");
        return hello;
    }
    @GetMapping("/info")
    public People info() {
        log.info("-==Enter the provider1==-");
        return new People(hello, 2019);
    }
}
