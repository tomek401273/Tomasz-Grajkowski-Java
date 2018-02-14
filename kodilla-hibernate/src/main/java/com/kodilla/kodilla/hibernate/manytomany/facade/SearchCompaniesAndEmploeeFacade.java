package com.kodilla.kodilla.hibernate.manytomany.facade;

import com.kodilla.kodilla.hibernate.manytomany.Company;
import com.kodilla.kodilla.hibernate.manytomany.dao.CompanyDao;
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

    public void findCompayWithName(String companyFragmentName) throws OrderProcessingException {
        boolean wasError = false;
//        List<Company> companyList = companyDao.retriveCompanyBeginWithFirstLetter()
    }
}
