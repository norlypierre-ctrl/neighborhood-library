package com.pluralsight;

import java.util.Scanner;

public class LibaryApp {

    private static Book[] catalog = new Book[20];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        addBooks;
        homeScreen;
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
}
