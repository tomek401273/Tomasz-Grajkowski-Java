package com.kodilla.kodilla.hibernate.manytomany.facade;

import com.kodilla.kodilla.hibernate.manytomany.Company;
import com.kodilla.kodilla.hibernate.manytomany.EmployDto;
import com.kodilla.kodilla.hibernate.manytomany.Employee;
import com.kodilla.kodilla.hibernate.manytomany.MapperEmployee;
import com.kodilla.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class SearchCompaniesAndEmploeeFacade {
    private static final Logger LOGGER = LoggerFactory.getLogger(SearchCompaniesAndEmploeeFacade.class);
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;
    private boolean wasError = false;

    public List<Company> findCompayWithName(String companyFragmentName) throws OrderProcessingException {
        checkLengthFragmentName(companyFragmentName);
        List<Company> companyList = new ArrayList<>();
        try {
            LOGGER.info("Start searching in database company");
            companyList = companyDao.retriveCompanyWithContainLetter(companyFragmentName);

            if (companyList.size() == 0) {
                LOGGER.error("In this database not exist company contain this: " + companyFragmentName + " fragment name");
                return companyList;

            } else {
                LOGGER.info("Result searching: ");
                for (Company company : companyList) {
                    System.out.println(company.toString());
                }
                LOGGER.info("End");
                return companyList;
            }
        } finally {
            somethingGoWrong(companyFragmentName);
        }
    }

    public Set<EmployDto> findEmployeeWithLetters(String employFragmentName) throws OrderProcessingException {
        checkLengthFragmentName(employFragmentName);
        MapperEmployee mapperEmployee = new MapperEmployee();
        try {
            LOGGER.info("Start searching in database employee");
            Set<EmployDto> foundEmployees = new HashSet<>();
            Set<EmployDto> foundFirstName = mapperEmployee.mapToDto(employeeDao.retriveEmployeeWithFirstNameContainLetters(employFragmentName));
            Set<EmployDto> foundLastName = mapperEmployee.mapToDto(employeeDao.retrieveEmployeeWithLastNameContainsLetters(employFragmentName));

            foundEmployees.addAll(foundFirstName);
            foundEmployees.addAll(foundLastName);

            if (foundEmployees.isEmpty()) {
                LOGGER.error("In database employee not exist with this fragment name");
            } else {
                LOGGER.info("Found employee contains fragment name inside first name or last name : ");
                foundEmployees.stream()
                        .forEach(System.out::println);
                LOGGER.info("End");
            }
            return foundEmployees;
        } finally {
            somethingGoWrong(employFragmentName);
        }
    }


    private void somethingGoWrong(String fragmentName) {
        if (wasError) {
            LOGGER.info("Something something was wrong and ");
            LOGGER.info("Cancelling searching " + fragmentName);
            wasError = false;
        }
    }


    private void checkLengthFragmentName(String fragmentName) throws OrderProcessingException {
        if (fragmentName.length() == 0) {
            LOGGER.error(OrderProcessingException.ERR_TOO_SHORT_FRAGMENT_NAME);
            wasError = true;
            throw new OrderProcessingException(OrderProcessingException.ERR_TOO_SHORT_FRAGMENT_NAME);
        }
    }
}
