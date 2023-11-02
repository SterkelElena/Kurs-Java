package homework.book.model;
public class Dictionary extends Book{
    private String language;

    public Dictionary(String title, String author, int year, String ISBN, String language) {
        super(title, author, year, ISBN);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
    public void display() {
        super.display();
        System.out.println("Language: " + language);
    }
}
