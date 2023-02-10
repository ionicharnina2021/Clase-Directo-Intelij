package com.example.pruebahttp2306directo.modelo;

import java.util.Optional;

public class ItemUpdateRequestMapper implements Mapper<ItemUpdateRequest,Item>{
    @Override
    public ItemUpdateRequest map(Item item) {
        return ItemUpdateRequest.builder().description(Optional.of(item.getDescription())).cheked(Optional.of(item.isChecked())).build();
    }
}
