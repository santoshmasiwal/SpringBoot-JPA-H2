package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.EmployeeRepoistory;
import com.example.model.Employee;

@RestController
public class EmployeeController {
  
  @Autowired
  private EmployeeRepoistory repoistory;
  
  @PostMapping("/saveEmployee")
  public String saveEmployee(@RequestBody Employee employee)
  {
    repoistory.save(employee);
    return "Employee saved";
    
  }
  
  @GetMapping("/getAllEmployees")
  public List<Employee> getAll()
  {
    return repoistory.findAll();
  }
  
  @GetMapping("/getEmployee/{dept}")
  public List<Employee> getEmployeesByDept(@PathVariable String dept)
  {
    return repoistory.findByDept(dept);
  }

}
