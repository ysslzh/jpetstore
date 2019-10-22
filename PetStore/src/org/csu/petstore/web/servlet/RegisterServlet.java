package org.csu.petstore.web.servlet;
import	java.nio.file.attribute.UserPrincipal;

import org.csu.petstore.domain.UserInfo;
import org.csu.petstore.service.AccountService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {
    private UserInfo userInfo;
    private AccountService accountService;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        userInfo=new UserInfo();
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");
        userInfo.setUsername(username);
        userInfo.setPassword(password);
        userInfo.setEmail(email);
        userInfo.setPhone(phone);
        accountService = new AccountService();
        boolean isSuccess=accountService.register(userInfo);
        if(isSuccess){
            HttpSession session = req.getSession();
            session.setAttribute("message","注册成功");
        }
        else{
            HttpSession session = req.getSession();
            session.setAttribute("message","用户名已存在");
        }
    }
}
