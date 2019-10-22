package org.csu.petstore.persistence.imple;
import	java.sql.PreparedStatement;

import org.csu.petstore.domain.Category;
import org.csu.petstore.domain.Product;
import org.csu.petstore.persistence.Database;
import org.csu.petstore.persistence.ProductDAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductDAOImple implements ProductDAO {

    private static final String SELECT_PRODUCT = "SELECT * FROM product WHERE productId=?";
    private static final String SELECT_PRODUCT_BY_CATEGOTY = "SELECT * FROM product WHERE categoryId=?";
    private static final String SELECT_PRODUCT_BY_KEYWORD ="SELECT * FROM product WHERE name like ? ";

    @Override
    public Product getProduct(String productId) {
        Product product = null;
        try{
            PreparedStatement statement = Database.getPreparedStatement(SELECT_PRODUCT);
            statement.setString(1,productId);
            ResultSet result = statement.executeQuery();
            if (result.next()){
                product = new Product();
                product.setProductId(result.getString("productId"));
                product.setCategoryId(result.getString("categoryId"));
                product.setName(result.getString("name"));
                product.setDescription(result.getString("description"));
                product.setImageUrl(result.getString("imageUrl"));
                product.setWeight(result.getDouble("weight"));
                product.setAge(result.getInt("age"));
            }
            Database.closeStatement();
            Database.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return product;
    }

    @Override
    public List<Product> getProductByCategory(String categoryId) {
        List<Product> productList = new ArrayList<Product>();
        try{
            PreparedStatement statement = Database.getPreparedStatement(SELECT_PRODUCT_BY_CATEGOTY);
            statement.setString(1,categoryId);
            ResultSet result = statement.executeQuery();
            while (result.next()){
                Product product = new Product();
                product.setProductId(result.getString("productId"));
                product.setCategoryId(result.getString("categoryId"));
                product.setName(result.getString("name"));
                product.setDescription(result.getString("description"));
                product.setImageUrl(result.getString("imageUrl"));
                product.setWeight(result.getDouble("weight"));
                product.setAge(result.getInt("age"));
                productList.add(product);
            }
            Database.closeStatement();
            Database.closeConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return productList;
    }

    @Override
    public List<Product> getProductByKeyword(String keyword) {
        List<Product> productList = new ArrayList<Product>();
        try{
            PreparedStatement statement = Database.getPreparedStatement(SELECT_PRODUCT_BY_KEYWORD);
            statement.setString(1, keyword);
            ResultSet result = statement.executeQuery();
            while (result.next()){
                Product product = new Product();
                product.setProductId(result.getString("productId"));
                product.setCategoryId(result.getString("categoryId"));
                product.setName(result.getString("name"));
                product.setDescription(result.getString("description"));
                product.setImageUrl(result.getString("imageUrl"));
                product.setWeight(result.getDouble("weight"));
                product.setAge(result.getInt("age"));
                productList.add(product);
            }
            Database.closeStatement();
            Database.closeConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return productList;
    }
}