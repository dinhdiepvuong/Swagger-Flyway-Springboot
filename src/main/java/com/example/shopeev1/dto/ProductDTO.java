package com.example.shopeev1.dto;

import lombok.*;

@Builder
@Setter@Getter
@AllArgsConstructor@NoArgsConstructor
public class ProductDTO {

    private Long id;
    private String name;
    private Float price;
    private String image;
    private String summary;
}
