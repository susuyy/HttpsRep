package com.syy.springbootvue.service;

import com.syy.springbootvue.bean.User;
import com.syy.springbootvue.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserDao userDao;

    /**
     * 查询所有
     * @return
     */
    public List<User> findAll(){
        List<User> all = userDao.findAll();
        return all;
    }

    /**
     * 根据id查询
     */
    public User findById(Integer id){
        User user = userDao.findById(id).get();
        return user;
    }

    /**
     * 根据id更新数据
     */
    public void updateUser(User user){
        userDao.save(user);
//        int i=1/0;
    }
}
