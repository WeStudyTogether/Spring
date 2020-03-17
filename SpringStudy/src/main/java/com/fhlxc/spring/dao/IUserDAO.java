package com.fhlxc.spring.dao;

import java.util.List;

/**
* @author Xingchao Long
* @date 2020年1月30日 下午5:20:10
* @ClassName IUserDAO
* @Description
*/

public interface IUserDAO {

    public List<User> queryAllUser();
    public Boolean addUser(User user);
    public List<User> queryAll();
    public Boolean transfer(int fromUserId, int toUserId, float transferMoney);
    
}
