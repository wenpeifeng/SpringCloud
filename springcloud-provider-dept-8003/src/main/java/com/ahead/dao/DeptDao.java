package com.ahead.dao;

import ahead.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository  // 用在持久层类上，表示创建dao对象，dao对象是能够访问数据库的
public interface DeptDao {

    /** Dept类是通过maven依赖引入进来的，是springcloud-api模块里的类 */

    public boolean addDept(Dept dept);

    public Dept queryById(int id);

    public List<Dept> queryAll();
}
