package com.likelion.springprac.item.domain;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class MemoryItemRepository implements ItemRepository {
    private static Map<Long, Item> database = new HashMap<>();

    @Override
    public void save(Item item) {
        database.put(item.getMenu_id(), item);
    }

    @Override
    public Item findById(Long menu_id) {
        return database.get(menu_id);
    }

    @Override
    public List<Item> findAll() {
        return database.values().stream().toList();
    }

    @Override
    public void updateById(Long menu_id, Item item) {
        database.put(menu_id, item);
    }

    @Override
    public void deleteById(Long id) {
        database.remove(id);
    }
}
