package com.pay.center.web.api;

import com.pay.center.client.constants.ApiResultEnum;
import com.pay.center.client.model.UserDO;
import com.pay.center.client.vo.ApiResultVO;
import com.pay.center.client.vo.UserLoginResultVO;
import com.pay.center.client.vo.UserLoginVO;
import com.pay.center.core.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 权限接口
 *
 * @author chenwei
 * @date 2019/1/10 15:00
 */
@Api(description = "权限接口")
@RestController
@RequestMapping("/api/access")
public class AccessApi {

    @ApiOperation(value = "登陆" , notes = "登陆，并获取登陆信息，响应携带shiro cookie")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ApiResultVO<UserLoginResultVO> login(UserLoginVO userLoginVO) {
        ApiResultVO<UserLoginResultVO> result = new ApiResultVO<>();
        UsernamePasswordToken token = new UsernamePasswordToken(userLoginVO.getLoginName(), userLoginVO.getPassword());
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(token);

            UserDO user = userService.findByLoginName(userLoginVO.getLoginName());
            subject.getSession().setAttribute("user", user);

            UserLoginResultVO userLoginResultVO = new UserLoginResultVO(user.getUserName());
            result.setData(userLoginResultVO);
        } catch (IncorrectCredentialsException ice) {
            // 捕获密码错误异常
            result.errorResult(ApiResultEnum.INCORRECT_CREDENTIAL);
        } catch (UnknownAccountException uae) {
            // 捕获未知用户名异常
            result.errorResult(ApiResultEnum.UNKNOWN_ACCOUNT);
        } catch (ExcessiveAttemptsException eae) {
            // 捕获错误登录过多的异常
            result.errorResult(ApiResultEnum.EXCESSIVE_ATTEMPTS_EXCEPTION);
        } catch (Exception e) {
            e.printStackTrace();
            result.errorResult(ApiResultEnum.UNKNOWN);
        }
        return result;
    }

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    public ApiResultVO logout() {
        ApiResultVO apiResultVO = new ApiResultVO();
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return apiResultVO;
    }
}
