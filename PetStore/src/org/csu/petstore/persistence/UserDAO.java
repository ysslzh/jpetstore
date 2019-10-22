package org.csu.petstore.persistence;

import org.csu.petstore.domain.UserInfo;

public interface UserDAO {
    /**
     * 用于登录验证
     * @param userInfo由用户输入的用户名密码所创建的UserInfo
     * @return 登录成功返回用户信息，否则返回null
     */
    public UserInfo login(UserInfo userInfo);

    public boolean register(UserInfo userInfo);

}
