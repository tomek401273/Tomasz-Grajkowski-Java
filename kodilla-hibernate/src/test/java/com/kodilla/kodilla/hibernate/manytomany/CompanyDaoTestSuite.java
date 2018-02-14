package com.kodilla.kodilla.hibernate.manytomany;

import com.kodilla.kodilla.hibernate.manytomany.Company;
import com.kodilla.kodilla.hibernate.manytomany.Employee;
import com.kodilla.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);

    }

    @Test
    public void testHowManyEmployEqualsSmith() {
        List<Employee> employees= employeeDao.retriveNameEmployeEqualLastname("Smith");

        Assert.assertEquals(1,employees.size());
    }

    @Test
    public void testHowManyCompaniesBeginNameWiithSof() {
        List<Company> companyList = companyDao.retriveCompanyBeginWithFirstLetter("Sof");
        for (Company company: companyList) {
            System.out.println(company.getName());
        }
        Assert.assertEquals(1, companyList.size());
    }


    @Test
    public void testHowManyCompaniesBeginNameWiithSof2() {
//        List<Company> companyList = companyDao.retriveCompanyWithContainLetter("%a%");
        List<Company> companyList = companyDao.retriveCompanyWithContainLetter("a");

        for (Company company: companyList) {
            System.out.println(company.getName());
        }
        Assert.assertEquals(3, companyList.size());
    }
//    @Test
//    public void testHowManyEmployWithFragmentName() {
//        List<Employee> employees = employeeDao.retriveEmploye("LASTNAME", "Smith");
//        System.out.println("Employy: " + employees.size());
////        for (Employee employee: employees) {
////            System.out.println(employee.toString());
////        }
//    }
//    @Test
//    public void testHowManyEmployWithFragmentName2() {
//        List<Employee> employees = employeeDao.retriveEmployeEqualsSmith("lastname");
//        System.out.println("Employy: " + employees.size());
////        for (Employee employee: employees) {
////            System.out.println(employee.toString());
////        }
//    }
}
