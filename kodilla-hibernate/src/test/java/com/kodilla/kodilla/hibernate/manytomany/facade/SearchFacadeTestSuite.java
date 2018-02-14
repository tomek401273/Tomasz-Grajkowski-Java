package com.kodilla.kodilla.hibernate.manytomany.facade;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchFacadeTestSuite {
    @Autowired
    SearchCompaniesAndEmploeeFacade searchCompaniesAndEmploeeFacade;

    @Test
    public void testSearchCompany() {
        try {
            searchCompaniesAndEmploeeFacade.findCompayWithName("a");
        } catch (OrderProcessingException e) {
            System.out.println(e);
        }
    }
    @Test
    public void testSearchEmployee() throws OrderProcessingException {
        try{
            searchCompaniesAndEmploeeFacade.findCompayWithName("a");
        } catch (OrderProcessingException e) {
            System.out.println(e);
        }
    }
}
