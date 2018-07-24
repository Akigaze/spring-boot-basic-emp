package com.boot.emp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/emp")
    public List<Employee> selectAll(){
        return employeeService.getEmpList();
    }
    @GetMapping("/emp/{id}")
    public Employee selectById(@PathVariable int id){
        return employeeService.getEmpById(id);
    }
}
