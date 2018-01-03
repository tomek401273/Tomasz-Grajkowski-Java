package com.kodilla.kodilla.hibernate.invoice;

import com.kodilla.kodilla.hibernate.invoice.Product;
import com.kodilla.kodilla.hibernate.task.Task;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ITEM")
public class Item {
    private int id;
    private BigDecimal price;
    private int quantity;
    private BigDecimal value;
    private List<Product> products = new ArrayList<>();

    public Item() {
    }

    public Item( BigDecimal price, int quantity, BigDecimal value) {
        this.price = price;
        this.quantity = quantity;
        this.value = value;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID",unique = true)
    public int getId() {
        return id;
    }
    @Column(name = "PRICE")
    public BigDecimal getPrice() {
        return price;
    }

    @OneToMany(
            targetEntity = Product.class,
            mappedBy = "item",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    public List<Product> getProducts() {
        return products;
    }
    @Column(name = "QUANTITY")
    public int getQuantity() {
        return quantity;
    }
    @Column(name = "VALUE")
    public BigDecimal getValue() {
        return value;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
