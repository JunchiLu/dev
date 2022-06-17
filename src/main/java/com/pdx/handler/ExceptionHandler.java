package com.pdx.handler;

import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @author PDX
 * @website https://blog.csdn.net/Gaowumao
 * @Date 2022-05-04 21:32
 * @Description
 */
@ControllerAdvice
public class ExceptionHandler {

    private final org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());

    @org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
    public ModelAndView exception(HttpServletRequest request, Exception e) throws Exception {
        logger.error("Request URL:{},Exception:{}", request.getRequestURL(), e);
        ModelAndView mv = new ModelAndView();
        if (AnnotationUtils.findAnnotation(e.getClass(), ResponseStatus.class) != null) {
            if (e.getMessage().contains("用户不存在")) {
                mv.setViewName("extra-login");
                return mv;
            }
            mv.addObject("url", request.getRequestURL());
            mv.addObject("exception", e);
            mv.setViewName("error/error");
            return mv;
        }

        mv.addObject("url", request.getRequestURL());
        mv.addObject("exception", e);
        mv.setViewName("error/error");

        return mv;
    }
}
