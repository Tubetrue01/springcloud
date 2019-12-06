package org.tubetrue01.consumer2.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.tubetrue01.consumer2.service.fallback.UserServiceRemoteFallback;
import org.tubetrue01.pojo.People;

/**
 * Created by IntelliJ IDEA.
 * User : Pengfei Zhang
 * Mail : Tubetrue01@gmail.com
 * Date : 2019/12/6
 * Time : 3:29 下午
 * Description :
 */
@Qualifier("userServiceRemote")
@FeignClient(name = "provider", fallback = UserServiceRemoteFallback.class)
public interface UserServiceRemote {

    @GetMapping("/user/info")
    People userInfo();
}
