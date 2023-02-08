package com.example.pruebahttp2306directo.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    @Test
    void testEquals() {
        Item item1=new Item(1,"cosa",true);
        Item item2=new Item(2,"cosa",true);
        assertTrue(item1.equals(item2));
        Item item3=new Item(1,"cosasa",true);
        assertFalse(item1.equals(item3));
    }
}