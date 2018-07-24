package com.boot.emp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    private List<Employee> emps;

    {
        emps.add(new Employee(1,"Mark",12,"man"));
        emps.add(new Employee(2,"Jane",10,"woman"));

    }

    @GetMapping("/emp")
    public List<Employee> selectAll(){
        return this.emps;
    }
}
