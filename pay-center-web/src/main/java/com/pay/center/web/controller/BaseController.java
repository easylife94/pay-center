package com.pay.center.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.pay.center.client.constant.ApiResultEnum;
import com.pay.center.client.vo.ApiResultVO;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.UnauthenticatedException;
import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author chenwei
 * @date 2019/1/11 11:27
 */
public abstract class BaseController {

    @ExceptionHandler({UnauthenticatedException.class, AuthenticationException.class})
    public String authenticationException(HttpServletRequest request, HttpServletResponse response) {
        if (isAjaxRequest(request)) {
            ApiResultVO apiResultVO = new ApiResultVO();
            apiResultVO.errorResult(ApiResultEnum.UNAUTHENTICATED);
            writeJson(apiResultVO, response);
            return null;
        } else {
            return "redirect:/login";
        }
    }

    @ExceptionHandler({ UnauthorizedException.class, AuthorizationException.class })
    public String authorizationException(HttpServletRequest request, HttpServletResponse response) {
        if (isAjaxRequest(request)) {
            ApiResultVO apiResultVO = new ApiResultVO();
            apiResultVO.errorResult(ApiResultEnum.UNAUTHORIZED);
            writeJson(apiResultVO, response);
            return null;
        } else {
            return "redirect:/403";
        }
    }

    public static boolean isAjaxRequest(HttpServletRequest request) {
        String requestedWith = request.getHeader("x-requested-with");
        if (requestedWith != null && requestedWith.equalsIgnoreCase("XMLHttpRequest")) {
            return true;
        } else {
            return false;
        }
    }

    private void writeJson(ApiResultVO apiResultVO, HttpServletResponse response) {
        PrintWriter out = null;
        try {
            response.setCharacterEncoding("UTF-8");
            response.setContentType("application/json; charset=utf-8");
            out = response.getWriter();
            out.write(JSONObject.toJSONString(apiResultVO));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }
}
