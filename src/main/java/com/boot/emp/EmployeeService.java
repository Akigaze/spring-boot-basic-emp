package com.boot.emp;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    private List<Employee> emps=new ArrayList<>();

    {
        emps.add(new Employee(1,"Mark",12,"man"));
        emps.add(new Employee(2,"Jane",10,"woman"));

    }

    public EmployeeService() {

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

    public Employee getEmpById(int id) {
        return this.emps.stream().filter(emp->emp.getId()==id).findFirst().get();
    }

    public List<Employee> getEmpList() {
        return this.emps;
    }

    public void updateEmp(Employee emp) {
        Employee e=getEmpById(emp.getId());
        e.setAge(emp.getAge());
        e.setName(emp.getName());
        e.setGender(emp.getGender());
    }

    public void add(Employee emp) {
        emps.add(emp);
    }
}
