package org.lessons.java.shop;

public class Prodotto {
	private int code;
	private String name;
	private String description;
	private float price;
	private int iva;
	
	public Prodotto(int code, String name, String description, float price, int iva) {
		setCode(code);
		setName(name);
		setDescription(description);
		setPrice(price);
		setIva(iva);
		
	}
	
	public int getCode() {
		return code;
	}
	private void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getIva() {
		return iva;
	}
	public void setIva(int iva) {
		this.iva = iva;
	}
	
	public float getFullPrice() {
		return getPrice() * (100 + iva) / 100;
	}
	public String getFormattedCode() {
		return  String.format("%09d", code);
	}
	
	public String getFullName() {
		return getName() + "-" + getFormattedCode();
	}
	@Override
	public String toString() {
		
		return "Prodotto :\n"
				+ "code: " + getFormattedCode() + "\n"
				+ "nome: " + getName() + "\n"
				+ "descrizione: " + getDescription() + "\n"
				+ "prezzo: " + String.format("%.02f", getPrice()) + "€\n"
				+ "iva: " + getIva() + "%\n"
				+ "il prezzo comprensivo di iva e': " + String.format("%.02f", getFullPrice()) +"€\n"
				+ "il nome completo di codice e': " + getFullName() + "\n\n";
	}
	
}
