package com.coding.springjpa.jpalearn.entities;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="product_table",
        uniqueConstraints ={
        @UniqueConstraint(name = "title_price_uniq",columnNames ={"title_s","price"})
        },
        indexes = {
        @Index(name="sku_ind",columnList = "sku")
        })
public class ProductEntity {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,length=20)
    private String sku;

    @Column(name="title_s")
    private String title;

    private BigDecimal price;

    private Integer quantity;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;
}
