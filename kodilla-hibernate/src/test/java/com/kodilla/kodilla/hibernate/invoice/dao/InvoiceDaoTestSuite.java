package com.kodilla.kodilla.hibernate.invoice.dao;

import com.kodilla.kodilla.hibernate.invoice.Item;
import com.kodilla.kodilla.hibernate.invoice.Product;
import com.kodilla.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    ItemDao itemDao;

    @Test
    public void testInvoiceDaoSave() {
        Product product1 = new Product("computer");
        Item item = new Item(new BigDecimal(200),2,new BigDecimal(200));
        product1.setItem(item);
        item.getProducts().add(product1);
        itemDao.save(item);
        itemDao.deleteAll();
    }
}
