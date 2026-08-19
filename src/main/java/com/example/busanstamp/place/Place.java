package com.example.busanstamp.place;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class Place {

    private Long placeId;

    private String name;
    private String description;
    private String address;

    private BigDecimal latitude;
    private BigDecimal longitude;

    private String category;
    private String imageUrl;

    private Long createdBy;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}