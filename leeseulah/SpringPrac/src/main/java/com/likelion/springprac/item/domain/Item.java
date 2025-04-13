package com.likelion.springprac.item.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Item {

    private Long menu_id;
    private String name;
    private Long price;

    @Builder
    public Item(Long menu_id, String name, Long price) {
        this.menu_id = menu_id;
        this.name = name;
        this.price = price;
    }

    public void update(String name, Long price) {
        this.name = name;
        this.price = price;
    }
}
