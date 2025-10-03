package com.pluralsight;

public class Book {
    private int id;
    private String title;
    private String location;
    private String checkedOutTo;
    private boolean isCheckedOut;

    public Book(int id, String title, String Location) {
        this.id = id;
        this.title = title;
        this.location = location;
        this.checkedOutTo = "";
        this.isCheckedOut = false;
    }
}
