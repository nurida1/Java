package day41_Inheritance;

public class _3Ebook extends _3Book {
    /*
    title (inherited)
    author (inherited)
    price (inherited)
    size (declared b)
    pages (declared b)
    readbook (decalred bellow)
    toString() (inherited)
     */

    public String size;
    public int pages;

    public void readbook () {
        System.out.println("reading " + title);
    }

}




