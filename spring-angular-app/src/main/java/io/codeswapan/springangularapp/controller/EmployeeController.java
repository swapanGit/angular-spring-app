package io.codeswapan.springangularapp.controller;

import io.codeswapan.springangularapp.model.Employee;
import io.codeswapan.springangularapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/emp")
@CrossOrigin("http://localhost:4200")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/saveemp")
    public ResponseEntity<Integer> saveEmployee(@RequestBody Employee e) {
        Employee e1 = employeeService.saveEmployee(e);
        return ResponseEntity.ok(e1.getEmpid());
    }

    @PutMapping("/updateemp")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee e) {
        return ResponseEntity.ok(employeeService.saveEmployee(e));
    }

    @GetMapping("/allemp")
    public ResponseEntity<List<Employee>> findAll() {
        return ResponseEntity.ok(employeeService.getAllEmployee());
    }

    @GetMapping("/findemp/{id}")
    public ResponseEntity<Optional<Employee>> findEmployee(@PathVariable Integer id) {
        return ResponseEntity.ok(employeeService.getEmployee(id));
    }

    @DeleteMapping("/deleteemp/{id}")
    public ResponseEntity<Integer> deleteEmployee(@PathVariable Integer id) {
        employeeService.deleteEmployee(id);
        return ResponseEntity.ok(id);
    }

}
