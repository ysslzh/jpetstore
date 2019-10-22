package org.csu.petstore.persistence;

import org.csu.petstore.domain.Category;

import java.util.List;

public interface CategoryDAO {
    /**
     *获取商品的所有种类列表
     * @return 类型列表
     */
    List<Category> getCategoryList();

    /**
     *根据id获取指定商品的种类
     * @param categoryId 唯一标识符
     * @return 类型
     */
    Category getCategory(String categoryId);
}
