package com.example.pruebahttp3204;

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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean getChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", description=" + description + ", checked=" + checked + "]";
	}

}
