package com.syy.springbootvue.dao;

import com.syy.springbootvue.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserDao extends JpaRepository<User,Integer>,JpaSpecificationExecutor<User> {
}
