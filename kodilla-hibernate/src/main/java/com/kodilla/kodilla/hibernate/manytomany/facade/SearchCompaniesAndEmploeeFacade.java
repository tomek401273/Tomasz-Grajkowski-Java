package com.kodilla.kodilla.hibernate.manytomany.facade;

import com.kodilla.kodilla.hibernate.manytomany.Company;
import com.kodilla.kodilla.hibernate.manytomany.Employee;
import com.kodilla.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchCompaniesAndEmploeeFacade {
    private static final Logger LOGGER = LoggerFactory.getLogger(SearchCompaniesAndEmploeeFacade.class);
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;
    private boolean wasError = false;

    public void findCompayWithName(String companyFragmentName) throws OrderProcessingException {
        checkLengthFragmentName(companyFragmentName);
        try {
            LOGGER.info("Start searching in database company");
            List<Company> companyList = companyDao.retriveCompanyWithContainLetter(companyFragmentName);

            if (companyList.size() == 0) {
                LOGGER.error("In this database not exist company contain this: " + companyFragmentName + " fragment name");
            } else {
                LOGGER.info("Result searching: ");
                for (Company company : companyList) {
                    System.out.println(company.toString());
                }
                LOGGER.info("End");
            }

        } finally {
            somethingGoWrong(companyFragmentName);
        }

    }

    public void findEmployeeWithLetters(String employFragmentName) throws OrderProcessingException {
        checkLengthFragmentName(employFragmentName);
        try {
            LOGGER.info("Start searching in database employee");
            List<Employee> foundFirstNameEmployees = employeeDao.retriveEmployeeWithFirstNameContainLetters(employFragmentName);
            List<Employee> foundLastNameEmployees = employeeDao.retrieveEmployeeWithLastNameContainsLetters(employFragmentName);
            if (foundFirstNameEmployees.size() == 0 && foundLastNameEmployees.size() == 0) {
                LOGGER.error("In database employee not exist with this fragment name");
            } else {
                if (!foundFirstNameEmployees.isEmpty()) {
                    LOGGER.info("Found employee contains fragment name inside first name : ");
                    showEmployees(foundFirstNameEmployees);
                }
                if (!foundLastNameEmployees.isEmpty()) {
                    LOGGER.info("Found employee contains fragment name inside last name ");
                    showEmployees(foundLastNameEmployees);
                }
                LOGGER.info("End");
            }
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

    private void showEmployees(List<Employee> employees) {
      employees.stream()
              .forEach(System.out::println);
    }

    private void checkLengthFragmentName(String fragmentName) throws OrderProcessingException {
        if (fragmentName.length() == 0) {
            LOGGER.error(OrderProcessingException.ERR_TOO_SHORT_FRAGMENT_NAME);
            wasError = true;
            throw new OrderProcessingException(OrderProcessingException.ERR_TOO_SHORT_FRAGMENT_NAME);
        }
    }
}
