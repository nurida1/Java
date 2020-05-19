package day41_Inheritance;

public class _3BooksObjects {

    public static void main(String[] args) {

        _3Ebook book1 = new _3Ebook();
        book1.title = " Hamlet ";
        book1.author = " Shakespeare ";
        book1.price = 20;

        book1.size = "1.5MB";
        book1.pages = 432;

        System.out.println(book1);
        System.out.println("Size: " + book1.size);
        System.out.println("pages: " + book1.pages );

        book1.readbook();

        System.out.println("=====================================");

        _3AudioBook book2 = new _3AudioBook();
        book2.title = "Becoming";
        book2.author = "Mechelle Obama";
        book2.price = 30;
        book2.length = "19 hours and 3 minutes";

        System.out.println(book2);
        System.out.println("Length of the audioBook: \"" +book2.title + "\" is " + book2.length);

        book2.listen();


    }



}


