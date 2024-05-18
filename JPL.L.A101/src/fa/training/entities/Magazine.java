/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package fa.training.entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Magazine extends Publication {
	private String author;
	private int volume;
	private int edition;

	// Constructor
	public Magazine(int publicationYear, String publisher, String publicationDate, String author, int volume, int edition) {
		super(publicationYear, publisher, publicationDate);
	    this.author = author;
	    this.volume = volume;
	    this.edition = edition;
	}

	// Getters 
	public String getAuthor() {
		return author;
	}
	public int getVolume() {
		return volume;
	}
	public int getEdition() {
		return edition;
	}
	
	 // Setters
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public void setEdition(int edition) {
		this.edition = edition;
	}
	
	// Override display() method 
	 @Override
	 public void display() {
		String strDate = getPublicationDate();
			Date date;
			try {
				date = new SimpleDateFormat("dd/mm/yyyy").parse(strDate);
				System.out.println("Publication Year: " + getPublicationYear() + ",\n Publisher: " + getPublisher() + ",\n Publication Date:  " + date);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		System.out.println("Author: " + author + ",\n Volumn: " + volume + ",\n Edition: " + edition);
	 }
		
}
