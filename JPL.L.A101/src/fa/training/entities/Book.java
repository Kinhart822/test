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

public class Book extends Publication {
	private String isbn;
    private String author;
    private String publicationPlace;

    // Constructor
    public Book(int publicationYear, String publisher, String publicationDate, String isbn, String author, String publicationPlace) {
        super(publicationYear, publisher, publicationDate);
        this.isbn = isbn;
        this.author = author;
        this.publicationPlace = publicationPlace;
    }

    // Getters
    public String getIsbn() {
		return isbn;
	}
    public String getAuthor() {
		return author;
	}
    public String getPublicationPlace() {
		return publicationPlace;
	}
   
    // Setters
    public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPublicationPlace(String publicationPlace) {
		this.publicationPlace = publicationPlace;
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
		System.out.println("Isbn: " + isbn + ",\n Author: " + author + ",\n Publication Place: " + publicationPlace);
	}

}
