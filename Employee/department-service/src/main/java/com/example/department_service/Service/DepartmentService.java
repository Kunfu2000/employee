package com.example.department_service.Service;

import com.example.department_service.Entity.Department;
import com.example.department_service.Repository.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartmentService {

    private final DepartmentRepository departmentRepository;

    //save method
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    //return method for department list
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }


}
