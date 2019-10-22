package org.csu.petstore.web.servlet;

import org.csu.petstore.domain.Category;
import org.csu.petstore.service.CatelogService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

public class MainServlet extends HttpServlet {
    private CatelogService catelogService=null;
    private static final String MAIN_URL = "/WEB-INF/jsp/catalog/main.jsp";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        catelogService = new CatelogService();
        List<Category> categoryList = catelogService.getCategoryList();
        HttpSession session = req.getSession();
        session.setAttribute("categoryList",categoryList);
        req.getRequestDispatcher(MAIN_URL).forward(req,resp);
    }
}
