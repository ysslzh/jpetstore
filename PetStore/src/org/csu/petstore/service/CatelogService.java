package org.csu.petstore.service;

import org.csu.petstore.domain.Category;
import org.csu.petstore.domain.Product;
import org.csu.petstore.persistence.CategoryDAO;
import org.csu.petstore.persistence.ProductDAO;
import org.csu.petstore.persistence.imple.CategoryDAOImple;
import org.csu.petstore.persistence.imple.ProductDAOImple;

import java.util.List;

public class CatelogService {
    private CategoryDAO categoryDAO;
    private ProductDAO productDAO;
    public CatelogService(){
        categoryDAO = new CategoryDAOImple();
        productDAO = new ProductDAOImple();
    }

    /**
     * get all animal category
     * @return
     */
    public List<Category> getCategoryList() {
        return categoryDAO.getCategoryList();
    }

    /**
     * to know category by categoryID
     * @param categoryId
     * @return
     */
    public Category getCategory(String categoryId){
        return categoryDAO.getCategory(categoryId);
    }

    /**
     * 根据种类获取商品
     * @param categoryId
     * @return
     */
    public List<Product> getProductByCategory(String categoryId){
        return productDAO.getProductByCategory(categoryId);
    }

    /**
     * 根据关键字获取商品
     * @param keyword
     * @return
     */
    public List<Product> getProductByKeyword(String keyword) {
        return productDAO.getProductByKeyword(keyword);
    }

    /**
     * get product animal
     * @param productId
     * @return
     */
    public Product getProduct(String productId){
        return productDAO.getProduct(productId);
    }

}
