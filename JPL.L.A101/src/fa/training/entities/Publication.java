/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package fa.training.entities;

abstract class Publication {
	private int publicationYear;
    private String publisher;
    private String publicationDate;
    
    // 	Constructor
    public Publication(int publicationYear, String publisher, String publicationDate) {
        this.publicationYear = publicationYear;
        this.publisher = publisher;
        this.publicationDate = publicationDate;
    }

    //	Getters  
    public int getPublicationYear() {
		return publicationYear;
	}
    public String getPublisher() {
    	return publisher;
    }
    public String getPublicationDate() {
		return publicationDate;
	}
    
    //	Setters
    public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}
    public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
    public void setPublicationDate(String publicationDate) {
		this.publicationDate = publicationDate;
	}
    
    // Abstract method to be implemented by subclasses
    public abstract void display();
}
