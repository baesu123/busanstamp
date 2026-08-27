package com.example.busanstamp.checkin;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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

    /**
     * 사용자의 전체 스탬프 상태
     */
    List<StampStatus> findStampStatusesByUserId(
            @Param("userId") Long userId
    );
}