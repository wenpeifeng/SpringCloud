package com.ahead.controller;

import ahead.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptConsumerController {

    // RestTemplate提供多种便捷访问远程http服务的方法，简单的Restful服务模板~
    @Autowired
    private RestTemplate restTemplate;

    /**
     * 正常我们远程访问一个项目地址是：
     * http://localhost:8001/dept/selectDept/1   通过部门id获取部门信息
     * http://localhost:8001/dept/selectDeptList 查询全部部门信息
     */
    // 拼接前缀地址
    private static final String REST_URL_PREFIX = "http://localhost:8001";

    // 消费方添加部门信息
    @RequestMapping("/consumer/dept/addDept")
    public boolean getDept(Dept dept) {
        /** 添加是一个post请求，因此需要使用postForObject
         * （消费者也可通过get方式，消费端随意写，但服务端能不能够识别到，就是另外一回事了）
         * @param1: url（服务提供者模块里controller的添加方法访问路径）
         * @param2: 入参dept
         * @param3: 返回类型
         */
        return restTemplate.postForObject(REST_URL_PREFIX + "/dept/insertDept", dept, Boolean.class);
    }

    // 消费方根据id查询部门信息
    @RequestMapping("/consumer/dept/getDept/{id}")
    public Dept getDept(@PathVariable("id") int id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/selectDept/" + id, Dept.class);
    }

    // 消费方查询部门信息列表
    @RequestMapping("/consumer/dept/getAllDept")
    public List<Dept> getDept() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/selectDeptList", List.class);
    }
}
