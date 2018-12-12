package at.ac.fh_kufstein.uebung_04;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Aufruf
{

    public static void main(String[] args)
    {
        //aufgabe 3
        System.out.println("\nAufgabe 3:");

        //118 für das Jahr 2018 da erst ab 1900 die Jahre gezählt -->   werden; monat -1 weil er mit 0 zählen beginnt
        Date datum = new Date(118, 9, 2, 14, 9, 54);
        Book buch = new Book(200, datum , "My Book","125215-12521-73473");

        //ausgeben
        System.out.println("Das Buch hat " + buch.getPages() + ", wurde am " + buch.getReleased() + " veröffentlicht und hat den Titel " + buch.getTitle() + ".") ;




        //aufgabe 4
        System.out.println("\nAufgabe 4:");


        //ich erstelle eine Liste namens liebling
        List<Book> liebling = new ArrayList<>();

        //ich erstelle 5 neue variablen und füge  sie der Liste hinzu
        liebling.add(new Book(200, new Date(), "Before I go to sleep", "345894-458485-4324")); //das heutige Datum
        liebling.add(new Book(160, datum, "Drowning Pool", "43556-47757395-24254")); //das datum das auf diese variable definiert wurde
        liebling.add(new Book(30, datum, "Nur ein kleiner Gefallen", "385063-355523-345562"));
        liebling.add(new Book(597, datum, "Stirb mein Prinz", "358673-124423512-348743848"));
        liebling.add(new Book(234, datum, "Isola", "6723542-523356236-23643265"));



        //Instanzenname und zählervariable und listenname
        for(Book i : liebling){
            System.out.println(i.getTitle()+ " hat "+ i.getPages()+ " Seiten und folgende ISBN: "+i.getIsbn() );
        }


        //Aufgabe 5 Paperbook
        System.out.println("\nAufgabe 5:");

        //List ist eine abstrakte klassse --> arrayliste erbt von der Liste sozusagen
        List<Paperbook> papierbuch = new ArrayList<>();


        papierbuch.add(new Paperbook(134, new Date(), "Kammer des Schreckens", "Harry Potter", "Jänner"));
        papierbuch.add(new Paperbook(233, new Date(), "Der Hobbit", "Der Hobbit", "Februar"));
        papierbuch.add(new Paperbook(124, new Date(), "Mockingjay Teil 1", "Die Tribute von Panem", "Oktober"));
        papierbuch.add(new Paperbook(245, new Date(), "Stein der Weisen", "Harry Potter", "Dezember"));
        papierbuch.add(new Paperbook(546, new Date(), "Hunger Games", "Die Tribute von Panem", "Juni"));


        //Instanzenname und zählervariable und listenname
        for (Paperbook j : papierbuch){
            System.out.println(j.getTitle()+ " hat "+ j.getPages()+" Seiten und folgende ISBN: "+ j.getIsbn()+ " zusätzlich ist es im Monat "+j.getMonth()+" erschienen");
        }





    }
}
