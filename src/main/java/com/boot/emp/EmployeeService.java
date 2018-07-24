package com.boot.emp;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    private List<Employee> emps=new ArrayList<>();

    {
        emps.add(new Employee(1,"Mark",12,"man"));
        emps.add(new Employee(2,"Jane",10,"woman"));

    }

    public EmployeeService(List<Employee> emps) {
        this.emps = emps;
    }

    public List<Employee> getEmps() {
        return emps;
    }

    public void setEmps(List<Employee> emps) {
        this.emps = emps;
    }

    public List<Employee> getEmpById(String s) {
        return this.emps;
    }
}
