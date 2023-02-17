package com.example.pruebahttp2306directo.Controllers;

import com.example.pruebahttp2306directo.Services.ItemService;
import com.example.pruebahttp2306directo.Services.PersonaService;
import com.example.pruebahttp2306directo.modelo.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@Slf4j
//hasta ahora http://localhost:8080
@RequestMapping("/items")
//hasta ahora http://localhost:8080/items
public class ItemsController {

    private final ItemService itemService;
    private final PersonaService personaService;

    public ItemsController(ItemService itemService, PersonaService personaService) {
        this.itemService = itemService;
        this.personaService = personaService;
    }

    @GetMapping("/all")
    //hasta ahora http://localhost:8080/items/all
    public List<Item> findAll() {
        return itemService.findAll();
    }

    @GetMapping("/comienzo")
    public Item findStartingWith(@RequestParam String inicial, @RequestParam String terminal,
                                 @RequestParam Item item) {
        log.info("incial " + inicial);
        log.info("terminal " + terminal);
        log.info("item " + item.toString());
        return itemService.getItemsStartWith(inicial);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ItemUpdateRequest> updateItem(@PathVariable Long id, @RequestBody ItemUpdateRequest itemUpdate) {
        if (itemService.contains(id)) {
            return new ResponseEntity<ItemUpdateRequest>(new ItemUpdateRequestMapper().map(itemService.findItemById(id).get()), HttpStatus.OK);
        }
        return new ResponseEntity<ItemUpdateRequest>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Item> getItem(@PathVariable Long id) {
        Optional<Item> item = itemService.findItemById(id);
        if (item.isPresent())
            return new ResponseEntity<>(item.get(), HttpStatus.OK);
        return new ResponseEntity<>(new Item(0, ""), HttpStatus.OK);
    }

    //hasta ahora http://localhost:8080/items
    @PostMapping("/")
    public ResponseEntity<Item> addItem(@RequestBody Item item) {
        return  itemService.addItem(item)
               .map((it1)->{return new ResponseEntity<Item>(it1,HttpStatus.OK);})
               .orElse(new ResponseEntity<Item>(HttpStatus.UNAUTHORIZED));
    }

    @GetMapping("/contractDetail/{id}")
    public ResponseEntity<ContratoDetailDTO> getContratoDetailByPersona(@PathVariable Long id) {
            return new ResponseEntity<ContratoDetailDTO> (new ContratoDetailDTOMapper().map(personaService.findPErsonaById(id).get()),HttpStatus.OK);
    }
    @GetMapping("/socios/{id}")
    public ResponseEntity<SocioDTO> getSocioDetailByPersona(@PathVariable Long id) {
            return new ResponseEntity<SocioDTO> (personaService.findPersonaById(id),HttpStatus.OK);
    }
}



