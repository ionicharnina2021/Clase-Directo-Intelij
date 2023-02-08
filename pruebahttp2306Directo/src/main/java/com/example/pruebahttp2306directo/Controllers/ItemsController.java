package com.example.pruebahttp2306directo.Controllers;

import com.example.pruebahttp2306directo.Services.ItemService;
import com.example.pruebahttp2306directo.modelo.Item;
import com.example.pruebahttp2306directo.modelo.ItemUpdateRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.net.ssl.SSLSession;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional;


@RestController
@Slf4j
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

    @GetMapping("/comienzo")
    public Item findStartingWith(@RequestParam String inicial,@RequestParam String terminal,
    @RequestParam Item item){
        log.info("incial "+inicial);
        log.info("terminal "+terminal);
        log.info("item "+item.toString());
        return itemService.getItemsStartWith(inicial);
    }
    @PutMapping("/{id}")
    public void updateItem(@PathVariable Long id, @RequestBody ItemUpdateRequest itemUpdate){

    }
    @GetMapping("/{id}")
    public ResponseEntity<Item> getItem(@PathVariable Long id){
        Optional<Item> item=itemService.findItemById(id);
        if(item.isPresent())
            return new ResponseEntity<>(item.get(), HttpStatus.OK);
        return new ResponseEntity<>(new Item(0,""),HttpStatus.OK);
    }
    //hasta ahora http://localhost:8080/items
    @PostMapping("/")
    public ResponseEntity<Item> addItem(@RequestBody Item item){
        Optional<Item> item1 = itemService.addItem(item);
        if(item1.isPresent()) return new ResponseEntity<Item>(item1.get(),HttpStatus.OK);
        return  new ResponseEntity<Item>(HttpStatus.UNAUTHORIZED);
    }
}



