package org.tubetrue01.consumer2.service.fallback;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import org.tubetrue01.consumer2.service.UserServiceRemote;
import org.tubetrue01.pojo.People;

/**
 * Created by IntelliJ IDEA.
 * User : Pengfei Zhang
 * Mail : Tubetrue01@gmail.com
 * Date : 2019/12/6
 * Time : 3:29 下午
 * Description :
 */
@Log4j2
@Component
public class UserServiceRemoteFallback implements UserServiceRemote {
    @Override
    public People userInfo() {
        log.warn("-==You enter the fallback of consumer2==-");
        return new People("Consumer2 Fallback", 404);
    }
}
