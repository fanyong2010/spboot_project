package com.offcn.controller;

import com.offcn.pojo.User;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private List<User> list = new ArrayList<>();

    @PostMapping("/")
    @ApiOperation(value="新增用户", notes="用户模块插入用户")
    @ApiImplicitParam(name = "user", value = "封装用户信息的实体对象", required = true, dataType = "com.offcn.pojo.User")
    public List<User> add(@RequestBody User user) {
        list.add(user);
        return list;
    }

    @GetMapping("/")
    public List<User> getAll() {
        return list;
    }

    @GetMapping("/{id}")
    @ApiOperation(value="获取指定id用户信息", notes="根据id获取单个用户信息")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Integer")
    public User getOne(@PathVariable("id") Integer id) {
        for (User user : list) {
            if(user.getId() == id.intValue()) {
                return user;
            }
        }
        return null;
    }


    @PutMapping("/")
    public void update(@RequestBody User user) {
        for (User temp : list) {
            if(temp.getId() == user.getId()) {
                temp.setAge(user.getAge());
                temp.setGender(user.getGender());
                temp.setName(user.getName());
            }
        }
    }


    @DeleteMapping("/{id}")
    public List<User> delete(@PathVariable("id") Integer id) {
        List<User> newList = new ArrayList<>();
        for (User temp : list) {
            if(temp.getId() != id.intValue()) {
               newList.add(temp);
            }
        }
        list = newList;

        return list;
    }

}
