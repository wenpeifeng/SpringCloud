package com.ahead.controller;

import ahead.pojo.Dept;
import com.ahead.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * RestController：
 *  无法返回jsp或html，配置的视图解析器InternalResourceViewResolver不起作用，
 *  返回的内容就是Return 里的内容。
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    // @PostMapping @RequestMapping的post请求方法，限制该方法只能通过post形式访问
    @PostMapping("/dept/insertDept")
    public boolean insertDept(Dept dept){
        return deptService.addDept(dept);
    }

    /**
     * @PathVariable: 映射 URL 绑定的占位符
     *    将URL中占位符参数绑定到控制器处理方法的入参中:URL 中的 /someUrl/{xxx} 占位符可以通过
     *    @PathVariable(“xxx”) 绑定到操作方法的入参中。
     */
    @GetMapping("/dept/selectDept/{id}")
    public Dept selectDept(@PathVariable("id") int id){
        return deptService.queryById(id);
    }

    @GetMapping("/dept/selectDeptList")
    public List<Dept> selectDeptList(){
        return deptService.queryAll();
    }
}
