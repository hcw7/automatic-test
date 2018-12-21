package com.yy.auto.console.web.frame.spring;

import com.yy.auto.console.core.apps.system.dto.User;
import com.yy.auto.console.core.common.Cons;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * login interceptor
 *
 * @author hcw7
 * @date 2018-12-20
 */
public class SecurityInterceptor implements HandlerInterceptor {

    private Logger logger = LoggerFactory.getLogger(SecurityInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {
        User user = (User) request.getSession().getAttribute(Cons.S_USER);
        logger.info("【拦截器】拦截请求"+request.getRequestURL());
        if (user != null && user.getUserId() != null) {
            logger.info("【登录检查】用户已登录，LoginName：" + user.getLoginName() + ",UserName:" + user.getUserName());
            return true;
        }
        String url = "/index/login";
        response.sendRedirect(url);
        return false;
    }
}
