package com.likelion.springprac.item.api.dto;

import lombok.Builder;

@Builder
public record ItemDto(
        Long menu_id,
        String name,
        Long price
) {
}
