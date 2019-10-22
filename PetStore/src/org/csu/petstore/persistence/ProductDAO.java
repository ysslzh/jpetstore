package org.csu.petstore.persistence;

import org.csu.petstore.domain.Category;
import org.csu.petstore.domain.Product;

import java.util.List;

public interface ProductDAO {
    /**
     * 通过商品的id获取商品
     * @param productId
     * @return
     */
    public Product getProduct(String productId);

    /**
     * 获取同类商品
     * @param category
     * @return
     */
    public List<Product> getProductByCategory(String categoryId);

    public List<Product> getProductByKeyword(String keyword);

}
