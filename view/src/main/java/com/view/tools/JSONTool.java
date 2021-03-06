package com.view.tools;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: gaodw
 * @Date: 17:36 2018/8/8
 * @Desc: JSON自定义处理
 */
public class JSONTool {

    /**
     * 判断是否为ajax请求
     * @param request
     * @return
     */
    public static String getRequestType(HttpServletRequest request) {
        return request.getHeader("X-Requested-With");
    }
}
