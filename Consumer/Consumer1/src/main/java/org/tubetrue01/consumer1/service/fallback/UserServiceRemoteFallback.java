package org.tubetrue01.consumer1.service.fallback;

import lombok.extern.log4j.Log4j2;
import org.tubetrue01.consumer1.service.UserServiceRemote;
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
public class UserServiceRemoteFallback implements UserServiceRemote {
    @Override
    public People userInfo() {
        log.warn("-==You enter the fallback of consumer1==-");
        return new People("Consumer1 Fallback", 404);
    }
}
