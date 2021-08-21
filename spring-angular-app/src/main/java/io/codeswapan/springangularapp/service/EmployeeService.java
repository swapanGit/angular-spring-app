package io.codeswapan.springangularapp.service;

import io.codeswapan.springangularapp.model.Employee;
import io.codeswapan.springangularapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService{

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee e) {
        return employeeRepository.save(e);
    }

    public void deleteEmployee(Integer id) {
        employeeRepository.deleteById(id);
    }

    public Optional<Employee> getEmployee(Integer id) {
        return employeeRepository.findById(id);
    }

    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }
}
