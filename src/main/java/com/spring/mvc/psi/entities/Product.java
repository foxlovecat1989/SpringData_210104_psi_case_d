package com.spring.mvc.psi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT")
public class Product {
    
   @Id    
   @GeneratedValue
   private Integer id;
    
   @Column(name = "name", nullable = false, length = 50)
   private String name;
   
   @Column(name = "image", columnDefinition = "clob") // clob 大字串, blob 大二進位
   @Lob
   private String image; // base64 String for image

}
