package org.csu.petstore.web.servlet;

import org.csu.petstore.domain.UserInfo;
import org.csu.petstore.service.AccountService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    private UserInfo userInfo;
    private AccountService accountService;
    //为什么以类属性的形式定义，而不是在方法中声明创建？

    private static final String SIGNIN_SUCCESS ="/WEB-INF/jsp/catalog/main.jsp";
    private static final String SIGNIN_FAILURE = "/WEB-INF/jsp/catalog/login.jsp";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String message = null;
        String username = req.getParameter("username");
        //如果以全局变量的形式存储有什么缺点嘛？例如 private static final String PARAMETER_USERNAME="xx";
        String password = req.getParameter("password");
        userInfo = new UserInfo();
        userInfo.setUsername(username);
        userInfo.setPassword(password);

        accountService = new AccountService();
        userInfo = accountService.login(userInfo);

        if(userInfo==null){
            message="用户名或密码错误，请重新输入！";
            //为什么不用HttpRequest？
            HttpSession session = req.getSession();
            session.setAttribute("message",message);
            req.getRequestDispatcher(SIGNIN_FAILURE).forward(req,resp);
        }
        else{
            req.setAttribute("user", userInfo);
            req.getRequestDispatcher(SIGNIN_SUCCESS).forward(req, resp);
        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }
}
