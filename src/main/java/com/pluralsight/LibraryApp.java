package com.pluralsight;

import java.util.Scanner;

public class LibraryApp {

    private static Book[] catalog = new Book[20];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        addBooks();
        homeScreen();
    }

    private static void addBooks() {
        catalog[0] = new Book(1, "978-0-123456-01-1", "The Great Gatsby");
        catalog[1] = new Book(2, "978-0-123456-02-2", "To Kill a Mockingbird");
        catalog[2] = new Book(3, "978-0-123456-03-3", "1984");
        catalog[3] = new Book(4, "978-0-123456-04-4", "Pride and Prejudice");
        catalog[4] = new Book(5, "978-0-123456-05-5", "The Hobbit");
        catalog[5] = new Book(6, "978-0-123456-06-6", "Moby Dick");
        catalog[6] = new Book(7, "978-0-123456-07-7", "War and Peace");
        catalog[7] = new Book(8, "978-0-123456-08-8", "Hamlet");
        catalog[8] = new Book(9, "978-0-123456-09-9", "The Odyssey");
        catalog[9] = new Book(10, "978-0-123456-10-0", "The Catcher in the Rye");
        catalog[10] = new Book(11, "978-0-123456-11-1", "Jane Eyre");
        catalog[11] = new Book(12, "978-0-123456-12-2", "Brave New World");
        catalog[12] = new Book(21, "978-0-123456-21-1", "The Autobiography of Malcolm X"); // Replaced
        catalog[13] = new Book(14, "978-0-123456-14-4", "Wuthering Heights");
        catalog[14] = new Book(22, "978-0-123456-22-2", "Webster's Dictionary"); // Replaced
        catalog[15] = new Book(16, "978-0-134456-16-6", "Crime and Punishment");
        catalog[16] = new Book(17, "978-0-123456-17-7", "Dracula");
        catalog[17] = new Book(18, "978-0-123456-18-8", "Frankenstein");
        catalog[18] = new Book(19, "978-0-123456-19-9", "The Scarlet Letter");
        catalog[19] = new Book(20, "978-0-123456-20-0", "Alice in Wonderland");
    }

    private static void homeScreen(){
        while (true){
            System.out.println("\n  Book Store  ");
            System.out.println("1.Show Available Books");
            System.out.println("2.Show Checked out Books");
            System.out.println("3. Exit");
            System.out.print("Select an option: ");

            String choose = scanner.nextLine();

            switch (choose){
                case "1":
                    showAvailableBooks();
                    break;
                case "2":
                    showCheckedOutBooks();
                    break;
                case "3":
                    System.out.println("Goodbye");
                    return;
                default:
                    System.out.println("Option Invalid!");
            }
        }
    }
    private static void showAvailableBooks() {
        System.out.println("\n     Available Books    ");

        boolean obtainable = false;

        for (Book b : catalog) {
            if (!b.isCheckedOut()) {
                System.out.println(b.toString());
                obtainable = true;
            }
        }
        if (!obtainable) {
            System.out.println("There are no books available.");
            return;
        }

        System.out.println("\nEnter Book ID to checkout or X out to return: ");
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("X")) return;

        try{
            int id = Integer.parseInt(input);
            Book book = findBookId(id);

            if (book == null) {
                System.out.println("Invalid book ID.");
            } else if (book.isCheckedOut()) {
                System.out.println("Book is already checked out.");
            } else {
                System.out.println("Enter your name: ");
                String name = scanner.nextLine();
                book.checkOut(name);
                System.out.println("Book checked out successfully!");
            }
        } catch (NumberFormatException e) {
            System.out.println("Input invalid! please enter a number.");
        }
    }

    private static void showCheckedOutBooks() {
        System.out.println("\n     Checked Out Books    ");

        boolean borrowed = false;

        for (Book b : catalog) {

            if (b.isCheckedOut()) {
                System.out.println(b.toString());
                borrowed = true;
            }
        }
        if (!borrowed) {
            System.out.println("There are no books checked out.");
            return;
        }

        System.out.println("\nEnter Book ID to check in or X to return: ");  // 🟣 FIX: Corrected prompt
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("X")) {
            return;
        }

        try{
            int id = Integer.parseInt(input);
            Book book = findBookId(id);

            if (book == null) {
                System.out.println("Invalid book ID.");
            } else if (!book.isCheckedOut()) {
                System.out.println("The book is not checked out.");
            }else {
                book.checkIn();
                System.out.println("Book checked in successfully!");
            }
        } catch (NumberFormatException e) {
            System.out.println("Input invalid! please enter a number.");
        }
    }

    private static Book findBookId (int id) {
        for (Book b : catalog) {
            if (b.getId() == id) {
                return b;
    }
}

return null;
    }
}



