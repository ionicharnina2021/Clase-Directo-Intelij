package com.example.pruebahttp2306directo.modelo;

import java.util.Optional;

public class ItemUpdateRequest {
    private Optional<String> description;
    private Optional<boolean> cheked;

    public ItemUpdateRequest(Optional<String> description, Optional<boolean> cheked) {
        this.description = description;
        this.cheked = cheked;
    }
    public void update(Item item){
        description.ifPresent((desc)->{item.setDescription(desc);});
        cheked.ifPresent((check)->{item.setChecked(check);});
    }
}
