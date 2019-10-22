package org.csu.petstore.persistence.imple;
import	java.sql.PreparedStatement;

import org.csu.petstore.domain.UserInfo;
import org.csu.petstore.persistence.Database;
import org.csu.petstore.persistence.UserDAO;

import java.sql.ResultSet;

public class UserDAOImple implements UserDAO {

    private static final String SELECT_USERINFO="SELECT * FROM user WHERE username=? AND password=?";
    private static final String CREAT_USERINFO="INSERT INTO user (id,username,password,email,phone) VALUES (null,?,?,?,?)";
    private static final String REGISTER_TEST="SELECT * FROM user WHERE username=?";
    @Override
    public UserInfo login(UserInfo userInfo) {
        UserInfo user=null;
        try{

            PreparedStatement statement = Database.getPreparedStatement(SELECT_USERINFO);
            statement.setString(1,userInfo.getUsername());
            statement.setString(2, userInfo.getPassword());
            ResultSet result = statement.executeQuery();
            if(result.next()){

                user = new UserInfo();
                user.setUsername(result.getString("username"));
                user.setUsername(result.getString("password"));

            }
            Database.closeStatement();
            Database.closeConnection();
        }catch (Exception e){
            e.printStackTrace();
        }

        return user;
    }

    @Override
    public boolean register(UserInfo userInfo){
        try{
            PreparedStatement statement = Database.getPreparedStatement(REGISTER_TEST);
            statement.setString(0,userInfo.getUsername());
            ResultSet result=statement.executeQuery();
            if(result.next()){
                return false;
            }
            else {
                statement=Database.getPreparedStatement(CREAT_USERINFO);
                statement.setString(0, userInfo.getUsername());
                statement.setString(1, userInfo.getPassword());
                statement.setString(2, userInfo.getEmail());
                statement.setString(3, userInfo.getPhone());
                statement.executeUpdate();
                return true;
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
