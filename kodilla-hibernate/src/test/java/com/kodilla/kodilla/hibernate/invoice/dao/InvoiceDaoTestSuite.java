package com.kodilla.kodilla.hibernate.invoice.dao;

import com.kodilla.kodilla.hibernate.invoice.Invoice;
import com.kodilla.kodilla.hibernate.invoice.Item;
import com.kodilla.kodilla.hibernate.invoice.Product;
import com.kodilla.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    private int idItemTest = 0;
    @Autowired
    ItemDao itemDao;

    @Autowired
    InvoiceDao invoiceDao;

    @After
    public void testdelete() {
        if (idItemTest != 0) {
            invoiceDao.delete(idItemTest);
        }
    }

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("Computer");
        Product product2 = new Product("Mouse");
        Product product3 = new Product("Monitor");

        Item item1 = new Item(product1, new BigDecimal(2000), 10, new BigDecimal(2000));
        Item item2 = new Item(product2, new BigDecimal(12), 3, new BigDecimal(10));
        Item item3 = new Item(product3, new BigDecimal(220), 6, new BigDecimal(200));

        Invoice invoice = new Invoice("1234");
        List<Item> itemList = new ArrayList<>();
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        invoice.setItems(itemList);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();
        idItemTest = id;

        //Then
        Assert.assertNotEquals(0, id);

    }

}
