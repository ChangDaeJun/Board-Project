package com.jsp.web.controller.user;

import com.jsp.domain.user.UserVO;
import com.jsp.web.controller.Controller;

import com.jsp.service.user.JoinService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class InsertUserController implements Controller {
    @Override
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
        UserVO vo = getJoinUserVO(request);
        JoinService.getInstance().run(vo);

        return "index";
    }

    private static UserVO getJoinUserVO(HttpServletRequest request) {
        UserVO userVO = new UserVO();
        userVO.setName(request.getParameter("name"));
        userVO.setEmail(request.getParameter("email"));
        userVO.setPassword(request.getParameter("password"));
        userVO.setRole(request.getParameter("role"));
        return userVO;
    }
}
