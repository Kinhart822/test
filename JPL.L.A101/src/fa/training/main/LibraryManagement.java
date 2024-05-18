/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package fa.training.main;

import java.util.Scanner;
import fa.training.entities.Book;
import fa.training.entities.Magazine;
import fa.training.services.Functional_Requirements;

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Functional_Requirements library = new Functional_Requirements();
        Scanner input = new Scanner(System.in);
        
        int choice;
        while (true) {
            System.out.println("Menu\n====== LIBRARY MANAGEMENT SYSTEM ======");
            System.out.println("1. Add a book");
            System.out.println("2. Add a magazine");
            System.out.println("3. Display books and magazines");
            System.out.println("4. Add author to book");
            System.out.println("5. Display top 10 of magazines by volume");
            System.out.println("6. Search book by (isbn, author, publisher)");
            System.out.println("Please choose function you'd like to do:");
            
            choice = input.nextInt();
            input.nextLine();
            
            switch (choice) {
                case 1:
                    // Add a book
                    System.out.println("Enter publication year:");
                    int bookPublicationYear = input.nextInt();
                    input.nextLine(); // Consume newline
                    System.out.println("Enter publisher:");
                    String bookPublisher = input.nextLine();
                    System.out.println("Enter publication date (dd/mm/yyyy):");
                    String bookPublicationDate = input.nextLine();
                    System.out.println("Enter ISBN:");
                    String isbn = input.nextLine();
                    System.out.println("Enter author:");
                    String bookAuthor = input.nextLine();
                    System.out.println("Enter publication place:");
                    String publicationPlace = input.nextLine();
                    Book book = new Book(bookPublicationYear, bookPublisher, bookPublicationDate, isbn, bookAuthor, publicationPlace);
                    library.addBook(book);
                    break;
                case 2:
                    // Add a magazine
                    System.out.println("Enter publication year:");
                    int magazinePublicationYear = input.nextInt();
                    input.nextLine(); // Consume newline
                    System.out.println("Enter publisher:");
                    String magazinePublisher = input.nextLine();
                    System.out.println("Enter publication date (dd/mm/yyyy):");
                    String magazinePublicationDate = input.nextLine();
                    System.out.println("Enter author:");
                    String magazineAuthor = input.nextLine();
                    System.out.println("Enter volume:");
                    int volume = input.nextInt();
                    System.out.println("Enter edition:");
                    int edition = input.nextInt();
                    Magazine magazine = new Magazine(magazinePublicationYear, magazinePublisher, magazinePublicationDate, magazineAuthor, volume, edition);
                    library.addMagazine(magazine);
                    break;
                case 3:
                    // Display books and magazines
                	 System.out.println("Books:");
                	 for (Book bookItem : library.getBooks()) {
                		 library.displayBookPublications(bookItem.getPublicationYear(), bookItem.getPublisher());
                	 }
                	 System.out.println("Magazines:");
                	 for (Magazine magazineItem : library.getMagazines()) {
                		 library.displayMagazinePublications(magazineItem.getPublicationYear(), magazineItem.getPublisher());
                	 }
                	 break;
                case 4:
                    // Add author to book
                    System.out.println("Enter ISBN of the book:");
                    isbn = input.nextLine();
                    System.out.println("Enter author to add:");
                    bookAuthor = input.nextLine();
                    library.addAuthorToBook(isbn, bookAuthor);
                    break;
                case 5:
                    // Display top 10 of magazines by volume
                    library.displayTop10Magazines();
                    break;
                case 6:
                    // Search book by (isbn, author, publisher)
                    System.out.println("Enter search criteria (isbn, author, publisher):");
                    String searchCriteria = input.nextLine();
                    System.out.println("Enter search value:");
                    String searchValue = input.nextLine();
                    library.searchBook(searchCriteria, searchValue);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
            
            System.out.println("Do you want to continue? (yes/no)");
            String continueChoice = input.nextLine();
            if (!continueChoice.equalsIgnoreCase("yes")) {
                break;
            }
        }
        
        input.close();
	}

}
