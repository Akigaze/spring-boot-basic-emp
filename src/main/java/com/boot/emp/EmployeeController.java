package com.boot.emp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/emp")
    public void update(@RequestBody Employee emp){
        employeeService.updateEmp(emp);
    }

    @PatchMapping("/emp")
    public void addEmp(@RequestBody Employee emp){
        employeeService.add(emp);
    }
}
