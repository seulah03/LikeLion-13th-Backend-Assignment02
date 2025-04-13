package com.likelion.springprac.item.api;

import com.likelion.springprac.item.api.dto.ItemDto;
import com.likelion.springprac.item.application.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;

    @PostMapping("menu")
    public void save(@RequestBody ItemDto itemDto) {
        itemService.saveItem(itemDto);
    }

    @GetMapping("menu/{menu_id}")
    public ItemDto findItemById(@PathVariable long menu_id) {
        return itemService.findItemById(menu_id);
    }

    @GetMapping("menu")
    public List<ItemDto> findAllItem() {
        return itemService.findAllItems();
    }

    @PatchMapping("menu/{menu_id}")
    public void updateItemById(@PathVariable long menu_id, @RequestBody ItemDto itemDto) {
        itemService.updateItemById(menu_id, itemDto);
    }

    @DeleteMapping("menu/{menu_id}")
    public void deleteItemById(@PathVariable Long menu_id) {
        itemService.deleteItemById(menu_id);
    }
}
