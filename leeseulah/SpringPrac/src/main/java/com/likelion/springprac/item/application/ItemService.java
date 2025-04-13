package com.likelion.springprac.item.application;

import com.likelion.springprac.item.domain.Item;
import com.likelion.springprac.item.domain.ItemRepository;
import com.likelion.springprac.item.api.dto.ItemDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;

    private static Long sequence = 0L;

    public void saveItem(ItemDto requestDto) {
        Item item = Item.builder()
                .menu_id(++sequence)
                .name(requestDto.name())
                .price(requestDto.price())
                .build();

        itemRepository.save(item);
    }

    public ItemDto findItemById(Long menu_id) {
        Item item = itemRepository.findById(menu_id);
        if (item == null) {
            throw new IllegalArgumentException("해당하는 물건이 없습니다. menu_id = " + menu_id);
        }
        return toDto(item);
    }

    public List<ItemDto> findAllItems() {
        return itemRepository.findAll().stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    public Item updateItemById(Long menu_id, ItemDto requestDto) {
        Item item = itemRepository.findById(menu_id);
        if (item == null) {
            throw new IllegalArgumentException("해당하는 물건이 없습니다. menu_id = " + menu_id);
        }

        item.update(requestDto.name(), requestDto.price());
        itemRepository.updateById(menu_id, item);
        return item;
    }

    public void deleteItemById(Long menu_id) {
        itemRepository.deleteById(menu_id);
    }

    private ItemDto toDto(Item item) {
        return ItemDto.builder()
                .menu_id(item.getMenu_id())
                .name(item.getName())
                .price(item.getPrice())
                .build();
    }
}
