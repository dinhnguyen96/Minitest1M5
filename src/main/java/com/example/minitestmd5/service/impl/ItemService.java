package com.example.minitestmd5.service.impl;

import com.example.minitestmd5.models.Item;
import com.example.minitestmd5.repository.ItemRepository;
import com.example.minitestmd5.service.iservice.IItem;
import jakarta.persistence.SecondaryTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ItemService implements IItem {
    @Autowired
    private ItemRepository itemRepository;
    @Override
    public List<Item> lists() {
        return itemRepository.findAll();
    }

    @Override
    public Item save(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public void delete(Long id) {
itemRepository.deleteById(id);
    }

    @Override
    public Optional<Item> findOne(Long id) {
        return itemRepository.findById(id);
    }
}
