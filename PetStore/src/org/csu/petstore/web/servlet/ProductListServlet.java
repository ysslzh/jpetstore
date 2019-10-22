package org.csu.petstore.web.servlet;

import org.csu.petstore.domain.Category;
import org.csu.petstore.domain.Product;
import org.csu.petstore.service.CatelogService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

public class ProductListServlet extends HttpServlet {
    private CatelogService catelogService=null;
    private static final String PRODUCT_LIST="/WEB-INF/jsp/catalog/Category.jsp";
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String categoryId = req.getParameter("categoryId");
        catelogService = new CatelogService();
        List<Product> productList = catelogService.getProductByCategory(categoryId);
        Category category = catelogService.getCategory(categoryId);
        HttpSession session = req.getSession();
        session.setAttribute("productList",productList);
        session.setAttribute("category",category);
        req.getRequestDispatcher(PRODUCT_LIST).forward(req,resp);
    }
}
