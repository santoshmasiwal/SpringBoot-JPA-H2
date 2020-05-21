package com.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Employee;

public interface EmployeeRepoistory extends JpaRepository<Employee, Integer>{

  List<Employee> findByDept(String dept);

}
