package com.offcn.dao;

import com.offcn.pojo.Person;
import org.springframework.data.jpa.repository.JpaRepository;

// 第一个泛型：表示该接口需要操作的 类 类型
// 第二泛型：表示该类 的主键 的类型
public interface PersonDao extends JpaRepository<Person, Long> {


}
