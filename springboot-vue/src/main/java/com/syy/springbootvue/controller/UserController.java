package com.syy.springbootvue.controller;

import com.syy.springbootvue.bean.User;
import com.syy.springbootvue.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 查询列表集合
     */
    @GetMapping("/findAll")
    public List<User> findAll(){
        System.out.println("全项目提交测试修改");
        System.out.println("测试合并");
        return userService.findAll();
    }

    /**
     * 根据id查询
     */
    @GetMapping("/findById/{id}")
    public User findById(@PathVariable("id")Integer id){
        return userService.findById(id);
    }

    /**
     * 修改user数据
     */
    @PostMapping("/update")
    public String updateUser(@RequestBody User user){
        try {
            userService.updateUser(user);
            return "保存成功";
        } catch (Exception e) {
            e.printStackTrace();
            return "保存失败";
        }
    }

}
