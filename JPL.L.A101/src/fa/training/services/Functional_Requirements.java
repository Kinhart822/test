/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package fa.training.services;

import java.util.*;
import fa.training.entities.Book;
import fa.training.entities.Magazine;

public class Functional_Requirements {
	private List<Book> books;
    private List<Magazine> magazines;

    public Functional_Requirements() {
        this.books = new ArrayList<>();
        this.magazines = new ArrayList<>();
    }
    
    public List<Book> getBooks() {
        return books;
    }

    public List<Magazine> getMagazines() {
        return magazines;
    }

    // 1. Function to add a new book
    public void addBook(Book book) {
        this.books.add(book);
    }

    // 2. Function to add a new magazine
    public void addMagazine(Magazine magazine) {
        this.magazines.add(magazine);
    }

    // 3. Function to display the list of all books and magazines that have the same publication year and publisher
    public void displayBookPublications(int year, String publisher) {
        for (Book book : books) {
            if (book.getPublicationYear() == year && book.getPublisher().equals(publisher)) {
                book.display();
            }
        }
    }
    
    public void displayMagazinePublications(int year, String publisher) {
        for (Magazine magazine : magazines) {
            if (magazine.getPublicationYear() == year && magazine.getPublisher().equals(publisher)) {
                magazine.display();
            }
        }
    }

    // 4. Function to add an author to a specific book
    public void addAuthorToBook(String isbn, String author) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                if (book.getAuthor().equals(author)) {
                    System.out.println("Author existed");
                } else {
                    book.setAuthor(author);
                    System.out.println("Add successfully");
                }
            }
        }
        System.out.println("Book not found");
    }

    // 5. Function to display the list of top 10 magazines which have the largest volume
    public void displayTop10Magazines() {
    	Collections.sort(magazines, new Comparator<Magazine>() {
    	public int compare(Magazine m1, Magazine m2) {
    		return Integer.compare(m2.getVolume(), m1.getVolume());
    	}
    	});

    	// Display the top 10 magazines
    	System.out.println("Top 10 Magazines by Volume:");
    		for (int i = 0; i < magazines.size(); i++) {
    	        if (i == 10) break; 
    	        System.out.println((i + 1) + ". " + magazines.get(i).getAuthor() + ", Volume: " + magazines.get(i).getVolume());
    	    }
    	}

    // 6. Functions to search book by isbn, author, publisher
    public void searchBook(String searchCriteria, String searchValue) {	
        for (Book book : books) {
            switch (searchCriteria) {
                case "isbn":
                    if (book.getIsbn().equals(searchValue)) {
                        book.display();
                    }
                    break;
                case "author":
                    if (book.getAuthor().equals(searchValue)) {
                        book.display();
                    }
                    break;
                case "publisher":
                    if (book.getPublisher().equals(searchValue)) {
                        book.display();
                    }
                    break;
                default:
                    System.out.println("Invalid search criteria!");
                    return;
            }
        }
    }
}

