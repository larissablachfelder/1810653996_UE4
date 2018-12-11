package at.ac.fh_kufstein.uebung_04;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Aufruf
{

    public static void main(String[] args)
    {
        //aufgabe 3

        //118 für das Jahr 2018 da erst ab 1900 die Jahre gezählt  werden; monat -1
        Date datum = new Date(118, 9, 2, 14, 9, 54);
        Book buch = new Book(200, datum , "My Book","125215-12521-73473");

        //ausgeben
        System.out.println("Das Buch hat " + buch.getPages() + ", wurde am " + datum + " veröffentlicht und hat den Titel " + buch.getTitle() + ".") ;




        //aufgabe 4

        //ich erstelle eine Liste namens liebling
        List<Book> liebling = new ArrayList<>();

        //ich erstelle 5 neue variablen und füge  sie der Liste hinzu
        liebling.add(new Book(200, datum, "Before I go to sleep", "345894-458485-4324"));
        liebling.add(new Book(160, datum, "Drowning Pool", "43556-47757395-24254"));
        liebling.add(new Book(30, datum, "Nur ein kleiner Gefallen", "385063-355523-345562"));
        liebling.add(new Book(597, datum, "Stirb mein Prinz", "358673-124423512-348743848"));
        liebling.add(new Book(234, datum, "Isola", "6723542-523356236-23643265"));

        System.out.println("Aufgabe 4:");

        //Instanzenname und zählervariable und listenname
        for(Book i : liebling){
            System.out.println(i.getTitle()+ " hat "+ i.getPages()+ " Seiten und folgende ISBN: "+i.getIsbn());
        }
    }
}
