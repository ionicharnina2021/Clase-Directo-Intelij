package com.example.pruebahttp2306directo.modelo;

import lombok.Data;

import java.util.Objects;

@Data
public class Item {

	private long id = -1;
	private String description;
	private boolean checked=false;

	public Item() {
	}

	public Item(long id, String description) {
		this.id = id;
		this.description = description;
	}

	public Item(long id, String description, boolean checked) {
		this.id = id;
		this.description = description;
		this.checked = checked;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Item)) return false;
		Item item = (Item) o;
		return description.equals(item.description);
	}

	@Override
	public int hashCode() {
		return Objects.hash(description);
	}
}
