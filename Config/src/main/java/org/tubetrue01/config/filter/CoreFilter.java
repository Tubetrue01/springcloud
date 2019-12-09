package org.tubetrue01.config.filter;

import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User : Pengfei Zhang
 * Mail : Tubetrue01@gmail.com
 * Date : 2019/12/4
 * Time : 1:35 下午
 * Description :
 */
@Order(0)
@WebFilter("/*")
public class CoreFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        var httpRequest = (HttpServletRequest) request;
        var url = httpRequest.getRequestURL().toString();

        if (!url.contains("/bus-refresh")) {
            chain.doFilter(request, response);
        }else {
            chain.doFilter(new RequestWrapper(httpRequest), response);
        }

    }
}
