package com.kodilla.kodilla.hibernate.manytomany.facade;

import com.kodilla.kodilla.hibernate.manytomany.Company;
import com.kodilla.kodilla.hibernate.manytomany.EmployDto;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchFacadeTestSuite {
    @Autowired
    SearchCompaniesAndEmploeeFacade searchCompaniesAndEmploeeFacade;

    @Test
    public void testSearchCompany() {
        List<Company> companyList = new ArrayList<>();
        try {
            companyList = searchCompaniesAndEmploeeFacade.findCompayWithName("a");
        } catch (OrderProcessingException e) {
            System.out.println(e);
        }
        Assert.assertEquals(3,companyList.size());
    }

    @Test
    public void testSearchEmployee() throws OrderProcessingException {
        Set<EmployDto> found = new HashSet<>();
        try {
          found = searchCompaniesAndEmploeeFacade.findEmployeeWithLetters("a");
        } catch (OrderProcessingException e) {
            System.out.println(e);
        }
        Assert.assertEquals(2,found.size());
    }
}
