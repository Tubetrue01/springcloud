package org.tubetrue01.consumer2.Controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tubetrue01.consumer2.service.UserServiceRemote;
import org.tubetrue01.pojo.People;

/**
 * Created by IntelliJ IDEA.
 * User : Pengfei Zhang
 * Mail : Tubetrue01@gmail.com
 * Date : 2019/12/6
 * Time : 3:28 下午
 * Description :
 */
@Log4j2
@RestController
@RequestMapping("/user")
public class UserController {

    @Qualifier("userServiceRemote")
    @Autowired
    private UserServiceRemote userServiceRemote;

    @GetMapping("/info")
    public People userInfo() {
        log.info("-==Enter Consumer2==-");
        return this.userServiceRemote.userInfo();
    }

    @GetMapping("/test")
    public String testInfo() {
        log.info("-==Enter Consumer2==-");
        return this.userServiceRemote.testInfo();
    }
}
