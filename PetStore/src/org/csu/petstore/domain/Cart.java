package org.csu.petstore.domain;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private UserInfo userInfo;
    private String cardId;
    private List<Product> products;

    Cart() {
        products=new ArrayList<Product>();
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }
    public void addProduct(Product product){
        products.add(product);
    }
    public void delProduct(Product product){
        products.remove(product);
    }

    public List<Product> getProducts() {
        return products;
    }


}
