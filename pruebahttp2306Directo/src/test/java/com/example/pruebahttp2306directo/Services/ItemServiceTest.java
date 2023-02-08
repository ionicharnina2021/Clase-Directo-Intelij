package com.example.pruebahttp2306directo.Services;

import com.example.pruebahttp2306directo.modelo.Item;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ItemServiceTest {

    @Test
    void getItems() {
        Item item1=new Item(2,"cosa",true);
        Item item2=new Item(3,"cosa3",true);
        //prohibidismo pero de momento somos pobres
        ItemService itemService=new ItemService();
        Map<Long, Item> items=itemService.getItems();
        itemService.addItem(item1);
        assertTrue(items.containsValue(item1));
        assertFalse(items.containsValue(item2));
    }
}