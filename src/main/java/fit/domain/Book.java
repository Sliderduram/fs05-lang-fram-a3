package fit.domain;

public class Book {
    private String title;
    private int edition;
    private Autor autor;
    
    public Book(String title, int edition, Autor autor) {
        this.title = title;
        this.edition = edition;
        this.autor = autor;
    }
    

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }
}
