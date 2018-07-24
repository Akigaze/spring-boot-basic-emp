package com.boot.emp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> selectAll(){
        return employeeService.getEmpList();
    }
    @GetMapping("/employees/{id}")
    public Employee selectById(@PathVariable int id){
        return employeeService.getEmpById(id);
    }

    @PutMapping("/employees")
    public void update(@RequestBody Employee emp){
        employeeService.updateEmp(emp);
    }

    @PostMapping("/employees")
    public void addEmp(@RequestBody Employee emp){
        employeeService.add(emp);
    }
    @DeleteMapping("/employees")
    public void deleteEmp(@RequestBody int id){
        employeeService.deleteById(id);
    }
}
