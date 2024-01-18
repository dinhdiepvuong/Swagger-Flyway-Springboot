package com.example.shopeev1.data;

import jakarta.persistence.*;
import lombok.*;

@Data
@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "product_name", nullable = false)
    private String name;

    private Float price;

    private String image;

    private String summary;


}
