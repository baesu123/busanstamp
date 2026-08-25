package com.example.busanstamp.checkin;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CheckinMapper {

    int existsByUserAndPlace(
            @Param("userId")
            Long userId,

            @Param("placeId")
            Long placeId
    );


    int save(
            Checkin checkin
    );
}