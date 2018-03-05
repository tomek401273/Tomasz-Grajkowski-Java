package com.kodilla.kodilla.hibernate.manytomany;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MapperEmployee {
    public Set<EmployDto> mapToDto(Set<Employee> employees) {
        Set<EmployDto> employDtos = new HashSet<>();
        for (Employee employee: employees) {
            EmployDto employDto= new EmployDto();
            employDto.setFirstname(employee.getFirstname());
            employDto.setId(employee.getId());
            employDto.setLastname(employee.getLastname());
            employDtos.add(employDto);
        }
        return employDtos;
    }

}
