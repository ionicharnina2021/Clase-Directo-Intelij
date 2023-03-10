package com.example.pruebahttp2306directo.modelo;

import lombok.Builder;

import java.util.Optional;

@Builder
public class ItemUpdateRequest {
    private Optional<String> description;
    private Optional<Boolean> cheked;

    public ItemUpdateRequest(Optional<String> description, Optional<Boolean> cheked) {
        this.description = description;
        this.cheked = cheked;
    }
    public void update(Item item){
        description.ifPresent((desc)->{item.setDescription(desc);});
        cheked.ifPresent((check)->{item.setChecked(check);});
    }
}
