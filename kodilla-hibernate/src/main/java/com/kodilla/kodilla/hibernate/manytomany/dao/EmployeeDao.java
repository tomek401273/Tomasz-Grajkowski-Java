package com.kodilla.kodilla.hibernate.manytomany.dao;

import com.kodilla.kodilla.hibernate.manytomany.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Set;

public interface EmployeeDao extends CrudRepository<Employee, Integer> {
    @Query
    List<Employee> retriveNameEmployeEqualLastname(@Param("LASTNAME") String lastname);

//    @Query(nativeQuery = true)
//    List<Employee> retriveEmployeeWithFirstNameContainLetters(@Param("LETTERS") String letters);
//
//    @Query(nativeQuery = true)
//    List<Employee> retrieveEmployeeWithLastNameContainsLetters(@Param("LETTERS") String letters);

    @Query(nativeQuery = true)
    Set<Employee> retriveEmployeeWithFirstNameContainLetters(@Param("LETTERS") String letters);

    @Query(nativeQuery = true)
    Set<Employee> retrieveEmployeeWithLastNameContainsLetters(@Param("LETTERS") String letters);

}
