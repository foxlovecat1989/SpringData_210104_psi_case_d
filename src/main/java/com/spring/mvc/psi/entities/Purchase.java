package com.spring.mvc.psi.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "PURCHASE")
public class Purchase {
    
    @Id
    @GeneratedValue
    private Integer id;
    
    @Column
    private Integer price;
    
    @Column
    private Integer quantity;
    
    @Temporal(TemporalType.TIMESTAMP)
    // @Column
    private Date date = new Date();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Purchase{" + "id=" + id + ", price=" + price + ", quantity=" + quantity + ", date=" + date + '}';
    }

}
