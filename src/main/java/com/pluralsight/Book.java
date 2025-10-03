package com.pluralsight;

public class Book {
    private int id;
    private String title;
    private String location;
    private String checkedOutTo;
    private boolean isCheckedOut;


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getCheckedOutTo() {
        return checkedOutTo;
    }
    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }
    public boolean isCheckedOut() {
        return isCheckedOut;
    }
    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }
}






