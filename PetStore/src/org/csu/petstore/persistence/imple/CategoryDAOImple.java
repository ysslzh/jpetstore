package org.csu.petstore.persistence.imple;
import	java.sql.Connection;

import org.csu.petstore.domain.Category;
import org.csu.petstore.persistence.CategoryDAO;
import org.csu.petstore.persistence.Database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CategoryDAOImple implements CategoryDAO {
    private static final String SELECT_ALL_CATEGORY="SELECT * FROM category";
    private static final String SELECT_CATEGORY ="SELECT * FROM category WHERE categoryId =?";

    @Override
    public Category getCategory(String categoryId) {
        Category category = null;
        try{
            PreparedStatement statement = Database.getPreparedStatement(SELECT_CATEGORY);
            statement.setString(1,categoryId);
            ResultSet result = statement.executeQuery();

            if (result.next()) {
                category = new Category();
                category.setCategoryId(result.getString("categoryId"));
                category.setName(result.getString("name"));
                category.setDescription(result.getString("description"));
                category.setLogoUrl(result.getString("logoUrl"));
            }
            Database.closeStatement();
            Database.closeConnection();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return category;
    }

    @Override
    public List<Category> getCategoryList() {
        List<Category> categoryList = new ArrayList<Category> ();
        try{
            PreparedStatement statement = Database.getPreparedStatement(SELECT_ALL_CATEGORY);
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                Category category = new Category();
                category.setCategoryId(result.getString("categoryId"));
                category.setName(result.getString("name"));
                category.setDescription(result.getString("description"));
                category.setLogoUrl(result.getString("logoUrl"));
                categoryList.add(category);
            }
            Database.closeStatement();
            Database.closeConnection();
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return categoryList;
    }
}
