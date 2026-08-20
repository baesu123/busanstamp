package com.example.busanstamp.kakao.dto;

import java.util.List;

public record KakaoPlaceSearchResult(
        int totalCount,
        int pageableCount,
        boolean end,
        List<KakaoPlaceResponse> places
) {
}