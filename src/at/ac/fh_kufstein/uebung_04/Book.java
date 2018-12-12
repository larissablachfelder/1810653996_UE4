package at.ac.fh_kufstein.uebung_04;

import java.util.Date;

public class Book
{
    //variablen  festlegen --> referenzvariablen
   private int pages;
   private Date released;
   private  String title;
   private String isbn;

    //Konstruktor  --> Werte werden auf die Referenzvariablen gespeichert
    public  Book(int pages, Date released, String title,  String isbn)
    {
        this.pages = pages;
        this.released  = released;
        this.title = title;
        this.isbn = isbn;
    }



    //getter und setter  für alle 4 variablen
    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Date getReleased() {
        return released;
    }

    public void setReleased(Date released) {
        this.released = released;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }



}
