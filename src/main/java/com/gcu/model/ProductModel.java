/**
 * 
 */
package com.gcu.model;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * @author User
 *
 */
public class ProductModel {
	
	private String name;
	private String description;
	private int qty;
	private double price;
	private int itemNumer;

	public ProductModel(String name, String description, int qty, double price, int itemNumer) {
		super();
		this.name = name;
		this.description = description;
		this.qty = qty;
		this.price = price;
		this.itemNumer = itemNumer;
	}
	
	


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		description = description;
	}
	/**
	 * @return the qty
	 */
	public int getQty() {
		return qty;
	}
	/**
	 * @param qty the qty to set
	 */
	public void setQty(int qty) {
		this.qty = qty;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * @return the itemNumer
	 */
	public int getItemNumer() {
		return itemNumer;
	}
	/**
	 * @param itemNumer the itemNumer to set
	 */
	public void setItemNumer(int itemNumer) {
		this.itemNumer = itemNumer;
	}
	@Override
	public String toString() {
		return "ProductModel [name=" + name + ", description=" + description + ", qty=" + qty + ", price=" + price
				+ ", itemNumer=" + itemNumer + "]";
	}
	
}
	
	