public class Exhibit {

    Author author;
    String title;
    String date;
    String md5;
    
    public Exhibit(Author author, String title, String date) {
        this.author = author;
        this.title = title;
        this.date = date;

    }

    public void setMD5(String md5) {
        this.md5 = md5;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Exhibit{" +
                "author=" + author +
                ", title='" + title + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
