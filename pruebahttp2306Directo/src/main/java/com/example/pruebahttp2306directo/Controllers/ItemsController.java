package com.example.pruebahttp2306directo.Controllers;

import com.example.pruebahttp2306directo.Services.ItemService;
import com.example.pruebahttp2306directo.modelo.Item;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

//hasta ahora http://localhost:8080
@RequestMapping("/items")
//hasta ahora http://localhost:8080/items
public class ItemsController {

    private final ItemService itemService;

    public ItemsController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/all")
    //hasta ahora http://localhost:8080/items/all
    public List<Item> findAll(){
        return itemService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Item> getItem(@PathVariable Long id){
        Optional<Item> item=itemService.findItemById(id);
        if(item.isPresent())
        return new ResponseEntity<>(item.get(), HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    //hasta ahora http://localhost:8080/items
    @PostMapping("/")
    public Item addItem(@RequestBody Item item){
        return itemService.addItem(item);
    }
}



