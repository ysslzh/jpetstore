package org.csu.petstore.web.servlet;

import org.csu.petstore.domain.Product;
import org.csu.petstore.service.CatelogService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class ProductServlet extends HttpServlet {
    private CatelogService catelogService=null;
    private static final String PRODUCT_URL="/WEB-INF/jsp/catalog/product.jsp";
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String productId = req.getParameter("productId");
        catelogService = new CatelogService();
        Product product=catelogService.getProduct(productId);
        HttpSession session = req.getSession();
        session.setAttribute("product",product);
        req.getRequestDispatcher(PRODUCT_URL).forward(req,resp);
    }
}
