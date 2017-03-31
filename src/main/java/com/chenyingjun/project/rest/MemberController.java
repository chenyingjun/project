package com.chenyingjun.project.rest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 用户Controller
 * 
 * @author chenyingjun
 * @since 1.0
 * @version 2017年3月16日 chenyingjun
 */
@Api(tags = "用户自定义聊天表情接口")
@Controller
@RequestMapping(value = "/api/member")
public class MemberController {

    /**
     * 查询用户列表
     * 
     * @param userId 用户主键
     * @return RestObject
     */
    @RequestMapping(value = { "/find" }, method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "查询用户自定义聊天表情列表", notes = "查询用户自定义聊天表情列表")
    @ApiImplicitParams({
    @ApiImplicitParam(paramType = "query", name = "userId", value = "用户主键", dataType = "String"),})
    public RestObject find(String userId) {
        RestObject rest;
        rest = RestObject.newOk("调用成功: userId" + userId + "");
        return rest;
    }

}
