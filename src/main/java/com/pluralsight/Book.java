package com.pluralsight;

public class Book {
    private int id;
    private String isbn;
    private String title;
    private String checkedOutTo;
    private boolean isCheckedOut;

    public Book(int id, String isbn, String title) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.checkedOutTo = "";
        this.isCheckedOut = false;
    }

    public int getId() {
        return id;
    }
    public String getIsbn() {
        return isbn;
    }
    public String getTitle() {
        return title;
    }
    public String getCheckedOutTo() {
        return checkedOutTo;
    }
    public boolean isCheckedOut() {
        return isCheckedOut;
    }


    public void checkOut(String name) {
        if (!isCheckedOut) {
            isCheckedOut = true;
            checkedOutTo = name;
            System.out.println(title + " has been checked out to " + name);
        } else {
            System.out.println(title + " already has been checked out");
        }
    }
    public void checkIn() {
        if (isCheckedOut) {
            isCheckedOut = false;
            checkedOutTo = "";
            System.out.println(title + " has been checked in");
        } else {
            System.out.println(title + " has not been checked out");
        }
    }

    public String toString(){
        if (isCheckedOut)
            return String.format("%d | %s | %s | Checked out to: %s", id, isbn, title, checkedOutTo);
        else
            return String.format("%d | %s | %s", id, isbn, title);
    }
}