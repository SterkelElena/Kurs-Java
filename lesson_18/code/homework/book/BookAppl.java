package homework.book;

import homework.book.model.Dictionary;

public class BookAppl {
    public static void main(String[] args) {
        Dictionary dictionary1 = new Dictionary("Cambridge Dictionary", "Kate Woodford", 2003, "0521824230", "English" );
        Dictionary dictionary2 = new Dictionary("German Dictionary", "Konrad Duden", 1880, "978-3411010417", "German");

        System.out.println("Dictionary 1:");
        dictionary1.display();
        System.out.println("========================================");

        System.out.println("Dictionary 2:");
        dictionary2.display();
        System.out.println("========================================");
    }
}
