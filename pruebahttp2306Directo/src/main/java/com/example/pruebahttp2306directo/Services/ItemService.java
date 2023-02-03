package com.example.pruebahttp2306directo.Services;

import com.example.pruebahttp2306directo.modelo.Item;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

@Service
public class ItemService {
    private Map<Long, Item> items = new ConcurrentHashMap<>();
    private AtomicLong lastId = new AtomicLong();

    public ItemService() {
       addItem(new Item(1,"cosas"));
    }

    public Item addItem(Item item){
        long id=lastId.incrementAndGet();
        item.setId(id);
        items.put(id,item);
        return item;
    }

    public Optional<Item> findItemById(Long id){
        return Optional.ofNullable(items.get(id));
    }

    public List<Item> findAll(){
        return items.values().stream().collect(Collectors.toList());
    }
}
