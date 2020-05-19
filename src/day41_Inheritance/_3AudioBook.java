package day41_Inheritance;

public class _3AudioBook extends _3Book {
    /*
    title (inherited)
    author (inherited)
    price (inherited)

    length  (to decalred) instance variable
    listen() (to declare) instance method

    toString() (inherited) instance method
     */

    public String length;

    public void listen () {
        System.out.println("Listenning to " + title);
    }








}
