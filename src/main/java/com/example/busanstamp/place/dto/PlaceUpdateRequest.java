package com.example.busanstamp.place.dto;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

public record PlaceUpdateRequest(

        @NotBlank(message = "장소 이름을 입력해주세요.")
        @Size(max = 100)
        String name,

        @Size(max = 2000)
        String description,

        @NotBlank(message = "주소를 입력해주세요.")
        @Size(max = 255)
        String address,

        @NotNull(message = "위도를 입력해주세요.")
        @DecimalMin("-90.0")
        @DecimalMax("90.0")
        BigDecimal latitude,

        @NotNull(message = "경도를 입력해주세요.")
        @DecimalMin("-180.0")
        @DecimalMax("180.0")
        BigDecimal longitude,

        @NotBlank(message = "카테고리를 입력해주세요.")
        @Size(max = 50)
        String category,

        @Size(max = 500)
        String imageUrl
) {
}